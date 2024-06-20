package com.EmployeeEditor;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class MemberListController {

    private final MemberListService memberListService;
    private final PrintResult printResult;

    public MemberListController() {
        memberListService = new MemberListService();
        printResult = new PrintResult();
    }

    public void selectAllMembers() {

        List<EmployeeDTO> memberList = memberListService.selectAllMembers();

        if(memberList != null) {
            printResult.printEmployeeList(memberList);
        } else {
            printResult.printErrorMessage("viewList");
        }

    }

    public void selectMemberById(Map<String, String> parameter) {

        String empId = new String(parameter.get("empId"));

        EmployeeDTO emp = memberListService.selectEmployeeById(String.valueOf(Integer.parseInt(empId)));

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("searchById");
        }

    }

    public void selectMemberByName(Map<String, String> parameter) {

        String empName = new String(parameter.get("empName"));

        EmployeeDTO emp = memberListService.selectEmployeeByName(empName);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("searchByName");
        }
    }

    public void addMember(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerId = parameter.get("managerId");
        java.sql.Date hireDate = Date.valueOf(parameter.get("hireDate"));
        java.sql.Date entDate = Date.valueOf(parameter.get("entDate"));
        String entYn = parameter.get("entYn");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setEmpNo(empNo);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(managerId);
        emp.setHireDate(hireDate);
        emp.setEntDate(entDate);
        emp.setEntYn(entYn);

        if(memberListService.addEmployee(emp)) {
            printResult.printSuccessMessage("addList");
        } else {
            printResult.printErrorMessage("addList");
        }
    }

    public void editMember(Map<String, String> parameter) {
        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerId = parameter.get("managerId");
        java.sql.Date hireDate = Date.valueOf(parameter.get("hireDate"));
        java.sql.Date entDate = Date.valueOf(parameter.get("entDate"));
        String entYn = parameter.get("entYn");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setEmpNo(empNo);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(managerId);
        emp.setHireDate(hireDate);
        emp.setEntDate(entDate);
        emp.setEntYn(entYn);

        if(memberListService.editEmployee(emp)) {
            printResult.printSuccessMessage("editList");
        } else {
            printResult.printErrorMessage("editList");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        String empId = new String (parameter.get("empId"));

        if(memberListService.deleteEmployee(empId)) {
            printResult.printSuccessMessage("deleteList");
        } else {
            printResult.printErrorMessage("deleteList");
        }
    }
}
