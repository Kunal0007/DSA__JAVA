package com.company.DSA__JAVA;

class Employee{
    int id;
    String name;
    int salary = 100;
    void getdetails(){
        System.out.println("Id of Employee is " + id);
        System.out.println("Name of Employee is " + name);
        System.out.println("Salary of Employee is " + salary);
    }

    void setSalary(int s){
        salary = s;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a Custom Class in Java");

        Employee kunal = new Employee();

        kunal.id = 1;
        kunal.name = "Kunal Patil";

        kunal.setSalary(1000);
        kunal.getdetails();

        Employee niraj = new Employee();

        niraj.id = 2;
        niraj.name = "Niraj Patil";

        niraj.getdetails();
    }
}
