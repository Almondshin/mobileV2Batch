package com.batch.mobilev2batch.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class batchController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*
     * 5초 마다 실행
     */
    @Scheduled(fixedDelay=5000)
    public void init() {
        System.out.println("init");
    }

    /**
     * 매일 22시에 수행
     */
    @Scheduled(cron="0 00 22 * * ?")
    public void download() {
        System.out.println("download");
    }

}
