package interview.dc.data.misc;

import interview.dc.data.items.BooksDataAccess;


public class DataAccessFactory {
	
	public static DataAccessObject getDataAccessObject(String objectName) {
		DataAccessObject obj = null;
		if (objectName.compareTo("BOOKS")==0) {
			obj = new BooksDataAccess();
		}
		if (objectName.compareTo("CUSTOMERS")==0) {
			
		}
		return obj;
	}

}
