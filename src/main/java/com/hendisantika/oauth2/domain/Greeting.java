package com.hendisantika.oauth2.domain;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-rest-service-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/17/17
 * Time: 6:05 AM
 * To change this template use File | Settings | File Templates.
 */

public class Greeting {

	private final long id;

	private final String content;

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

}
