package com.ohgiraffers.employeeEditor;

import java.util.List;

public interface ListMapper {
    
    List<EmployeeDTO> selectAllMembers();

    EmployeeDTO selectEmployeeById(String empId);

    EmployeeDTO selectEmployeeByName(String empName);

    int addEmployee(EmployeeDTO emp);

    int editEmployee(EmployeeDTO emp);

    int deleteEmployee(String empId);

}
