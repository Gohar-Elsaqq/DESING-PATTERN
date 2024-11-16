package adapter;

public class AdapterExample {
    public static void main(String[] args) {
        //Creating an object from the old system

        EmployeeOldSystem oldEmployee = new EmployeeOldSystem("Ahmed", 1060415152);

        //Use the converter to get a new interface

        NewEmployeeInterface newEmployee = new EmployeeAdapter(oldEmployee);

        //Data printing using the new interface

        System.out.println("Employee Name: " + newEmployee.getEmployeeName());
        System.out.println("Employee Phone Number: " + newEmployee.getPhoneNumber());
    }
    //OUT PUT
    // Employee Name: Ahmed
    //Employee Phone Number: 0101234
}
