package br.com.yanaga.tdc2012.spring.profiles;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.yanaga.tdc2012.spring.profiles.config.Config;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles("teste")
public class JpaTest {

	@PersistenceContext
	private EntityManager entityManager;

	@Test
	public void testPersist() {
		ProgramadorJava programadorJava = new ProgramadorJava("Yanaga");
		entityManager.persist(programadorJava);
	}

}