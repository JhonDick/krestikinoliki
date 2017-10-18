package com.example.databaselearn;

import java.util.List;

/**
 * Created by artur on 09.10.2017.
 */

public interface IDBhandler {
    public void addEmployee(Employee employee);
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployees();
    public int getEmployeeCounts();
    public int updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public void deleteAll();
}
