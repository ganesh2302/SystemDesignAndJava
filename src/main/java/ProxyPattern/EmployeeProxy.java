package ProxyPattern;

public class EmployeeProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    EmployeeProxy(EmployeeDao employeeDao){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDao obj) {
        if(client.equals("ADMIN")){
            employeeDao.create(client, obj);
        }
    }

    @Override
    public void delete(String client, EmployeeDao obj) {

    }

    @Override
    public void getEmployee(String client, EmployeeDao obj) {

    }

}
