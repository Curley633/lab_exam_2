/*
    Name: James Curley
    Email: g00262917@gmit.ie
    Date: 09/03/2020
    Description: This is the EmployeeList class
*/

package ie.gmit;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeListTest {
    Employee myEmployee;
    EmployeeList myList;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing: " + testInfo.getDisplayName());
        myEmployee = new Employee("James Curley", "08712345", "24689", 17);
        myList = new EmployeeList();
    }

    @Test
    @DisplayName("Add Employee Test")
    void testAddEmployee()
    {
        EmployeeList.addEmployee(myEmployee);
        assertEquals(myEmployee, EmployeeList.addEmployee(myEmployee));
    }
//    @Test
//    @DisplayName("Add Employee Test")
//    void testGetListSize()
//    {
//        Employee myEmployee2 = new Employee("joe Curley", "08712346", "12346", 18);
//        EmployeeList.addEmployee(myEmployee);
//        assertEquals(2, EmployeeList.getListSize(myList));
//    }
}
