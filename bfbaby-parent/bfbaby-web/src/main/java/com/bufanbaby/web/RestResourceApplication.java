package com.bufanbaby.web;

import javax.ws.rs.container.ContainerResponseFilter;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.filter.RequestContextFilter;

public class RestResourceApplication extends ResourceConfig {

	public RestResourceApplication() {

		packages("com.porterhead.resource", "com.porterhead.user.resource",
				"com.porterhead.sample");

		register(RequestContextFilter.class);

		ApplicationContext rootCtx = ContextLoader
				.getCurrentWebApplicationContext();
		ContainerResponseFilter filter = rootCtx
				.getBean(JerseyCrossOriginResourceSharingFilter.class);
		register(filter);

		register(GenericExceptionMapper.class);
		register(AccessDeniedExceptionMapper.class);

		register(JacksonFeature.class);

	}
}
