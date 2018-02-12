package za.co.ajk.integration.cucumber.stepdefs;

import za.co.ajk.integration.IntegrationModuleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IntegrationModuleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
