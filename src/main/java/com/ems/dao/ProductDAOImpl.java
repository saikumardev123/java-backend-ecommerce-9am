package com.ems.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ems.model.Employee;
import com.ems.model.Product;

@Repository
public class ProductDAOImpl  implements ProductDAO{
	
	@Autowired
	 EntityManager entityManager;
		
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// code
		 System.out.println("In productDAO Impl" + product);
		 session.save(product);
		
	}

	@Override
	public List<Product> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// code
		 System.out.println("In productDAO Impl" + product);
		 session.update(product);
	}
	
	@Override
	public void delete(int  id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("dao");
				Session session = entityManager.unwrap(Session.class);
				// code
				Product product =  session.load(Product.class, id);
				session.delete(product);
	}

}
