package com.example.demo;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest (showSql = true )
/*  */
//@AutoConfigureTestDatabase(replace=Replace.NONE) 
public class MessageTest {
	
	@Autowired MessageRepo repo;
	@Autowired JdbcTemplate template;
	
	@After
	public void post() {
		template.execute("SCRIPT NODATA TO './data/dump.sql'");
	}

	@Test
	public void testHello() throws Exception {
		Message m = new Message(2, "Hallo World!");
		repo.save(m);
	}

}
