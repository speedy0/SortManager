package com.sparta.an.logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerSystem {
    private static final Logger logger = Logger.getLogger("logger");

    private static void setLogger(Level level, String message){
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        //consoleHandler.setLevel(Level.ALL);
        logger.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/mylog.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SaveLogs(logger, level, message);
    }

    public static void getMessage(int level, String message){
        switch (level){
            case 1 -> setLogger(Level.FINEST, message);
            case 2 -> setLogger(Level.FINER, message);
            case 3 -> setLogger(Level.FINE, message);
            case 4 -> setLogger(Level.INFO, message);
            case 5 -> setLogger(Level.SEVERE, message);
            case 6 -> setLogger(Level.WARNING, message);
            default -> setLogger(Level.INFO, message);
        }
    }

    private static void SaveLogs(Logger logger, Level level, String message){
        logger.log(level, message);
    }
}
