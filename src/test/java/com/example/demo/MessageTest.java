package com.example.demo;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest (showSql = true )
//@AutoConfigureTestDatabase(replace=Replace.NONE)
public class MessageTest {
	
	@Autowired MessageRepo repo;
	@Autowired JdbcTemplate template;
	
	@Autowired private TestEntityManager entityManager;
	
//	@After
//	public void setup() {
//		template.execute("SCRIPT /*NODATA*/ TO './data/dump.sql'");
//	}
	
	@Test
	public void testHello() throws Exception {
		Message m = new Message(13, "13 is my lucky number");
		repo.save(m);
	}

}
