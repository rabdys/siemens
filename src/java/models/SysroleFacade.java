/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Sysrole;

/**
 *
 * @author rabdys
 */
@Stateless
public class SysroleFacade extends AbstractFacade<Sysrole> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SysroleFacade() {
        super(Sysrole.class);
    }
    
}
