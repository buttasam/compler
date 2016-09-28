package cvut.fit.logic.service;

import cvut.fit.logic.ProviderObject;
import cvut.fit.logic.ProviderService;
import cvut.fit.logic.manager.ManagerCron;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeService {

    private static final Logger log = LoggerFactory.getLogger(ManagerCron.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private ProviderService providerService;

    public void logCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));

        ProviderObject providerObject = new ProviderObject();

        providerService.test();
        providerObject.test();
    }


    public boolean testMethod() {
        return true;
    }

}
