package br.com.yanaga.tdc2012.spring.profiles.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class ProgramadorController {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<String> getNomes() {
		Query query = entityManager.createQuery("select p.nome from ProgramadorJava p");
		return query.getResultList();
	}

}
