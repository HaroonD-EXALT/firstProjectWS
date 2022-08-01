package org.firstProject.serviceImpl;

import org.firstProject.database.AerospikeDatabase;
import org.firstProject.model.Admin;
import org.firstProject.model.LoginModel;
import org.firstProject.pojo.PojoAdmin;
import org.firstProject.service.AdminService;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "org.firstProject.service.AdminService")
public class AdminServiceImpl implements AdminService {
    private AerospikeDatabase database= AerospikeDatabase.getInstance();

    @Override
    public PojoAdmin getAllAdmins() {
        List<Admin> admins = database.getAllAdmins();
        PojoAdmin pojoAdmin = new PojoAdmin();
        pojoAdmin.setAdmins(admins);
        return pojoAdmin;
    }

    @Override
    public Admin getAdminById(long id) {
        return new Admin(1,"asd","ssss");
    }

    @Override
    public boolean logIn(LoginModel login) {
        Admin admin=  database.getAdminByName(login.getUsername());
        if (admin == null) return false;
        if (admin.getPassword().equals(login.getPassword())){
            return true;
        }
        return false;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return database.insertAdmin(admin);
    }
}
