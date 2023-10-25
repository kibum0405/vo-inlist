package voinlist.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import voinlist.InListApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { InListApplication.class })
public class CucumberSpingConfiguration {}
