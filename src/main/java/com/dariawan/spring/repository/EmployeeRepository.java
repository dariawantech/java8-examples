/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.spring.repository;

import com.dariawan.spring.domain.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
    String url = "jdbc:oracle:thin:@dariawan:1524:humancapital";
    String username = "buttler";
    String password = "coffeebreak";
    String insertSql = "INSERT INTO employee values (?, ?, ?, ?)";
    
    public void save(Employee emp) throws SQLException{
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement ps = conn.prepareStatement(insertSql);
            ps.setString(1, emp.getName());
            ps.setDate(2, new java.sql.Date(emp.getBirthDate().getTime()));
            ps.setDate(3, new java.sql.Date(emp.getJoinDate().getTime()));
            ps.setString(4, emp.getStatus().name());
            ps.executeUpdate();
        }
    }
    
    public void saveMap(Map<String, Object> mapEmp) throws Exception{
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement ps = conn.prepareStatement(insertSql);
            int i = 0;
            for (String key : mapEmp.keySet()) {
                i++;
                ps.setObject(i, mapEmp.get(key));
            }
            ps.executeUpdate();
        }
    }
}
