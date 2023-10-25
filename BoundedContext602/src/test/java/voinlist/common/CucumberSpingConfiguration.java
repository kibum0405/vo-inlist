package voinlist.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import voinlist.BoundedContext602Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext602Application.class })
public class CucumberSpingConfiguration {}
