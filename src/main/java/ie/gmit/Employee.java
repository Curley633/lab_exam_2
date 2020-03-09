/*
    Name: James Curley
    Email: g00262917@gmit.ie
    Date: 09/03/2020
    Description: This is the employee class
*/
package ie.gmit;

public class Employee {
    private String name;
    private String phone;
    private String employeeNumber;
    private int age;

    public Employee(String name, String phone, String employeeNumber, int age)
    {
        if(name.length() >= 3 && name.length() <= 25) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name provided is not valid");
        }

        if(phone.length() == 8) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must contain 8 digits");
        }

        if(employeeNumber.length() == 5) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Employee Number must contain 5 digits");
        }

        if(age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Employee must be over the age of 16");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
