package com.test.core;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class launch{

        @Managed
        protected WebDriver driver;
        @Test
        public void launchBrowser(){
            driver.get("https://www.google.co.uk/");
//    System.out.println(AnsiEscapes.GREEN+"Title is : " +driver.getTitle());
//    System.out.println(AnsiEscapes.GREEN+"First Pipeline Test");

        }
        @Test
        public void goToBBC(){
            driver.get("https://www.bbc.co.uk/");
//        System.out.println(AnsiEscapes.GREEN+"Title is : " +driver.getTitle());

        }


}
