package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDao obj) {
        System.out.println("New Employee Created");
    }

    @Override
    public void delete(String client, EmployeeDao obj) {
        System.out.println("Employee with ID x deleted");
    }

    @Override
    public void getEmployee(String client, EmployeeDao obj) {
        System.out.println("Hi I am Employee X");
    }
}
