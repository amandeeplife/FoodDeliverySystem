package com.edu.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Order implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="location")
	private String location;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date deliveryDate;
	
	@Column(name="status")
	private boolean deliveryStatus;
	
	public Order() {
		this.deliveryStatus = false;
		this.orderedDate = new Date();
	}
	
	
}
