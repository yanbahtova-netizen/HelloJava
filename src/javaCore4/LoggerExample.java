package javaCore4;
import java.util.logging.*;

public class LoggerExample {

    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.info("Все хорошо");
        logger.warning("Произошла ошибка");
    }
}
