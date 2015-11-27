/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOW;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TMN
 */
@Stateless
public class ProjworkFacade extends AbstractFacade<Projwork> {

    @PersistenceContext(unitName = "JOWPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjworkFacade() {
        super(Projwork.class);
    }
    
}
