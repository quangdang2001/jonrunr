package com.example.demo;

import org.jobrunr.jobs.annotations.Job;
import org.springframework.stereotype.Component;
import org.jobrunr.spring.annotations.Recurring;

@Component
public class Worker {

    @Job(name = "doSomeThing")
    @Recurring(id = "doSomeThing", cron = "*/5 * * * * *")
    public void doSomeThing() {
        System.out.println("DO SOME THING SPECIAL!!!");
    }
}
