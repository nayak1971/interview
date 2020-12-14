package interview.dc.data.items;

import java.util.List;

import interview.dc.data.misc.BaseDataAccess;
import interview.dc.data.resources.MappedObject;

public class BooksDataAccess extends BaseDataAccess {

	public MappedObject read(MappedObject mo) {
		MappedObject book = null;
		return book;
	}
	public boolean update(MappedObject mo) {
		return true;
	}
	public boolean delete(MappedObject mo) {
		return true;
	}
	public MappedObject create(MappedObject mo) {
		return mo;
	}
	public List<MappedObject> getAll() {
		List<MappedObject> booksList = null;
		// read using connection
		// build the list of books
		// close connection
		// returnt he list of books
		return booksList;
	}
}
