package org.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgTestController {

    private static final Logger logger = LoggerFactory.getLogger(OrgTestController.class);

    @GetMapping("/test/org")
    public String testOrgLogging() {
        logger.trace("TRACE level log in org package");
        logger.debug("DEBUG level log in org package");
        logger.info("INFO level log in org package");
        logger.warn("WARN level log in org package");
        logger.error("ERROR level log in org package");
        return "Check logs for org package";
    }
}
