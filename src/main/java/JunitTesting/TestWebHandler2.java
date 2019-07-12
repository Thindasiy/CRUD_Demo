/*
 * package JunitTesting;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.util.Arrays; import java.util.List;
 * 
 * import javax.faces.event.ValueChangeEvent;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.mockito.InjectMocks; import org.mockito.Mock; import org.mockito.Mockito;
 * import org.powermock.modules.junit4.PowerMockRunner;
 * 
 * import bom.Department; import bom.Employee; import entites.DepartmentEntity;
 * import entites.EmployeeEntity; import services.DepartmentService; import
 * services.EmployeeService; import web_config.WebHandler;
 * 
 * @RunWith(PowerMockRunner.class) public class TestWebHandler2 {
 * 
 * @InjectMocks WebHandler webHandler;
 * 
 * @Mock EmployeeService employeeService;
 * 
 * @Mock DepartmentService departmentService;
 * 
 * @Mock ValueChangeEvent changeEvent;
 * 
 * @Test public void
 * testAddNewEmployee_ShouldReturnPage_WhenEmployeeSaveIsSuccessful() { // Init
 * Variables Department department = createDepartment();// department variable
 * Employee employee = createEmployee();// employee variable
 * webHandler.setDepartment(department); webHandler.setEmployee(employee); //
 * When /Mock Mockito.when(departmentService.toEntity(department)).thenReturn(
 * createDepartmentEntity());
 * 
 * // Call function String actual = webHandler.addNewEmployee();
 * 
 * // Verify Mockito.verify(employeeService).addEmployee(employee);
 * 
 * // AssertEquals
 * assertEquals("index.xhtml?faces-redirect=true&includeViewParams=true",
 * actual); }
 * 
 * @Test public void
 * testUpdateNewEmployee_ShouldReturnPage_WhenEmployeeUpdateIsSuccessful() { //
 * Init variables Department department = createDepartment(); Employee employee
 * = createEmployee(); webHandler.setDepartment(department);
 * webHandler.setEmployee(employee); // Mock
 * Mockito.when(departmentService.toEntity(department)).thenReturn(
 * createDepartmentEntity()); // call function String actual =
 * webHandler.updateNewEmployee(); // verify
 * Mockito.verify(employeeService).updateEmployee(employee);
 * assertEquals("index.xhtml?faces-redirect=true&includeViewParams=true",
 * actual); }
 * 
 * @Test public void
 * testDeleteAEmployee_ShouldReturnPage_WhenEmployeeDeleteIsSuccessful() {
 * Employee employee = createEmployee(); EmployeeEntity empEntity =
 * createEmployeeEntity(); webHandler.setEmployee(employee); // Mock
 * Mockito.when(employeeService.toEntity(employee)).thenReturn(empEntity); //
 * call function should before verify String actual =
 * webHandler.deleteAEmployee(employee);
 * 
 * assertEquals("index.xhtml?faces-redirect=true&includeViewParams=true",
 * actual); Mockito.verify(employeeService).deleteEmployee(empEntity); }
 * 
 * 
 * @Test public void
 * testViewEmployee_ShouldReturnUpdatePage_WhenViewEmployeeIsSuccessful() {
 * Employee employee = createEmployee(); String actual =
 * webHandler.viewEmployee(employee);
 * assertEquals("update.xhtml?faces-redirect=true&id=", actual); }
 * 
 * 
 * @Test public void
 * testChangeDepartment_ShouldReturnDepartment_WhenDepartmentChangeIsSuccessful(
 * ) { Department department = createDepartment(); DepartmentEntity
 * departmentEntity = createDepartmentEntity(); // Mock
 * Mockito.when(changeEvent.getNewValue()).thenReturn(1);
 * Mockito.when(departmentService.findDepartmentById(1)).thenReturn(
 * departmentEntity);
 * Mockito.when(departmentService.toBom(departmentEntity)).thenReturn(department
 * );
 * 
 * webHandler.changeDepartment(changeEvent); Department actual =
 * webHandler.getDepartment(); assertEquals(department, actual); }
 * 
 * @Test public void testToInit_ShouldReturnDepartment_WhenInitNot() {
 * Department department = createDepartment(); // List<Employee> employeeList =
 * new ArrayList<>(); List<EmployeeEntity> empEntityList =
 * Arrays.asList(createEmployeeEntity()); // List<Department> departmentList =
 * new ArrayList<>(); List<DepartmentEntity> deptEntityList =
 * Arrays.asList(createDepartmentEntity());
 * 
 * Mockito.when(employeeService.showAll()).thenReturn(empEntityList);
 * Mockito.when(employeeService.toBoms(empEntityList)).thenReturn(Arrays.asList(
 * createEmployee()));
 * 
 * Mockito.when(departmentService.showAll()).thenReturn(deptEntityList);
 * Mockito.when(departmentService.toBoms(deptEntityList)).thenReturn(Arrays.
 * asList(createDepartment()));
 * 
 * webHandler.init(); Department actual = webHandler.getDepartment();
 * 
 * assertEquals(department, actual); }
 * 
 * private EmployeeEntity createEmployeeEntity() { return new EmployeeEntity(1,
 * "Joe", 38, "joe@gmail.com", createDepartmentEntity()); }
 * 
 * private DepartmentEntity createDepartmentEntity() { return new
 * DepartmentEntity(1, "ICT"); }
 * 
 * private Employee createEmployee() { return new Employee(1, "Joe", 38,
 * "joe@gmail.com", createDepartmentEntity()); }
 * 
 * private Department createDepartment() { return new Department(1, "ICT"); }
 * 
 * }
 */