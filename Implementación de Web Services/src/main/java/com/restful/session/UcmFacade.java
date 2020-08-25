/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.session;

import com.restful.entidades.Ucm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class UcmFacade extends AbstractFacade<Ucm> {

    @PersistenceContext(unitName = "com.mycompany_RestPrueba_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UcmFacade() {
        super(Ucm.class);
    }
    
}
