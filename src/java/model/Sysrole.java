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
@Table(name = "SYSROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysrole.findAll", query = "SELECT s FROM Sysrole s")
    , @NamedQuery(name = "Sysrole.findByRoleId", query = "SELECT s FROM Sysrole s WHERE s.roleId = :roleId")
    , @NamedQuery(name = "Sysrole.findByRoleName", query = "SELECT s FROM Sysrole s WHERE s.roleName = :roleName")
    , @NamedQuery(name = "Sysrole.findByRoleStatus", query = "SELECT s FROM Sysrole s WHERE s.roleStatus = :roleStatus")})
public class Sysrole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ROLE_ID")
    private String roleId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Size(max = 2)
    @Column(name = "ROLE_STATUS")
    private String roleStatus;

    public Sysrole() {
    }

    public Sysrole(String roleId) {
        this.roleId = roleId;
    }

    public Sysrole(String roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sysrole)) {
            return false;
        }
        Sysrole other = (Sysrole) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sysrole[ roleId=" + roleId + " ]";
    }
    
}
