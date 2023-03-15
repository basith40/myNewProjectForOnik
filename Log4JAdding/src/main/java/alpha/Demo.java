package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		log.error("iam error");
		log.debug("i love you");
		log.info("you love me");
		log.fatal("we love each");
	}

}
