package com.java.concepts;

import java.util.Objects;

final class ParentDetails implements  Cloneable
{
    private final String motherName;
    private final String fatherName;

    public ParentDetails(String motherName,String fatherName ){
        this.motherName=motherName;
        this.fatherName=fatherName;

    }

    public  String getMotherName(){
        return this.motherName;
    }
    public  String getFatherName(){
        return this.fatherName;
    }

    @Override
    protected ParentDetails clone()
    {
        try {
            return (ParentDetails)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentDetails that = (ParentDetails) o;
        return motherName.equals(that.motherName) &&
                fatherName.equals(that.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motherName, fatherName);
    }
}
final class Employee
{
    private final int id;
    private final String name;
    private final ParentDetails parentDetails;



    public Employee(int id, String name, ParentDetails parentDetails)
   {
       this.id=id;
       this.name=name;
       this.parentDetails=new ParentDetails(parentDetails.getMotherName(),parentDetails.getFatherName());
   }

    public  int getId(){
        return this.id;
    }
    public  String getName(){
        return this.name;
    }

    public ParentDetails getParentDetails()  {
       return this.parentDetails.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name) &&
                parentDetails.equals(employee.parentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentDetails);
    }

}

public class EmployeeImmutable {

    public static void main(String[] args) {
        // write your code here
    }
}
