package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Customer customer) {
		String queryCustomer = "insert into customer (id, name) values (?,?)";
		String queryAddress = "insert into Address (id, address,country) values (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { customer.getId(),
				customer.getName() });
		System.out.println("Inserted into Customer Table Successfully");
		jdbcTemplate.update(queryAddress, new Object[] { customer.getId(),
				customer.getAddress().getAddress(),
				customer.getAddress().getCountry() });
		System.out.println("Inserted into Address Table Successfully");
	}

}
