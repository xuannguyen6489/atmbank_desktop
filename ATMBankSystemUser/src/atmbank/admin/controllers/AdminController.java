/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import atmbank.admin.model.SystemUser;
import atmbank.admin.model.UserGroup;
import atmbank.admin.security.SecurityUtils;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;

/**
 *
 * @author Xuan Nguyen
 */
public class AdminController extends CommonController {

    public AdminController() {
        super();
    }

    public void close() {
        if (this.entityManager.getTransaction().isActive()) {
            this.entityManager.getTransaction().rollback();
        }
    }

    public void AddUserAdmin(SystemUser systemUser) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(systemUser);
        this.entityManager.getTransaction().commit();        
    }

    public List<UserGroup> getListPermission() {
        Query query = this.entityManager.createNamedQuery("UserGroup.findAllPermission");
        List<UserGroup> list = query.getResultList();
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }
    //Method Login

    public boolean LoginAdminSystem(String username, String password) {
        //String sql = "select s from SystemUser s where s.userUsername = :username and s.userPassword = :password";
        String hashPassword;
        try {
            hashPassword = SecurityUtils.md5PasswordEncrypt(password);
        } catch (NoSuchAlgorithmException ex) {
            hashPassword = password;
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Query query = this.entityManager.createNamedQuery("SystemUSER.findAcc")
                .setParameter("userUsername", username)
                .setParameter("userPassword", hashPassword)
                .setParameter("userStatus", "Enable");
        List list = query.getResultList();
        if (!list.isEmpty()) {
            return true;
        }
        return false;        
    }

    public SystemUser getUserByUsername(String username) {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findByUserUsername").setParameter("userUsername", username);
        List<SystemUser> SystemUser = query.getResultList();
        if (!SystemUser.isEmpty()) {
            for (Object obj : SystemUser) {
                SystemUser systemUser = (SystemUser) obj;
                return systemUser;
            }
        }
        return null;
    }

    public boolean CheckUserByUsername(String username) {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findByUserUsername").setParameter("userUsername", username);
        List<?> SystemUSER = query.getResultList();
        if (!SystemUSER.isEmpty()) {
            return true;
        }
        return false;
    }    

    public boolean CheckEmailExists(String email, int userid) {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findByUserEmailExists").setParameter("userEmail", email).setParameter("userID", userid);
        List<?> list = query.getResultList();
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void UpdateUser(SystemUser systemUser) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(systemUser);
        this.entityManager.getTransaction().commit();        
    }

    public List<SystemUser> getAllAdmin() {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findAll");
        List<SystemUser> list = query.getResultList();
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }

    public List<SystemUser> getAllAdminEnable() {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findAllUserEnable").setParameter("Enable", "Enable");
        List<SystemUser> list = query.getResultList();
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }

    public List<SystemUser> getAllAdminDisable() {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findAllUserDisable").setParameter("Disable", "Disable");
        List<SystemUser> list = query.getResultList();
        if (!list.isEmpty()) {
            return list;
        }
        return null;
        
    }
    
    public SystemUser SearchUserByID(int userid) {
        return this.entityManager.find(SystemUser.class, userid);
    }

    public void UpdateUserDisable(int userid, String reason) {
        SystemUser systemUser = SearchUserByID(userid);
        systemUser.setUserStatus("Disable");
        systemUser.setUserStatusReason(reason);
        UpdateUser(systemUser);
    }

    public void UpdateUserWhere(SystemUser systemUser) {
        this.entityManager.getTransaction().begin();
        SystemUser systemUserX = SearchUserByID(systemUser.getUserID());
        systemUserX.setGroupId(systemUser.getGroupId());
        systemUserX.setUserFullName(systemUser.getUserFullName());
        systemUserX.setUserAddress(systemUser.getUserAddress());
        systemUserX.setUserEmail(systemUser.getUserEmail());
        systemUserX.setUserGender(systemUser.getUserGender());
        systemUserX.setUserDoB(systemUser.getUserDoB());
        systemUserX.setUserPhone(systemUser.getUserPhone());
        this.entityManager.getTransaction().commit();        
    }

    public void UpdateUserEnable(int userid) {
        SystemUser systemUser = SearchUserByID(userid);
        systemUser.setUserStatus("Enable");
        UpdateUser(systemUser);
    }

    public boolean CheckUsernameExists(String username) {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findByUserUsername").setParameter("userUsername", username);
        List<?> list = query.getResultList();
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean CheckEmailExistsAdd(String email) {
        Query query = this.entityManager.createNamedQuery("SystemUSER.findByUserEmail").setParameter("userEmail", email);
        List<?> list = query.getResultList();
        if (!list.isEmpty()) {
            return true;            
        }
        return false;
        
    }
}
