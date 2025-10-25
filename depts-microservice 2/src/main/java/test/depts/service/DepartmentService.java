package test.depts.service;


import test.depts.dto.DepartmentDto;

public interface DepartmentService
{
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}