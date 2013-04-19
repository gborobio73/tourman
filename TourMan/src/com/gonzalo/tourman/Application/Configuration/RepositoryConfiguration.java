package com.gonzalo.tourman.Application.Configuration;

import java.lang.annotation.Annotation;

public class RepositoryConfiguration{
	private String keyspace;
	private String cluster;
	
	public RepositoryConfiguration(String keyspace, String cluster)
	{
		this.keyspace = keyspace;
		this.cluster = cluster;
	}
	
	public String getCluster() {
		return cluster;
	}

	public String getKeyspace() {
		return keyspace;
	}
}
