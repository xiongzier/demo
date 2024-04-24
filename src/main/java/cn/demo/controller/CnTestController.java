package cn.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CnTestController {

    private static final Logger logger = LoggerFactory.getLogger(CnTestController.class);

    @GetMapping("/test/cn")
    public String testCnLogging() {
        logger.trace("TRACE level log in cn package");
        logger.debug("DEBUG level log in cn package");
        logger.info("INFO level log in cn package");
        logger.warn("WARN level log in cn package");
        logger.error("ERROR level log in cn package");
        return "Check logs for cn package";
    }
}
