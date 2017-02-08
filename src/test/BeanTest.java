package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.org.apache.xml.internal.security.Init;

import bean.CdPlayers;
import config.CdPlayerConf;
import config.CompactDiscConf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CompactDiscConf.class,CdPlayerConf.class})
@ActiveProfiles("dev")
public class BeanTest {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Autowired(required=false)
	private CdPlayers cd;
	
	@Before
	public void Init() {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}
	
	@Test
	public void test() {
		Assert.assertNotNull(cd);
		System.out.println(cd.getClass().getName());
		session.get(BeanTest.class,1);
	}
}
