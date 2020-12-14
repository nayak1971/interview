package interview.dc.data.misc;

import interview.dc.data.resources.MappedObject;

import java.sql.Connection;
import java.util.List;

public abstract class BaseDataAccess implements DataAccessObject {
	
	public Connection getConnection() {
		// required details to establish DB connection
		Connection conn = null;
		return conn;
	}
	
	abstract public MappedObject read(MappedObject mo);
	abstract public boolean update(MappedObject mo);
	abstract public boolean delete(MappedObject mo);
	abstract public MappedObject create(MappedObject mo);
	abstract public List<MappedObject> getAll();

}
