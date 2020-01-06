package classdesign.lcp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void ConsoleLogger() {
        Logger logger = new ConsoleLogger();
        logger.debug();
        logger.info();
    }

    @Test
    public void VoidLogger() {
        Logger logger = new VoidLogger();
        logger.debug();
        logger.info();
    }
}