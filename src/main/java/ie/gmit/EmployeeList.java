/*
    Name: James Curley
    Email: g00262917@gmit.ie
    Date: 09/03/2020
    Description: This is the EmployeeList class
*/

package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    private static ArrayList<Employee> list;

    public static Employee addEmployee(Employee myEmployee)
    {
        System.out.println(myEmployee.getName());
        if(list.contains(myEmployee.getEmployeeNumber())) {
            throw new IllegalArgumentException("Employee already exists");
        } else {
            System.out.println("in add Employee else");
            list.add(myEmployee);
            return myEmployee;
        }
    }

//    public static int getListSize(EmployeeList myList)
//    {
//        for(Employee myEmployee: list) {
//
//        }
//        int listSize = list.size();
//        return listSize;
//    }
}
