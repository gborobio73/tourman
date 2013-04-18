package com.gonzalo.tourman.Application.Entities;
import java.util.UUID;

import org.firebrandocm.dao.annotations.Column;
import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.annotations.Key;

import com.gonzalo.tourman.Application.Interfaces.IPersistable;

@ColumnFamily
public class User implements IPersistable {
	
	@Key
    private String id;

    @Column(indexed = true)
    private String name;
    
    @Column
    private String password;
    
    public User(String name, String password) {
    	//this.id = UUID.randomUUID().toString();
		this.name = name;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
