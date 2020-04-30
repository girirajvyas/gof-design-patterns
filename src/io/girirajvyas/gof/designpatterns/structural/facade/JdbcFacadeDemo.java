package io.girirajvyas.gof.designpatterns.structural.facade;

public class JdbcFacadeDemo {

	public static void main(String[] args) {
		JdbcFacade jdbcFacade = new JdbcFacade();
		jdbcFacade.createTable();
		jdbcFacade.insertIntoTable();
		jdbcFacade.getAddresses();
	}
}
