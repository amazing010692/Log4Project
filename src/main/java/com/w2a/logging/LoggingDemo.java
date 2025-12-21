package com.w2a.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
    
    private static final Logger logger = LogManager.getLogger(LoggingDemo.class);
    
    public static void main(String[] args) {
        logger.debug("This is a Debug Log");
        logger.info("This is an Info Log");
        logger.warn("This is a Warning Log");
        logger.error("This is an Error Log");
        logger.fatal("This is a Fatal Log");
    }
}