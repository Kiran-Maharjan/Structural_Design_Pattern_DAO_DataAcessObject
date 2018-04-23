/*
--This code filter male or female employeess.
*/

/*--Data Access--CRUD operation --filter pattern

Intercepting filter pattern. Intercepting Filter is a JavaEE pattern which 
creates pluggable filters to process common services in a standard manner without
requiring changes tocore request processing code.
 */

//---it reducable, prevent use of if,else 
 /*
** *****************kiranmaharjan8888@gmail.com

 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.dao.EmployeeDAO;
import com.kingkong.dataabstraction.dao.EmployeeMediator;
import com.kingkong.dataabstraction.entities.Employee;
import com.kingkong.dataabstraction.filter.EmployeeFemaleFilter;
import com.kingkong.dataabstraction.filter.EmployeeFilter;
import com.kingkong.dataabstraction.filter.EmployeeMaleFilter;
import com.kingkong.dataabstraction.impl.EmployeeDAOimpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {

        EmployeeDAO empDAO = new EmployeeDAOimpl();
        empDAO.insert(new Employee(0, "Kriti", "Maharjan", 'F', true));
        empDAO.insert(new Employee(1, "Ashish", "Maharjan", 'M', true));
        empDAO.insert(new Employee(2, "Amooda", "Maharjan", 'F', true));
        empDAO.insert(new Employee(3, "Beekesh", "Maharjan", 'M', true));
        
        //--filter 
        System.out.println("Male filter");
        EmployeeFilter filter=new EmployeeMaleFilter();
        EmployeeMediator.print(filter.getFilter(empDAO.getAll()));
        
        System.out.println("Female filter");
        filter=new EmployeeFemaleFilter();
        EmployeeMediator.print(filter.getFilter(empDAO.getAll()));
        
        /*  --either
        List<Employee> m_lst=filter.getFilter(empDAO.getAll());
        EmployeeMediator.print(m_lst);
        */
        
    
    }
}
