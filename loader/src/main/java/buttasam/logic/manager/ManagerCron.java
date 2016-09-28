package buttasam.logic.manager;

import buttasam.logic.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ManagerCron {


    @Autowired
    private TimeService timeService;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        timeService.logCurrentTime();
    }
}