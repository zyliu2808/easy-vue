package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
 	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		/*auth.inMemoryAuthentication().withUser("one").password("123").roles("USER").and()
			.withUser("two").password("123").roles("USER","ADMIN");*/
		auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery("")
			.authoritiesByUsernameQuery("")
			.groupAuthoritiesByUsername("")
			.passwordEncoder(new StandardPasswordEncoder("53cr3t"));
		auth.ldapAuthentication().userSearchFilter("{uid={0}}").groupSearchFilter("{member={0}}");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/spitter/**").authenticated()
			.antMatchers(HttpMethod.POST, "").authenticated()
			.anyRequest().permitAll();
	}

	
}
