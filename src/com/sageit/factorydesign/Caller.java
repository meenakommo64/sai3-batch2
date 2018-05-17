package com.sageit.factorydesign;

public class Caller {

	public static void main(String args[]) {

		String name = "";
		
		AppDAO appDAO = DAOFactory.getDAOInstance(name);

		appDAO.create();
		
	}

}
