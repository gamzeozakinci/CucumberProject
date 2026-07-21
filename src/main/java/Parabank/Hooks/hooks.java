package Parabank.Hooks;

import Parabank.utils.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends GWD {

    @Before
    public void setUp() {

        System.out.println("--- Senaryo Başladı ---");
    }

    @After
    public void tearDown(Scenario scenario) {

        System.out.println("--- Senaryo Bitti, Tarayıcı Kapatılıyor ---");
        quitDriver();
    }

}
