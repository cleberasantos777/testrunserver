package com.gunnerapps.testrunserver.service;

import org.junit.jupiter.api.Test;

public class RunFromServerServiceTest {

    RunFromServerService runFromServerService = new RunFromServerService();

    //@Autowired
    //RunFromServerService runFromServerService2;

    @Test
    public void mustPrintMessageOnScreen(){
        runFromServerService.printMessageOnScreen();
    }

}
