
public class EmployeeImpl implements EmployeeDAO
{

	public void addEmployee(EmployeeModel e1) {
		
		System.out.println("This is EmployeeImpl"+e1.getEmpid()+""+e1.getEmpname());
	}

}
