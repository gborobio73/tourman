package com.gonzalo.tourman.Application.Entities;

import java.util.Date;
import java.util.UUID;

import org.apache.cassandra.db.marshal.DateType;
import org.apache.cassandra.db.marshal.DoubleType;
import org.apache.cassandra.db.marshal.LongType;

import org.firebrandocm.dao.annotations.*;

import com.gonzalo.tourman.Application.Interfaces.IPersistable;

@ColumnFamily
public class Tournament implements IPersistable {
	@Key
    private String id;

    @Column(indexed = true)
    private String name;

    @Column
	private String location;
    
    //@Column(indexed = true, validationClass = DateType.class)
    @Transient
	private Date startDate;
    
    //@Column(validationClass = DateType.class)
    @Transient
    private Date endDate;

    public Tournament(String name, String location, Date startDate, Date endDate) {
    	//this.id = UUID.randomUUID().toString();
		this.name = name;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
	}
    
    public String getId()
    {
    	return id;
    }
    public void setId( String id)
    {
    	this.id =id;
    }
    
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public String getLocation()
    {
    	return location;
    }
    public void setLocation(String location)
    {
    	this.location = location;
    }
    
    public Date getStartDate()
    {
    	return startDate;
    }
    public void setStartDate(Date startDate)
    {
    	this.startDate = startDate;
    }
    
    public Date getEndDate()
    {
    	return endDate;
    }
    public void setEndDate(Date endDate)
    {
    	this.endDate = endDate;
    }
}
