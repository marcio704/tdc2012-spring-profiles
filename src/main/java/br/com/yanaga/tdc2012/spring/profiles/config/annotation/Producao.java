package br.com.yanaga.tdc2012.spring.profiles.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;

@Profile("producao")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Producao {

}
