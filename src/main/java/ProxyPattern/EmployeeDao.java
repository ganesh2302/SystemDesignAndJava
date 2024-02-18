package ProxyPattern;

public interface EmployeeDao {

    public void create(String client, EmployeeDao obj);
    public void delete(String client, EmployeeDao obj);
    public void getEmployee(String client, EmployeeDao obj);

}
