package com.deepskilling.slf4j.exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Logger demo
public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // Log error
        logger.error("This is an error message");
        // Log warn
        logger.warn("This is a warning message");
    }
}
