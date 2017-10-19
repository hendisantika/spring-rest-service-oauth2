package com.hendisantika.oauth2.config;

import com.hendisantika.oauth2.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-rest-service-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/17/17
 * Time: 6:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class WebInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}
