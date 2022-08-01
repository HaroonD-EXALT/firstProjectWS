package org.firstProject.service;


import org.firstProject.model.Admin;
import org.firstProject.model.LoginModel;
import org.firstProject.pojo.PojoAdmin;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AdminService {

    @WebMethod
    public PojoAdmin getAllAdmins();

    @WebMethod
    public Admin getAdminById(long id);

    @WebMethod
    public boolean logIn(LoginModel login);

    @WebMethod
    public Admin addAdmin(Admin admin);
}
