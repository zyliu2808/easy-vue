package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import bean.CdPlayers;
import bean.CompactDisc;

@Configuration
@Import(CompactDiscConf.class)
/*@ImportResource("")*/
public class CdPlayerConf {
	@Bean
	public CdPlayers getCdPlayers(CompactDisc cd) {
		return new CdPlayers(cd);
	}
}
