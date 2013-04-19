package com.gonzalo.tourman.Application.Repositories;

import static org.firebrandocm.dao.cql.QueryBuilder.allColumns;
import static org.firebrandocm.dao.cql.QueryBuilder.from;
import static org.firebrandocm.dao.cql.QueryBuilder.select;

import java.util.List;

import org.apache.cassandra.thrift.ConsistencyLevel;
import org.firebrandocm.dao.Query;
import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.impl.hector.HectorPersistenceFactory;
import org.firebrandocm.dao.utils.ClassUtil;

import com.gonzalo.tourman.Application.Configuration.IRepositoryConfiguration;
import com.gonzalo.tourman.Application.Entities.Tournament;
import com.gonzalo.tourman.Application.Interfaces.IPersistable;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.google.inject.Inject;

public class TourmanRepository implements ITourmanRepository{

	private HectorPersistenceFactory persistenceFactory;
	private IRepositoryConfiguration configuration;
	
	@Inject
	public TourmanRepository(IRepositoryConfiguration configuration)
	{
		this.configuration = configuration;
	}

	public void persist(IPersistable entity) throws Exception {
		initializePersistenceFactory();
		
		persistenceFactory.persist(entity);
		
		destroyPersistenceFactory();
	}
	
	public List<Tournament> getTournaments() throws Exception
	{
		initializePersistenceFactory();
		
		List<Tournament> tournaments = 
				persistenceFactory.getResultList(Tournament.class, 
						Query.get(select(allColumns(), from(Tournament.class))));
		
		destroyPersistenceFactory();
		return tournaments;
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
