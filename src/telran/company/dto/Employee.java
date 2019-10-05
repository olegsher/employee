package telran.company.dto;

import java.time.LocalDate;


public class Employee {
    long id;
    int salary;
    String department;
    String title;
    String name;

    String gender;
    // LocalDate from class java.time.Localdate
    LocalDate employeeBirthDay;
    LocalDate employeeStartJob;

    public Employee(long id, int salary,
                    String department, String title,
                    String name, LocalDate employeeBirthDay,
                    LocalDate employeeStartJob, String gender) {

        this.id = id;
        this.salary = salary;
        this.department = department;
        this.title = title;
        this.name = name;
        this.employeeBirthDay = LocalDate.MIN; // if value is not set, the System.out.println(LocalDate.MIN) == -9999999-01-01 - wrong number
        this.employeeStartJob = LocalDate.MIN; // if value is not set, the System.out.println(LocalDate.MIN) == -9999999-01-01 - wrong number
        this.gender = "Not set";


    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Getters for employee Birthday and startJob
    public java.time.LocalDate getEmployeeBirthDay() {
        return employeeBirthDay;
    }

    //Setters for employee Birthday and startJob
    public void setEmployeeBirthDay(java.time.LocalDate employeeBirthDay) {
        this.employeeBirthDay = employeeBirthDay;
    }

    public java.time.LocalDate getEmployeeStartJob() {
        return employeeStartJob;
    }

    public void setEmployeeStartJob(java.time.LocalDate employeeStartJob) {
        this.employeeStartJob = employeeStartJob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + salary;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        telran.company.dto.Employee other = (telran.company.dto.Employee) obj;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        if (title == null) {
            return other.title == null;
        } else return title.equals(other.title);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + ", department=" + department + ", title=" + title + ", name="
                + name + "]";
    }

}
