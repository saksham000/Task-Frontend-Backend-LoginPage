package com.online.testapp.test.service.jpaDaoService;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.testapp.test.databasefiles.Admin;
import com.online.testapp.test.databasefiles.jpaRepositories.AdminRepo;
import com.online.testapp.test.exceptions.AdminNotFoundException;

@Service
public class AdminJpaDaoService {

    @Autowired
    private AdminRepo adminRepoService;

    public Boolean loginAdmin(Admin admin) {
        Admin admins = adminRepoService.findById(admin.getAdminId()).orElse(null);
        return admins != null && admins.getAdminName().equals(admin.getAdminName())
                && admins.getAdminPassword().equals(admin.getAdminPassword());
    }

    public Admin findAdminById(int adminId) {
        Optional<Admin> adminOptional = adminRepoService.findById(adminId);
        if (adminOptional.isPresent()) {
            return adminOptional.get();
        } else {
            throw new AdminNotFoundException("Admin By Id: " + adminId + " Is Not Found");
        }
    }

}
