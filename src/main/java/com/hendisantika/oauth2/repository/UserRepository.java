package com.hendisantika.oauth2.repository;

import com.hendisantika.oauth2.domain.User;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-rest-service-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/17/17
 * Time: 6:07 AM
 * To change this template use File | Settings | File Templates.
 */

public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);
}
