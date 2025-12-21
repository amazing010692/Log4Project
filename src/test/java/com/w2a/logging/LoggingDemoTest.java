package com.w2a.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemoTest {
    
    private static final Logger logger = LogManager.getLogger(LoggingDemoTest.class);
    
    public void testLogging() {
        logger.info("Test logging functionality");
        logger.debug("Debug test message");
        logger.warn("Warning test message");
        logger.error("Error test message");
    }
    
    public static void main(String[] args) {
        LoggingDemoTest test = new LoggingDemoTest();
        test.testLogging();
        logger.info("All tests completed successfully");
    }
}