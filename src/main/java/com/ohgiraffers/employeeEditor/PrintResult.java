package com.ohgiraffers.employeeEditor;

import java.util.List;

public class PrintResult {

    public void printEmployeeList(List<EmployeeDTO> employeeList) {
        for(EmployeeDTO emp : employeeList) {
            System.out.println(emp);
        }
    }

    public void printEmployee(EmployeeDTO emp) {
        System.out.println(emp);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "addEmp" : successMessage = "신규 직원 등록에 성공했습니다."; break;
            case "editEmp" : successMessage = "직원 정보 수정에 성공했습니다."; break;
            case "deleteEmp" : successMessage = "직원 리스트 삭제에 성공했습니다."; break;
        }

        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "viewList" : errorMessage = "전체 목록 조회에 실패했습니다."; break;
            case "searchById" : errorMessage = "직원 ID 검색에 실패했습니다."; break;
            case "searchByName" : errorMessage = "직원 이름 검색에 실패했습니다."; break;
            case "addEmp" : errorMessage = "신규 직원 등록에 실패했습니다."; break;
            case "editEmp" : errorMessage = "직원 정보 수정에 실패했습니다."; break;
            case "deleteEmp" : errorMessage = "직원 리스트 삭제에 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }




}
