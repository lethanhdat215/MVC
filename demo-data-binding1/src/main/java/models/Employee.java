package models;

public class Employee {
    private String employeeName;
    private String employeeSex;
    private String employeeAddress;
    private int employeeAge;

    public Employee(String employeeName, String employeeSex, String employeeAddress, int employeeAge) {
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeAddress = employeeAddress;
        this.employeeAge = employeeAge;
    }

    public Employee() {

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
}
