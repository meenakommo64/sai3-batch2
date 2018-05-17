package com.sageit.factorydesign;

public class DAOFactory {

	public static AppDAO getDAOInstance(String name) {

		AppDAO appDAO = null;

		if (name.equals("")) {
			appDAO = new OracleAppDAO();
		} else {
			appDAO = new PostGresAppDAO();
		}

		return appDAO;
		
	}

}
