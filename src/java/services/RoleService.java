package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

public class RoleService {
    public List<Role> getAll(int role_id) throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> role = roleDB.getAll(role_id);
        return role;
    }
    
    public Role get(String role_name) throws Exception {
        RoleDB roleDB = new RoleDB();
        Role role = roleDB.get(role_name);
        return role;
    }
    
    public void insert(int role_id, String role_name) throws Exception {
        Role role = new Role(role_id, role_name);
        RoleDB roleDB = new RoleDB();
        roleDB.insert(role);
    }
    
    public void update(int role_id, String role_name) throws Exception {
        Role role = new Role(role_id, role_name);
        RoleDB roleDB = new RoleDB();
        roleDB.update(role);
    }
    
    public void delete(int role_id) throws Exception {
        Role role = new Role();
        role.setRole_id(role_id);
        RoleDB roleDB = new RoleDB();
        roleDB.delete(role);
    }
}
