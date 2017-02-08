package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.sun.xml.internal.messaging.saaj.soap.Envelope;

import bean.CompactDisc;
import bean.OneCompactDisc;

@Configuration
/*@ComponentScan(basePackages={"bean","controller"})*/
/*@ComponentScan(basePackageClasses={CompactDisc.class,TestController.class})*/
@PropertySource("classpath:db.properties")
@EnableAspectJAutoProxy
public class CompactDiscConf {

	@Autowired
	Environment env;
	@Bean(name="disc")
	public CompactDisc getCompactDisc() {
		return new OneCompactDisc(env.getProperty("name"));
	}
}
