package mavenstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Logback in maven starter java standalone project");

        logger.debug("getNumber() : {}", getNumber());
        
		System.out.println("Hello World in maven starter java standalone project");
	}
    
    static int getNumber() {
        return 5;
    }
}
