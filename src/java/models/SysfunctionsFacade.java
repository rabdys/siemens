/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Sysfunctions;

/**
 *
 * @author rabdys
 */
@Stateless
public class SysfunctionsFacade extends AbstractFacade<Sysfunctions> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SysfunctionsFacade() {
        super(Sysfunctions.class);
    }
    
}
