package telran.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.company.dto.Employee;
import telran.company.service.Company;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTests {

	private static final long ID1 = 1230;
	private static final int SALARY1 = 10000;
	private static final String DEPARTMENT1 = "Development";
	private static final String TITLE1 = "Developer";
	private static final String NAME1 = "name";
	private static final long ID2 = 1500;
	private static final int SALARY2 = 12000;
	private static final String DEPARTMENT2 = "QA";
	private static final String TITLE2 = "Tester";
	private static final String NAME2 = "Sara";
	private static final long ID3 = 1700;
	private static final int SALARY3 = 20000;
	private static final String DEPARTMENT3 = "QA";
	private static final String TITLE3 = "Tester";
	private static final String NAME3 = "Moshe";
	private static final long ID_NEW = 100000;
	Employee empl1=new Employee(ID1, SALARY1, DEPARTMENT1,
            TITLE1, NAME1, java.time.LocalDate.now(), java.time.LocalDate.now(), "male");
	Employee empl2=new Employee(ID1, SALARY1, DEPARTMENT1,
            TITLE1, NAME1, java.time.LocalDate.now(), java.time.LocalDate.now(), "male");
	Employee empl3=new Employee
            (ID2, SALARY2, DEPARTMENT2, TITLE2, NAME2, java.time.LocalDate.now(), java.time.LocalDate.now(), "male");
	Employee empl4=new Employee
            (ID3, SALARY3, DEPARTMENT3, TITLE3, NAME3, java.time.LocalDate.now(), java.time.LocalDate.now(), "male");
	Company comp=null;
	@BeforeEach
	void createCompany() {
		comp=new Company();
		comp.hire(empl1);
		comp.hire(empl3);
		comp.hire(empl4);
	}


    @Test
	void testConstructor() {
		assertEquals(empl1, empl2);
	}
	
	@Test
	void testGetters() {
		assertEquals(ID1,empl1.getId());
		assertEquals(SALARY1,empl1.getSalary());
		assertEquals(DEPARTMENT1,empl1.getDepartment());
		assertEquals(TITLE1, empl1.getTitle());
		assertEquals(NAME1,empl1.getName());
		
	}

	/* TEMPORARY COMMENTED
	@Test
	void testGetBySalary() {
		createCompany();
		Employee[]salary1_2 = {empl1,empl3};
		assertArrayEquals(salary1_2,
				comp.getEmployeesBySalary(SALARY1, SALARY2));
		assertArrayEquals(new Employee[0],
				 comp.getEmployeesBySalary(SALARY3+1, Integer.MAX_VALUE));
	}

	 */
	@Test
	void testFire() {
		createCompany();
		assertFalse(comp.fire(0));
		assertTrue(comp.fire(ID1));
		assertEquals(null,comp.getEmployee(ID1));
	}
	@Test 
	void testHire() {
		createCompany();
		assertFalse(comp.hire(empl2));
		assertTrue(comp.hire
				(new Employee(ID_NEW, SALARY1,
                        DEPARTMENT1, TITLE1, NAME1, java.time.LocalDate.now(), java.time.LocalDate.now(), "male")));
	}
	@Test
	void testGetEmployee() {
		createCompany();
		assertEquals(empl1,comp.getEmployee(ID1));
		assertEquals(null,comp.getEmployee(ID_NEW));
	}
	@Test
	void testGetByTitle() {
		assertArrayEquals
		(new Employee[] {empl3,empl4}, comp.getEmployeesByTitle(TITLE2));
	}
	@Test
	void testGetSortedSalaryDesc() {
		assertArrayEquals(new Employee[] {empl4,empl3,empl1},
				comp.getEmployeesSalarySortedDesc());
	}

}
