package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class DatasourceConf {

	public DataSource getDataSource() {
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("");
		return new EmbeddedDatabaseBuilder().addScript("").addScript("").build();
	}
}
