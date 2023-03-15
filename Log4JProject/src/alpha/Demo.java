package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		log.debug("I input The user Name");
		log.info("User name desplaied");
		log.error("user name not shown");
		log.fatal("tag is missing");
		
		

	}

}
