package telran.company.service;

import java.util.Arrays;
import java.util.function.Predicate;

import telran.company.dto.Employee;

public class Company {
telran.company.dto.Employee[]employees=new telran.company.dto.Employee[0];
public boolean hire(telran.company.dto.Employee empl) {
	if(getEmployee(empl.getId())!=null) {
		return false;
	}
	employees= java.util.Arrays.copyOf(employees,employees.length+1);
	employees[employees.length-1]=empl;
	return true;
}
public telran.company.dto.Employee getEmployee(long id) {
	for(int i=0; i<employees.length; i++) {
		if(employees[i].getId()==id) {
			return employees[i];
		}
	}
	return null;
}
public boolean fire(long id) {
	for(int i=0; i<employees.length; i++) {
		if(employees[i].getId()==id) {
			telran.company.dto.Employee tmpEmployees[]=
					new telran.company.dto.Employee[employees.length-1];
			System.arraycopy
		(employees, 0, tmpEmployees, 0, i);
			System.arraycopy
			(employees, i+1, tmpEmployees, i,
					tmpEmployees.length-i);
			employees = tmpEmployees;
			return true;
		}
	}
	return false;
}
public telran.company.dto.Employee[] getEmployeesBySalary(int salaryFrom, int salaryTo) {
	telran.company.dto.Employee[]tmpEmployees = new telran.company.dto.Employee[employees.length];
	int indTmp=0;
	for(int i=0; i<employees.length; i++) {
		int salary = employees[i].getSalary();
		if(salary >= salaryFrom && salary <= salaryTo) {
			tmpEmployees[indTmp++]=employees[i];
		}
	}
	return java.util.Arrays.copyOf(tmpEmployees, indTmp);
}
public telran.company.dto.Employee[] getEmployeesByDepartment(String department) {
	telran.company.dto.Employee[]tmpEmployees = new telran.company.dto.Employee[employees.length];
	int indTmp=0;
	for(int i=0; i<employees.length; i++) {
		if(employees[i].getDepartment().equalsIgnoreCase(department)){
			tmpEmployees[indTmp++]=employees[i];
		}
	}
	return java.util.Arrays.copyOf(tmpEmployees, indTmp);
}
public telran.company.dto.Employee[] getEmployeesByTitle(String title) {
	return getEmployeesByPredicate
			(new PredicateTitle(title));
}
private telran.company.dto.Employee[] getEmployeesByPredicate
(java.util.function.Predicate<telran.company.dto.Employee> predicate) {
	telran.company.dto.Employee []tmpEmployees=new telran.company.dto.Employee[employees.length];
	int indTmp=0;
	for(int i=0; i<employees.length; i++) {
		if(predicate.test(employees[i])) {
			tmpEmployees[indTmp++]=employees[i];
		}
	}
	return java.util.Arrays.copyOf(tmpEmployees, indTmp);
}
public telran.company.dto.Employee[] getEmployeesSalarySortedDesc() {
	telran.company.dto.Employee[] res= java.util.Arrays.copyOf(employees, employees.length);
	java.util.Arrays.sort(res,new SalaryDescComparator());
	return res;
}
}
