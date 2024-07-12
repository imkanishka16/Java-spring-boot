package kanishka.emps.backend.service;

import kanishka.emps.backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

}
