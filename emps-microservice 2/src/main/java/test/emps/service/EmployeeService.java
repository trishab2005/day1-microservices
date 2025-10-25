package test.emps.service;

import test.emps.dto.APIResponseDto;
import test.emps.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto) ;
    //EmployeeDto getEmployeeById(Long id) ;
    APIResponseDto getEmployeeById(Long employeeId);

}
