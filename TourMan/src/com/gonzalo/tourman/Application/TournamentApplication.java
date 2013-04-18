package com.gonzalo.tourman.Application;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.cassandra.thrift.ConsistencyLevel;
import org.firebrandocm.dao.PersistenceFactory;
import org.firebrandocm.dao.impl.hector.HectorPersistenceFactory;
import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.utils.ClassUtil;

import com.gonzalo.tourman.Application.Entities.Tournament;
import com.gonzalo.tourman.Application.Entities.User;
import com.gonzalo.tourman.Application.Interfaces.INewTournament;
import com.google.inject.Inject;

public class TournamentApplication {

	private TournamentFactory factory;
	private HectorPersistenceFactory persistenceFactory;
	
	@Inject
	public TournamentApplication(TournamentFactory factory)
	{
		this.factory = factory;
		
	}
	
	public void createTournament(String name, String location, Date startDate, Date endDate) 
	{
		String[] contactNodes = new String[]{"127.0.0.1"};
		int cassandraDefaultPortDefinedInYaml = 9160;
		List<Class<?>> entities = null;
		try {
			entities = ClassUtil.get( "com.gonzalo.tourman.Application.Entities", ColumnFamily.class );
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			this.persistenceFactory = new HectorPersistenceFactory.Builder()
			.defaultConsistencyLevel(ConsistencyLevel.ALL)
			.clusterName("Test Cluster")
			.defaultKeySpace("Tourman")
			.contactNodes(contactNodes)
			.thriftPort(cassandraDefaultPortDefinedInYaml)
			.entities(entities)
			.build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			/*persistenceFactory = new HectorPersistenceFactory();
			persistenceFactory.setDefaultKeySpace("Tourman");
			persistenceFactory.setClusterName("Test Cluster");
			persistenceFactory.setContactNodes(contactNodes);
			//persistenceFactory.setPoolName("Main");
			persistenceFactory.setDebug(false);
			persistenceFactory.setThriftPort(cassandraDefaultPortDefinedInYaml);
			//persistenceFactory.setStartEmbeddedServer(true);
			//persistenceFactory.setEmbeddedServerBaseDir(BASE_DIRECTORY);
			persistenceFactory.setCleanupDirectories(true);
			persistenceFactory.setEntitiesPkg("com.gonzalo.tourman.Application.Entities");
		    persistenceFactory.setDropOnDestroy(true);
		    persistenceFactory.setDefaultConsistencyLevel(ConsistencyLevel.ANY);
			persistenceFactory.init();*/
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		//INewTournament tournament = factory.createTournament(name, location, startDate, endDate);
		//tournament.save();
		Tournament tournament = new Tournament(name, location, startDate, endDate);
		persistenceFactory.persist(tournament);
		
		//User user = new User("Gonzalo", "Bush");
		//persistenceFactory.persist(user);
		
		persistenceFactory.destroy();
		System.out.println("created tournament: " + name);
		System.out.println("start date: " + startDate);
		System.out.println("end date: " + endDate);
		System.out.println("location: " + location);
		
	}

}
