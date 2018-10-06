package log4j2demo;

import org.apache.log4j.*;

public class LoggingDemo {

	private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());

	public static void main(String[] args) {
		log.debug("Debugged message logged");
		log.error("error message logged");
		log.fatal("fatal message logged");

	}

}
