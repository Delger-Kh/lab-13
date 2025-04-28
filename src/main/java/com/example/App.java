package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            int result = divide(10, 2);
            logger.debug("Division result: {}", result);
        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage(), e);
        }

        logger.info("Application finished");
    }

    public static int divide(int a, int b) {
        logger.info("Dividing {} by {}", a, b);
        return a / b;
    }
}
