package com.develop.department.service.Service;

import com.develop.department.service.Entity.Department;
import com.develop.department.service.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {

        return repository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {

        return repository.findByDepartmentId(departmentId);
    }
}
