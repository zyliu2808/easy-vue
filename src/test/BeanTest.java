package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bean.CompactDisc;
import bean.CompactDiscConf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CompactDiscConf.class)
public class BeanTest {

	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		Assert.assertNotNull(cd);
	}
}
