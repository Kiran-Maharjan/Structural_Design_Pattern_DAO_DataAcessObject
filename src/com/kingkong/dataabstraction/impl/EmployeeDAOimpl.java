/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.impl;

import com.kingkong.dataabstraction.dao.EmployeeDAO;
import com.kingkong.dataabstraction.entities.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class EmployeeDAOimpl implements EmployeeDAO {

    List<Employee> emptyList = new ArrayList<>();

    @Override
    public boolean insert(Employee e) {

        return emptyList.add(e);

    }

    @Override
    public boolean update(Employee e) {
        return emptyList.add(e);
    }

    @Override
    public Employee getById(int id) {
        if (emptyList.get(id) == null) {
            return null;

        }
        return emptyList.get(id);

    }

    @Override
    public List<Employee> getAll() {
        return emptyList;
    }

    @Override
    public boolean delete(int id) {
        if (emptyList.get(id) == null) {
            return false;

        }
        return emptyList.remove(emptyList.get(id));

    }

}
