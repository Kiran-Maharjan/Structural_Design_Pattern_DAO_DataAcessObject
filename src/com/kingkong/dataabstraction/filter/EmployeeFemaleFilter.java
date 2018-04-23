
package com.kingkong.dataabstraction.filter;

import com.kingkong.dataabstraction.entities.Employee;
import com.kingkong.dataabstraction.impl.EmployeeDAOimpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class EmployeeFemaleFilter implements EmployeeFilter{
    List<Employee> emplist=new ArrayList<>();
    //EmployeeDAOimpl empimp=new EmployeeDAOimpl();
    @Override
    public List<Employee> getFilter(List<Employee> coll) {
        for(Employee e:coll)
        {
            if(e.getGender()=='F'){
                emplist.add(e);
            }
        }
        return emplist;
    }

   
}
