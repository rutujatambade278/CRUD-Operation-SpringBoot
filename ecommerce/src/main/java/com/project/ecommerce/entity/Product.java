package com.project.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private  int p_id;
  private  String p_Name;
  private  String p_Date;
   
  
  public Product(int p_id, String p_Name, String p_Date) {
	super();
	this.p_id = p_id;
	this.p_Name = p_Name;
	this.p_Date = p_Date;
}


@Override
public String toString() {
	return "Product [p_id=" + p_id + ", p_Name=" + p_Name + ", p_Date=" + p_Date + "]";
}


public int getP_id() {
	return p_id;
}


public void setP_id(int p_id) {
	this.p_id = p_id;
}


public String getP_Name() {
	return p_Name;
}


public void setP_Name(String p_Name) {
	this.p_Name = p_Name;
}


public String getP_Date() {
	return p_Date;
}


public void setP_Date(String p_Date) {
	this.p_Date = p_Date;
}


public Product() {
	super();
	// TODO Auto-generated constructor stub
}
	
   
   
    
}
