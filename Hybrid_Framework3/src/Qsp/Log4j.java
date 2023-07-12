package Qsp;

import org.apache.log4j.BasicConfigurator;
import org.apache.poi.util.Configurator;
import org.bouncycastle.crypto.BasicAgreement;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Log4j 
{
	@Test
	public void tc1()
	{
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(getClass().getName());
		log.warn("worn");
		log.info("info");
		log.error("error");
	}


}
