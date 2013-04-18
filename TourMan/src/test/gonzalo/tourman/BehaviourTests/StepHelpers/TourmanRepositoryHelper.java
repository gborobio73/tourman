package test.gonzalo.tourman.BehaviourTests.StepHelpers;

import java.io.IOException;
import java.util.List;

import org.apache.cassandra.thrift.ConsistencyLevel;
import org.firebrandocm.dao.Query;
import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.impl.hector.HectorPersistenceFactory;
import org.firebrandocm.dao.utils.ClassUtil;

import static org.firebrandocm.dao.cql.QueryBuilder.*;


public class TourmanRepositoryHelper {

	public static void emptyRepository() {
		String[] contactNodes = new String[]{"127.0.0.1"};
		int cassandraDefaultPortDefinedInYaml = 9160;
		List<Class<?>> entities;
		try {
			entities = ClassUtil.get( "com.gonzalo.tourman.Application.Entities", ColumnFamily.class );
		HectorPersistenceFactory persistenceFactory = new HectorPersistenceFactory.Builder()
			.defaultConsistencyLevel(ConsistencyLevel.ALL)
			.clusterName("Test Cluster")
			.defaultKeySpace("Tourman")
			.contactNodes(contactNodes)
			.thriftPort(cassandraDefaultPortDefinedInYaml)
			.entities(entities)
			.build();
		
		persistenceFactory.executeQuery(Integer.class, 
				Query.get(
						"TRUNCATE Tournament"
						));
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
