package service;

import collection.map.Employee;

import java.util.Collection;
import java.util.List;

/**
 * Created by deepak.kumar on 2/18/16.
 */
public interface EmployeeReportService {
    List<Employee> getAllEmployees(String departmentName);
    Employee getHighestPaidEmployee(String departmentName);
    Employee getYoungestEmployee(String departmentName);
    Collection<String> getAllDepartments();
}
