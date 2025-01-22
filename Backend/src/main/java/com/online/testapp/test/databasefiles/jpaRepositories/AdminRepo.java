package com.online.testapp.test.databasefiles.jpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.testapp.test.databasefiles.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
    
}
