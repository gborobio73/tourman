package com.gonzalo.tourman.Application.Repositories;

import java.util.List;

import org.apache.cassandra.thrift.ConsistencyLevel;
import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.impl.hector.HectorPersistenceFactory;
import org.firebrandocm.dao.utils.ClassUtil;

import com.gonzalo.tourman.Application.Configuration.Keyspace;
import com.gonzalo.tourman.Application.Configuration.RepositoryConfiguration;
import com.gonzalo.tourman.Application.Interfaces.IPersistable;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.google.inject.Inject;

public class TourmanRepository implements ITourmanRepository{

	private HectorPersistenceFactory persistenceFactory;
	private RepositoryConfiguration configuration;
	
	@Inject
	public TourmanRepository(RepositoryConfiguration configuration)
	{
		this.configuration = configuration;
	}

	public void persist(IPersistable entity) throws Exception {
		initializePersistenceFactory();
		
		persistenceFactory.persist(entity);
		
		destroyPersistenceFactory();
	}

	private void initializePersistenceFactory() throws Exception {
		
		String[] contactNodes = new String[]{"127.0.0.1"};
		int cassandraDefaultPortDefinedInYaml = 9160;
		List<Class<?>> entities = ClassUtil.get( "com.gonzalo.tourman.Application.Entities", ColumnFamily.class );
		this.persistenceFactory = new HectorPersistenceFactory.Builder()
			.defaultConsistencyLevel(ConsistencyLevel.ALL)
			.clusterName(this.configuration.getCluster())
			.defaultKeySpace(this.configuration.getKeyspace())
			.contactNodes(contactNodes)
			.thriftPort(cassandraDefaultPortDefinedInYaml)
			.entities(entities)
			.build();
		
	}
	
	private void destroyPersistenceFactory() {
		persistenceFactory.destroy();
	}


}
