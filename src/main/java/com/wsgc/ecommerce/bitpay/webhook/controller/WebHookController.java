package com.wsgc.ecommerce.bitpay.webhook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebHookController {

    private static final Logger log = LoggerFactory.getLogger(WebHookController.class);

    @PostMapping("/bitpay/webhook")
    public ResponseEntity<Void> webHook(@RequestBody Object requestBody) {
        log.info("IPN received: [{}]", requestBody);
        return ResponseEntity.ok() //
        .build();
    }
}
