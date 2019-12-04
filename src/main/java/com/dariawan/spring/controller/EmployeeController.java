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
package com.dariawan.spring.controller;

import com.dariawan.spring.domain.Employee;
import com.dariawan.spring.domain.EmployeeStatus;
import com.dariawan.spring.repository.EmployeeRepository;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@RequestBody Map<String, Object> formMap) throws Exception {
        Employee emp = new Employee();
        
        emp.setName(formMap.get("name").toString());
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        emp.setBirthDate(fmt.parse(formMap.get("birthdate").toString()));
        emp.setJoinDate(fmt.parse(formMap.get("joindate").toString()));
        
        emp.setStatus(EmployeeStatus.valueOf(formMap.get("status").toString()));
        
        employeeRepository.save(emp);

        return "employeeView";
    }
    
    @RequestMapping(value = "/addEmployeeArray", method = RequestMethod.POST)
    public String submitMap(@RequestBody Map<String, Object> formMap) throws Exception {
        employeeRepository.saveMap(formMap);
        return "employeeView";
    }
}
