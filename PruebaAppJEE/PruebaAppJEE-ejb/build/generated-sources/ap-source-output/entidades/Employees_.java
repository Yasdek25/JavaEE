package entidades;

import entidades.Customers;
import entidades.Employees;
import entidades.Offices;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-17T20:00:11")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, String> firstName;
    public static volatile ListAttribute<Employees, Customers> customersList;
    public static volatile SingularAttribute<Employees, String> extension;
    public static volatile ListAttribute<Employees, Employees> employeesList;
    public static volatile SingularAttribute<Employees, String> jobTitle;
    public static volatile SingularAttribute<Employees, Offices> officeCode;
    public static volatile SingularAttribute<Employees, Employees> reportsTo;
    public static volatile SingularAttribute<Employees, String> email;
    public static volatile SingularAttribute<Employees, Integer> employeeNumber;

}