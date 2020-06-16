package com.uber.cb.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//@EnableScheduling
public class SchedulerCron {
    @Scheduled(cron = "0 * 9 * * ?")
   public void cronJobSch() {
        System.out.println("This is Cron job");
   }
}
