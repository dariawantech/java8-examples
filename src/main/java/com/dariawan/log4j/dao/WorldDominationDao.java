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
package com.dariawan.log4j.dao;

import java.text.MessageFormat;
import org.apache.log4j.Logger;

public class WorldDominationDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    public void divide(int number1, int number2) {
        logger.debug("Run divide method");

        String message;
        try {
            int number = number1 / number2;
            if (logger.isDebugEnabled()) {
                message = MessageFormat.format("Info: {0} / {1} = {2}", number1, number2, number);
                logger.debug(message);
            }
        } catch (ArithmeticException e) {
            message = MessageFormat.format("Error: Cannot divide two number {0} / {1}", number1, number2);
            logger.error(message, e);
        }
    }

    public void conquer(int days) {
        logger.debug("Run conquer method");

        if (days < 0) {
            throw new IllegalArgumentException("Days must be greater than zero");
        } else {
            if (logger.isInfoEnabled()) {
                logger.debug(MessageFormat.format("Take over the world in {0} days", days));
            }
        }
    }

    public void destroy() {
        throw new IllegalStateException("Cannot run destroy method");
    }
}
