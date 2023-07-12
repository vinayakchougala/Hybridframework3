package Qsp;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Printmasgon 
{
	@Test
	public void test1() throws IOException
	{
		Layout lay = new PatternLayout("%d %c %m %n");
		Appender app = new FileAppender(lay,"./Report1/r2.log");
		BasicConfigurator.configure();
	 Logger log = Logger.getLogger(getClass().getName());
	 log.warn("warn");
	 log.info("info");
	 log.error("error");
	}

}
