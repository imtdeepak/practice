package collection.map;

import java.util.*;

/**
 * Created by deepak.kumar on 2/18/16.
 */
public class EmployeeReport {

    public Map<String, List<Employee>> getDepartmentMap(List<Employee> employees)
    {
        Map<String, List<Employee>> map = new HashMap<>();
        updateDepartmentMap(employees, map);
        return map;
    }

    public Map<String, List<Employee>> getSortedDepartmentMap(List<Employee> employees)
    {
        Map<String, List<Employee>> map = new TreeMap<>();
        updateDepartmentMap(employees, map);
        return map;
    }

    private void updateDepartmentMap(List<Employee> employees, Map<String, List<Employee>> map) {
        for (Employee employee : employees) {
            String departmentName = employee.getDepartmentName();
            List<Employee> departmentEmployees = map.get(departmentName);
            if(departmentEmployees == null) {
                departmentEmployees = new ArrayList<>();
            }
            departmentEmployees.add(employee);
            map.put(departmentName, departmentEmployees);
        }
    }

    public Employee getHighestPaidEmployeeByDepartment(Map<String, List<Employee>> departmentMap, String departmentName)
    {
        Employee highestPaidEmployee = null;
        List<Employee> employees = departmentMap.get(departmentName);
        if(employees != null){
            for (Employee employee : employees) {
                if(highestPaidEmployee == null){
                    highestPaidEmployee = employee;
                } else if (employee.getSalary() > highestPaidEmployee.getSalary())
                {
                    highestPaidEmployee = employee;
                }
            }
        }
        return highestPaidEmployee;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sriraghu","Sira","Power&Water", 24,70000d));
        employees.add(new Employee("Byju","Manikkan","Oil&Gas", 34,100000d));
        employees.add(new Employee("Byju","Manikkan","Oil-ABC", 34,100000d));

        employees.add(new Employee("Chaitanya","Subbla","Oil&Gas", 25,70000d));
        employees.add(new Employee("Deepthi","Iyer","Power&Water", 22,65000d));
        employees.add(new Employee("Aditi","Shete","Oil&Gas", 40,110000d));

        EmployeeReport employeeReport = new EmployeeReport();
        Map<String, List<Employee>> departmentMap = employeeReport.getDepartmentMap(employees);
        for (String departmentName : departmentMap.keySet()) {
            //System.out.println("Department name : " + departmentName);
            //System.out.println("Employees : " + departmentMap.get(departmentName));
        }

        Employee highestPaidEmployee = employeeReport.getHighestPaidEmployeeByDepartment(departmentMap, "Oil&Gas");
        System.out.println("Highest Paid employee in Oil and Gas " + highestPaidEmployee);

    }
}
