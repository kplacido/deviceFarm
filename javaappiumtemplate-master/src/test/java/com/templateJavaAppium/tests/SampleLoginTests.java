package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.MainPage;
import com.templateJavaAppium.pages.SampleLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleLoginTests extends TestBase {
    MainPage mainPage;
    SampleLoginPage sampleLoginPage;

    @Test
    public void loginErrado() {
        mainPage = new MainPage();
        sampleLoginPage = new SampleLoginPage();

        String userName = "cleyton";
        String passWord = "1234";
        String mensagem = "You gave me the wrong username and password";

        mainPage.clicarMenuLoginPage();
        sampleLoginPage.informarUserName(userName);
        sampleLoginPage.informarPassword(passWord);
        sampleLoginPage.clicarBotaoLogar();

        Assert.assertEquals(sampleLoginPage.retornarMensagemErro(), mensagem);



    }
}
