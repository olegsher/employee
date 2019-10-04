package telran.company.service;

import java.util.Comparator;

import telran.company.dto.Employee;

public class SalaryDescComparator implements java.util.Comparator<telran.company.dto.Employee> {

	@Override
	public int compare(telran.company.dto.Employee o1, telran.company.dto.Employee o2) {
		
		return o1.getSalary()-o2.getSalary();
	}

	

}
