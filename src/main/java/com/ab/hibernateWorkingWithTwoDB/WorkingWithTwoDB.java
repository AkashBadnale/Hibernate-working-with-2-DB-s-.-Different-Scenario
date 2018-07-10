package com.ab.hibernateWorkingWithTwoDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 *
 */
public class WorkingWithTwoDB 
{
    public static void main( String[] args )
    {
    	/*   below  to code  to add data in tables */
    	/*Session   session  = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Address  address1  = new Address(24, "karveRoad", "karvenagar", 411502, "pune", "pune", "Maharashtra", "INDIA");
        Address  address2  = new Address(28, "khadgaonRoad", "sambhajiNagar", 413512, "Latur", "Latue", "Maharashtra", "INDIA");
        Transaction  tx  =  session.beginTransaction();
        session.save(address1);
        session.save(address2);
        HibernateUtil.flushNcommit(session, tx);
        session.close();*/
    	
    	/*  got  the data  from  HyperSQL  address  table */
    	List<Address>  listOfAddresses  =  new ArrayList<>();
    	Session   hsqlSession  = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction  hsqlTx = hsqlSession.beginTransaction();
    	                                     // HQL query using className to fetch data
    	listOfAddresses = hsqlSession.createQuery("from Address").getResultList();
    	
    	for(Address  address : listOfAddresses) {
    		System.out.println("House Number -- "+address.getId()+"\t"+"street  -- "+address.getStreetName()+"\t"+
    		"area  -- "+address.getAreaName()+"\t"+"PINCODE -- "+address.getPinCode()+"\t"+"Village -- "+address.getVillageName()+"\t"+
    		"District -- "+address.getDistrictName()+"\t"+"State --"+address.getStateName()+"\t"+"Country -- "+address.getCountryName());
    	}//for
        
    	hsqlSession.flush();
    	hsqlTx.commit();
    	hsqlSession.close();
    	
    	 /* adding  the above fetched  data  to mysql  Student  table */
    	Session   mysqlSession  = HibernateUtil.getSession();//new  Configuration().configure("hibernate.other.cfg.xml").buildSessionFactory().openSession();
    	Transaction  mysqlTx  = mysqlSession.beginTransaction();
    	
    	List<Student>  listOfStudents = new ArrayList<>();
    	listOfStudents  =  mysqlSession.createQuery(" from Student").getResultList();
    	
    	for(Student  student : listOfStudents) {
    		System.out.println(" Id -- "+student.getId()+"\t"+"Name -- "+student.getName()+"\t"+"Surname -- "+student.getSurname()+"\t"+"Age --"+student.getAge());;
    	}
    	
    	HibernateUtil.flushNcommit(mysqlSession, mysqlTx);
    	mysqlSession.close();
    	
    	Session  newSession = new  Configuration().configure("hibernate.retrieve.cfg.xml").buildSessionFactory().openSession();
    	Transaction newTx = newSession.beginTransaction();
    	
    	for(Student student :  listOfStudents) {
    		 for(Address address : listOfAddresses) {
    			 if(student.getId() == address.getId()) {
    		newSession.save(new StudentNaddress(student.getId(), student.getName(), student.getSurname(), student.getAge(), address.getStreetName(), address.getAreaName(), address.getPinCode(), address.getVillageName(), address.getDistrictName(), address.getStateName(), address.getCountryName()));
    			 }//if
    	   }//for
    	}//for
    	HibernateUtil.flushNcommit(newSession, newTx);
    	newSession.close();
    }//main
}//WorkingWithTwoDB
