package DesignPatterns.Creational.Builder;

public class Employee {

  private long id;
  private String name;
  private String rollNo;

  private Employee() {}

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getRollNo() {
    return rollNo;
  }

  private void setRollNo(String rollNo) {
    this.rollNo = rollNo;
  }

  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  private Employee(EmployeeBuilder builder) {
    this.setRollNo(builder.rollNo);
    this.setId(builder.id);
    this.setName(builder.name);
  }

  public static class EmployeeBuilder {

    private long id;
    private String name;
    private String rollNo;

    public EmployeeBuilder() {}

    public EmployeeBuilder setId(int id) {
      this.id = id;
      return this;
    }

    public EmployeeBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public EmployeeBuilder setRollNo(String rollNo) {
      this.rollNo = rollNo;
      return this;
    }

    public Employee build() {

      return new Employee(this);
    }
  }
}
