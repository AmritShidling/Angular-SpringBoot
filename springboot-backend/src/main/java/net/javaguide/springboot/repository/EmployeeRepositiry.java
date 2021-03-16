package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguide.springboot.model.Employee;

@Repository
public interface EmployeeRepositiry extends JpaRepository<Employee, Long> {

}
