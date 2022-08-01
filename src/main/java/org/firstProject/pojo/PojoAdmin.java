package org.firstProject.pojo;

import org.firstProject.model.Admin;

import java.util.ArrayList;
import java.util.List;

public class PojoAdmin {
    private List<Admin> admins = new ArrayList<>();

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
}
