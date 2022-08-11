package DesignPatterns.Creational.Builder;
/*
https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java
 */
public class EmployeeBuilderClient {

    public static void main(String[] args)
    {
        Employee emp=  new Employee.EmployeeBuilder()
                .setId(1)
                .setName("harsh")
                .setRollNo("786")
                .build();

    }
}
