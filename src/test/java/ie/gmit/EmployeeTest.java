/*
    Name: James Curley
    Email: g00262917@gmit.ie
    Date: 09/03/2020
    Description: This is the employee Test class
*/

package ie.gmit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee myEmpoyee;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing: " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Constructor Test")
    void testCstr()
    {
        myEmpoyee = new Employee("James Curley", "08712345", "12345", 17);
        assertEquals("James Curley", myEmpoyee.getName());
        assertEquals("08712345", myEmpoyee.getPhone());
        assertEquals("12345", myEmpoyee.getEmployeeNumber());
        assertEquals(17, myEmpoyee.getAge());
    }

    @Test
    @DisplayName("Name Field Test")
    void testNameField()
    {
        final String nameError = "Name provided is not valid";
        Exception nameExceptoion = assertThrows(IllegalArgumentException.class, () -> new Employee("", "08712345", "12345", 17));
        assertEquals(nameError, nameExceptoion.getMessage());
    }

    @Test
    @DisplayName("Phone field Test")
    void testPhoneField()
    {
        final String phoneError = "Phone must contain 8 digits";
        Exception phoneExceptoion = assertThrows(IllegalArgumentException.class, () -> new Employee("James Curley", "", "12345", 17));
        assertEquals(phoneError, phoneExceptoion.getMessage());
    }

    @Test
    @DisplayName("Employee number field Test")
    void testEmployeeNoField()
    {
        final String employeeNoError = "Employee Number must contain 5 digits";
        Exception employeeNoExceptoion = assertThrows(IllegalArgumentException.class, () -> new Employee("James Curley", "08712345", "", 17));
        assertEquals(employeeNoError, employeeNoExceptoion.getMessage());
    }

    @Test
    @DisplayName("Age field Test")
    void testAgeField()
    {
        final String ageError = "Employee must be over the age of 16";
        Exception ageExceptoion = assertThrows(IllegalArgumentException.class, () -> new Employee("James Curley", "08712345", "12345", 0));
        assertEquals(ageError, ageExceptoion.getMessage());
    }
}
