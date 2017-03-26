package com.java.test;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber; 

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = "src/resources/CarPool.feature")
	
//Specifying pretty as a format option ensure that HTML report will be generated. 
//When we specify html:target/Destination - It will generate the HTML report 

 
public class TestRunner { }