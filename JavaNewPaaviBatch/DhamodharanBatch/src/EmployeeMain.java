
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeModel em=new EmployeeModel();
		em.setEmpid(1001);
		em.setEmpname("azar");
		EmployeeImpl empl=new EmployeeImpl();
		empl.addEmployee(em);

	}

}
