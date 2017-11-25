package br.edu.ifpr.fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("servletPU");
	}

	public static EntityManagerFactory get() {
		return factory;
	}
}
