package com.ohgiraffers.employeeEditor;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employeeEditor.Template.getSqlSession;

public class MemberListService {

    private ListMapper listMapper;

    public List<EmployeeDTO> selectAllMembers() {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        List<EmployeeDTO> empList = listMapper.selectAllMembers();

        sqlSession.close();

        return empList;
    }

    public EmployeeDTO selectEmployeeById(String empId) {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        EmployeeDTO empList = listMapper.selectEmployeeById(empId);

        sqlSession.close();

        return empList;
    }

    public EmployeeDTO selectEmployeeByName(String empName) {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        EmployeeDTO empList = listMapper.selectEmployeeByName(empName);

        sqlSession.close();

        return empList;
    }

    public boolean addEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        int result = listMapper.addEmployee(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean editEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        int result = listMapper.editEmployee(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteEmployee(String empId) {
        SqlSession sqlSession = getSqlSession();

        listMapper = sqlSession.getMapper(ListMapper.class);

        int result = listMapper.deleteEmployee(empId);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
