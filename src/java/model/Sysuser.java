/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rabdys
 */
@Entity
@Table(name = "SYSUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysuser.findAll", query = "SELECT s FROM Sysuser s")
    , @NamedQuery(name = "Sysuser.findByUserId", query = "SELECT s FROM Sysuser s WHERE s.userId = :userId")
    , @NamedQuery(name = "Sysuser.findByUserNick", query = "SELECT s FROM Sysuser s WHERE s.userNick = :userNick")
    , @NamedQuery(name = "Sysuser.findByUserName", query = "SELECT s FROM Sysuser s WHERE s.userName = :userName")
    , @NamedQuery(name = "Sysuser.findByUserStatus", query = "SELECT s FROM Sysuser s WHERE s.userStatus = :userStatus")
    , @NamedQuery(name = "Sysuser.findByUserPsw", query = "SELECT s FROM Sysuser s WHERE s.userPsw = :userPsw")
    , @NamedQuery(name = "Sysuser.findByUserEmail", query = "SELECT s FROM Sysuser s WHERE s.userEmail = :userEmail")})
public class Sysuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "USER_NICK")
    private String userNick;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USER_NAME")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "USER_STATUS")
    private String userStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USER_PSW")
    private String userPsw;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USER_EMAIL")
    private String userEmail;

    public Sysuser() {
    }

    public Sysuser(String userId) {
        this.userId = userId;
    }

    public Sysuser(String userId, String userNick, String userName, String userStatus, String userPsw, String userEmail) {
        this.userId = userId;
        this.userNick = userNick;
        this.userName = userName;
        this.userStatus = userStatus;
        this.userPsw = userPsw;
        this.userEmail = userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sysuser)) {
            return false;
        }
        Sysuser other = (Sysuser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sysuser[ userId=" + userId + " ]";
    }
    
}
