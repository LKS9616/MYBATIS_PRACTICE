package com.EmployeeEditor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberListController memberListController = new MemberListController();

        do {
            System.out.println("=============== 직원 관리 시스템 ==================");
            System.out.println("1. 직원 전체 조회하기");
            System.out.println("2. 직원 코드로 직원 조회하기");
            System.out.println("3. 직원 이름으로 직원 조회하기");
            System.out.println("4. 신규 직원 등록하기");
            System.out.println("5. 직원 목록 수정하기");
            System.out.println("6. 직원 목록 삭제하기");
            System.out.print("시스템 메뉴 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch(no) {

                case 1: memberListController.selectAllMembers();
                break;
                case 2: memberListController.selectMemberById(inputMemberId());
                break;
                case 3: memberListController.selectMemberByName(inputMemberName());
                break;
                case 4: memberListController.addMember(inputMember());
                break;
                case 5: memberListController.editMember(inputMemberModify());
                break;
                case 6: memberListController.deleteMember(inputMemberId());
                break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다");
                    break;
            }
        } while(true);
    }
    private static Map<String, String> inputMemberId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    private static Map <String, String> inputMemberName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empName", empName);

        return parameter;
    }

    private static Map <String, String> inputMember () {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 사원번호를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("직원의 직원명을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("직원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("직원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("직원의 직무코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("직원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("직원의 급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("직원의 보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("직원의 관리자 사번을 입력하세요 : ");
        String managerId = sc.nextLine();
        System.out.print("직원의 입사일을 입력하세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("직원의 퇴사일을 입력하세요 : ");
        String entDate = sc.nextLine();
        System.out.print("직원의 퇴직여부를 입력하세요 : ");
        String entYn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("phone", phone);
        parameter.put("email", email);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerId", managerId);
        parameter.put("hireDate", hireDate);
        parameter.put("entDate", entDate);
        parameter.put("entYn", entYn);

        return parameter;
    }
    private static Map <String, String> inputMemberModify () {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 사원번호를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("직원의 직원명을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("직원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("직원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("직원의 직무코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("직원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("직원의 급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("직원의 보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("직원의 관리자 사번을 입력하세요 : ");
        String managerId = sc.nextLine();
        System.out.print("직원의 입사일을 입력하세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("직원의 퇴사일을 입력하세요 : ");
        String entDate = sc.nextLine();
        System.out.print("직원의 퇴직여부를 입력하세요 : ");
        String entYn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("phone", phone);
        parameter.put("email", email);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerId", managerId);
        parameter.put("hireDate", hireDate);
        parameter.put("entDate", entDate);
        parameter.put("entYn", entYn);

        return parameter;

    }



}
