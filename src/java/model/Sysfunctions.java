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
import javax.persistence.Lob;
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
@Table(name = "SYSFUNCTIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfunctions.findAll", query = "SELECT s FROM Sysfunctions s")
    , @NamedQuery(name = "Sysfunctions.findByFunctionId", query = "SELECT s FROM Sysfunctions s WHERE s.functionId = :functionId")
    , @NamedQuery(name = "Sysfunctions.findByFunctionNane", query = "SELECT s FROM Sysfunctions s WHERE s.functionNane = :functionNane")
    , @NamedQuery(name = "Sysfunctions.findByFunctionStatus", query = "SELECT s FROM Sysfunctions s WHERE s.functionStatus = :functionStatus")})
public class Sysfunctions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FUNCTION_ID")
    private String functionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FUNCTION_NANE")
    private String functionNane;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "FUNCTION_STATUS")
    private String functionStatus;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "FUNCTION_DESCR")
    private String functionDescr;

    public Sysfunctions() {
    }

    public Sysfunctions(String functionId) {
        this.functionId = functionId;
    }

    public Sysfunctions(String functionId, String functionNane, String functionStatus, String functionDescr) {
        this.functionId = functionId;
        this.functionNane = functionNane;
        this.functionStatus = functionStatus;
        this.functionDescr = functionDescr;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getFunctionNane() {
        return functionNane;
    }

    public void setFunctionNane(String functionNane) {
        this.functionNane = functionNane;
    }

    public String getFunctionStatus() {
        return functionStatus;
    }

    public void setFunctionStatus(String functionStatus) {
        this.functionStatus = functionStatus;
    }

    public String getFunctionDescr() {
        return functionDescr;
    }

    public void setFunctionDescr(String functionDescr) {
        this.functionDescr = functionDescr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (functionId != null ? functionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sysfunctions)) {
            return false;
        }
        Sysfunctions other = (Sysfunctions) object;
        if ((this.functionId == null && other.functionId != null) || (this.functionId != null && !this.functionId.equals(other.functionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sysfunctions[ functionId=" + functionId + " ]";
    }
    
}
