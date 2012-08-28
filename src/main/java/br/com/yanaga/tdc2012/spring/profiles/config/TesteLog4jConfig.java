package br.com.yanaga.tdc2012.spring.profiles.config;

import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.Log4jConfigurer;

import br.com.yanaga.tdc2012.spring.profiles.config.annotation.Teste;

@Teste
@Configuration
public class TesteLog4jConfig {

	@PostConstruct
	public void init() throws FileNotFoundException {
		Log4jConfigurer.initLogging("classpath:teste-log4j.properties");
	}

}