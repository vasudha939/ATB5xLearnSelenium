package com.testingacademy;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase02 {
        @Test
        @Description("verify the title of TheTestingAcademy website")
        public void vwoLogin(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());


    }
}
