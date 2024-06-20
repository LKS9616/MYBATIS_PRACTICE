package com.EmployeeEditor;

import java.util.List;

public interface ListMapper {
    
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(String empId);

    EmployeeDTO selectEmployeeByName(String empName);

    int addEmployee(EmployeeDTO emp);

    int editEmployee(EmployeeDTO emp);

    int deleteEmployee(String empId);

}
