package com.mac.sk.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository2 extends CrudRepository<Employee2, Long> {
}
