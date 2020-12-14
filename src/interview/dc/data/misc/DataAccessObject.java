package interview.dc.data.misc;

import interview.dc.data.resources.MappedObject;

import java.util.List;

public interface DataAccessObject {
	
	public MappedObject read(MappedObject mo);
	public boolean update(MappedObject mo);
	public boolean delete(MappedObject mo);
	public MappedObject create(MappedObject mo);
	public List<MappedObject> getAll();
}
