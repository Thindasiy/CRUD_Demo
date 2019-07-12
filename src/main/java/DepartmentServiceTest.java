import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

import bom.Department;
import entites.DepartmentEntity;
import services.DepartmentService;
import services.EmployeeService;

@RunWith(PowerMockRunner.class)
public class DepartmentServiceTest {
	
	@InjectMocks
	DepartmentService departmentService;
	
	@InjectMocks
	EmployeeService employeeService;
	
	@InjectMocks
	EntityManager em;
	
	@Test
	public void testToEntity_ShouldReturnEntity_WhenBomIsGiven() {
		DepartmentEntity entity = createDepartmentEntity();
		Department bom = createDepartment();
		DepartmentEntity actual = departmentService.toEntity(bom );
		assertEquals(entity, actual );
	}
	
	@Test
	public void testToEntity_ShouldReturnNull_WhenBomIsNull() {
		Department bom = null;
		DepartmentEntity actual = departmentService.toEntity(bom ); 
		assertEquals(null,actual);
	}
	
	@Test
	public void testToBom_ShouldReturnBom_WhenEntityIsGiven() {
		Department bom = createDepartment();
		DepartmentEntity entity = createDepartmentEntity();
		Department actual = departmentService.toBom(entity);
		assertEquals(bom, actual);
	}
	
	/*
	 * @Test public void
	 * testShowAll_ShouldReturnListOfDepartment_WhenCallIsSuccessful() {
	 * List<DepartmentEntity> all = departmentService.showAll(); assertEquals(4,
	 * all.size());
	 * 
	 * }
	 */
	

	/*
	 * private Employee createEmployee() { return new
	 * Employee(1,"John",20,"john@gmail.com",null); }
	 * 
	 * private EmployeeEntity createEmployeeEntity() { return new
	 * EmployeeEntity(1,"John",20,"john@gmail.com",null); }
	 */

	private DepartmentEntity createDepartmentEntity() {
		return new DepartmentEntity(1,"ICT");
	}

	private Department createDepartment() {
		return new Department(1,"ICT");
	}
}