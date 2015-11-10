package center.rodrigo.core;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jCore {

    Logger log = Logger.getLogger(Log4jCore.class);

    public void gerarLog() {

        // Configurações basicas, ou arquivo log4j.properties
        // BasicConfigurator.configure();

        log.trace("Logando - Trace");
        log.debug("Logando - Debug");
        log.info("Logando - Info");
        log.warn("Logando - Warn");
        log.error("Logando - Error");
        log.fatal("Logando - Fatal");
    }
}
