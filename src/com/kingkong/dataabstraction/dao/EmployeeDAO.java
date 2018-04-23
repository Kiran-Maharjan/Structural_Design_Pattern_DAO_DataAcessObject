/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.dao;

import com.kingkong.dataabstraction.entities.Employee;
import java.util.List;

/**
 *
 * @author kiran
 */
public interface EmployeeDAO {
    boolean insert(Employee e);
    boolean update(Employee e);
    Employee getById(int id);
    List<Employee> getAll();
    boolean delete(int id);
    
    
}
