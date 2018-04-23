/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.filter;

import com.kingkong.dataabstraction.entities.Employee;
import com.kingkong.dataabstraction.impl.EmployeeDAOimpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class EmployeeMaleFilter implements EmployeeFilter{
    List<Employee> emplist=new ArrayList<>();
    //EmployeeDAOimpl empimp=new EmployeeDAOimpl();
    @Override
    public List<Employee> getFilter(List<Employee> coll) {
        for(Employee e:coll)
        {
            if(e.getGender()=='M'){
                emplist.add(e);
            }
        }
        return emplist;
    }

   
}
