/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to: # Share - copy and redistribute the
 * material in any medium or format # Adapt - remix, transform, and build upon
 * the material for any purpose, even commercially.
 *
 * The licensor cannot revoke these freedoms as long as you follow the license
 * terms.
 *
 * License terms: # Attribution - You must give appropriate credit, provide a
 * link to the license, and indicate if changes were made. You may do so in any
 * reasonable manner, but not in any way that suggests the licensor endorses you
 * or your use. # ShareAlike - If you remix, transform, or build upon the
 * material, you must distribute your contributions under the same license as
 * the original. # No additional restrictions - You may not apply legal terms or
 * technological measures that legally restrict others from doing anything the
 * license permits.
 *
 * Notices: # You do not have to comply with the license for elements of the
 * material in the public domain or where your use is permitted by an applicable
 * exception or limitation. # No warranties are given. The license may not give
 * you all of the permissions necessary for your intended use. For example,
 * other rights such as publicity, privacy, or moral rights may limit how you
 * use the material.
 *
 * You may obtain a copy of the License at
 * https://creativecommons.org/licenses/by-sa/4.0/
 * https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.http;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class ApacheHttpClientExample {

    private final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36";

    private HttpClient getHttpClient() throws Exception {
        RequestConfig.Builder requestBuilder = RequestConfig.custom();

        HttpClientBuilder builder = HttpClientBuilder.create();
        builder.setDefaultRequestConfig(requestBuilder.build());
        builder.setSSLSocketFactory(SSLUtil.getInsecureSSLConnectionSocketFactory());
        HttpClient httpClient = builder.build();
        return httpClient;
    }

    private void testGet() throws Exception {
        System.out.println("*** Test Http GET request ***");

        String url = "https://www.onlinefreeconverter.com/random-words?n=15";
        HttpGet request = new HttpGet(url);
        // add request headers
        request.addHeader(HttpHeaders.USER_AGENT, USER_AGENT);

        HttpClient client = getHttpClient();
        HttpResponse response = client.execute(request);

        System.out.println("GET request to URL: " + url);
        System.out.println("Response Status   : " + response.getStatusLine().toString());

        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);
    }

    private void testPost() throws Exception {
        System.out.println("*** Test Http POST request ***");

        String url = "https://www.onlinefreeconverter.com/test/post";

        HttpPost request = new HttpPost(url);

        // String urlParameters = "param1=a&param2=b&param3=c";
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("param1", "a"));
        urlParameters.add(new BasicNameValuePair("param2", "b"));
        urlParameters.add(new BasicNameValuePair("param3", "c"));

        request.setEntity(new UrlEncodedFormEntity(urlParameters));
        request.addHeader(HttpHeaders.USER_AGENT, USER_AGENT);
        request.addHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        // request.addHeader("charset", "utf-8");

        HttpClient client = getHttpClient();
        HttpResponse response = client.execute(request);
        System.out.println("POST request to URL: " + url);
        System.out.println("POST Parameters    : " + urlParameters.toString());
        System.out.println("Response Status    : " + response.getStatusLine().toString());

        System.out.println(EntityUtils.toString(response.getEntity()));
    }

    public static void main(String[] args) throws Exception {
        ApacheHttpClientExample obj = new ApacheHttpClientExample();
        obj.testGet();
        obj.testPost();
    }

    private static class SSLUtil {

        protected static SSLConnectionSocketFactory getInsecureSSLConnectionSocketFactory()
                throws KeyManagementException, NoSuchAlgorithmException {
            final TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    @Override
                    public void checkClientTrusted(
                            final java.security.cert.X509Certificate[] arg0, final String arg1)
                            throws CertificateException {
                        // do nothing and blindly accept the certificate
                    }

                    @Override
                    public void checkServerTrusted(
                            final java.security.cert.X509Certificate[] arg0, final String arg1)
                            throws CertificateException {
                        // do nothing and blindly accept the server
                    }
                }
            };

            final SSLContext sslcontext = SSLContext.getInstance("SSL");
            sslcontext.init(null, trustAllCerts,
                    new java.security.SecureRandom());

            final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext, new String[]{"TLSv1"}, null,
                    SSLConnectionSocketFactory.getDefaultHostnameVerifier());

            return sslsf;
        }
    }
}
