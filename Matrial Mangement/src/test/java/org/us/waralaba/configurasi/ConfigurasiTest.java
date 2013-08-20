package org.us.waralaba.configurasi;

import org.apache.log4j.Logger;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/app-context.xml" })
public class ConfigurasiTest {
	private Logger log = Logger.getLogger(ConfigurasiTest.class);
	
	@Test
	public void encryptPassword(){
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword("adilgantengsekali");
		String myEncryptedText = textEncryptor.encrypt("programmer1!");
		log.info("ini hasil : ENC("+myEncryptedText +")");
	}
}
