/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.EmployeesAudit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonat
 */
@Stateless
public class EmployeesAuditFacade extends AbstractFacade<EmployeesAudit> implements EmployeesAuditFacadeLocal {
    @PersistenceContext(unitName = "PruebaAppJEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeesAuditFacade() {
        super(EmployeesAudit.class);
    }
    
}
