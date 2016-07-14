package service.impl;

import collection.map.Employee;
import service.EmployeeReportService;

import java.util.*;

/**
 * Created by byjumanikkan on 2/18/16.
 */
public class EmployeeReportServiceImpl implements EmployeeReportService {

    private List<Employee> employees = new ArrayList<>();
    private Map<String, List<Employee>> departmentMap = null;
    public EmployeeReportServiceImpl() {

        employees.add(new Employee("Sriraghu", "Sira", "Power&Water", 24, 70000d));
        employees.add(new Employee("Byju", "Manikkan", "Oil&Gas", 34, 100000d));
        employees.add(new Employee("Byju", "Manikkan", "Oil-ABC", 34, 100000d));

        employees.add(new Employee("Chaitanya", "Subbla", "Oil&Gas", 25, 70000d));
        employees.add(new Employee("Deepthi", "Iyer", "Power&Water", 22, 65000d));
        employees.add(new Employee("Aditi", "Shete", "Oil&Gas", 40, 110000d));
        departmentMap = getDepartmentMap(this.employees);
    }

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

    public Employee getYoungestEmployee(Map<String, List<Employee>> departmentMap, String departmentName)
    {
        Employee youngestEmployee = null;
        List<Employee> employees = departmentMap.get(departmentName);
        if(employees != null){
            for (Employee employee : employees) {
                if(youngestEmployee == null){
                    youngestEmployee = employee;
                } else if (employee.getAge() < youngestEmployee.getSalary())
                {
                    youngestEmployee = employee;
                }
            }
        }
        return youngestEmployee;
    }

    @Override
    public List<Employee> getAllEmployees(String departmentName) {
        return departmentMap.get(departmentName);
    }

    @Override
    public Employee getHighestPaidEmployee(String departmentName) {
        return getHighestPaidEmployeeByDepartment(this.departmentMap, departmentName);
    }

    @Override
    public Employee getYoungestEmployee(String departmentName) {
        return getYoungestEmployee(this.departmentMap, departmentName);
    }

    @Override
    public Collection<String> getAllDepartments() {
        Set<String> departments = new LinkedHashSet<>();
        for (Employee employee : employees) {
            departments.add(employee.getDepartmentName());
        }
        return departments;
    }

    public static void main(String[] args) {
        Set<String> setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> setB = new HashSet<>(Arrays.asList("A","B","D"));
        Set<String> unionAB = new HashSet<>(setA);
        unionAB.addAll(setB);
        Set<String> minusAB = new HashSet<>(setA);
        minusAB.removeAll(setB);
        Set<String> minusBA = new HashSet<>(setB);
        minusBA.removeAll(setA);
        Set<String> intersectionAB = new HashSet<>(setA);
        intersectionAB.retainAll(setB);
        System.out.println("unionAB " + unionAB);
        System.out.println("minusAB " + minusAB);
        System.out.println("minusBA " + minusBA);
        System.out.println("intersectionAB " + intersectionAB);
    }
}
