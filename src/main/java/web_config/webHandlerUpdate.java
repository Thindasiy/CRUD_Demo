package web_config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;

import bom.Department;
import bom.Employee;
import lombok.Getter;
import lombok.Setter;
import services.DepartmentService;
import services.EmployeeService;

@SuppressWarnings("deprecation")
@ManagedBean(name="webHandlerUpdate")
@ViewScoped
public class webHandlerUpdate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private @Getter @Setter Department department = new Department();
	private @Getter @Setter Employee employee = new Employee();
	private @Getter @Setter Employee editEmployee = new Employee();
	private @Getter @Setter int id;

	@Inject
	private EmployeeService empService;

	@Inject
	private DepartmentService depService;

	private @Getter @Setter List<Employee> employeeList = new ArrayList<>();

	private @Getter @Setter List<Department> departmentList = new ArrayList<>();


	@PostConstruct
	public void init() {
		
			departmentList = depService.toBoms(depService.showAll());
			Map<String, String> paramMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
			String employeeId = paramMap.get("eid");
			int eid = Integer.valueOf(employeeId);
			
			employee = empService.toBom(empService.findById(eid));
			setId(employee.getDepartment().getId());
	}
	
	public String updateNewEmployee() {
		employee.setDepartment(depService.toEntity(department));
		empService.updateEmployee(employee);
		employeeList = empService.toBoms(empService.showAll());
		return "index.xhtml";
	}
	
	/*
	 * public String addNewEmployee() {
	 * employee.setDepartment(depService.toEntity(department));
	 * empService.addEmployee(employee); employeeList =
	 * empService.toBoms(empService.showAll()); return
	 * "index.xhtml?faces-redirect=true&includeViewParams=true"; }
	 * 
	 * 
	 * 
	 * public String deleteNewEmployee(Employee employeeBOM) {
	 * empService.deleteEmployee(empService.toEntity(employeeBOM)); employeeList =
	 * empService.toBoms(empService.showAll()); return
	 * "index.xhtml?faces-redirect=true&includeViewParams=true"; }
	 * 
	 * public String viewEmployee(Employee emp) { setEmployee(emp);
	 * setId(employee.getDepartment().getId()); return
	 * "update.xhtml?faces-redirect=true&id=";//remove +id }
	 */

	public void changeDepartment(ValueChangeEvent dept) {
		department = depService.toBom(depService.findDepartmentById(Integer.parseInt(dept.getNewValue().toString())));
	}
}
