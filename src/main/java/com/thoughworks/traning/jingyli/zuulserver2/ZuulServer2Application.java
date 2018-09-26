package com.thoughworks.traning.jingyli.zuulserver2;

import com.thoughworks.traning.jingyli.zuulserver2.filter.pre.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class ZuulServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServer2Application.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
