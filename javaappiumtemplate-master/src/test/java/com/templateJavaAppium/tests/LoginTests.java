package com.templateJavaAppium.tests;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.LoginPage;
import com.templateJavaAppium.pages.ProjetosLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    ProjetosLoginPage projetosLoginPage;
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void verificaAcessoAplicativo() {

        String expectedText = "Projetos disponíveis";

        projetosLoginPage = new ProjetosLoginPage();
        Assert.assertEquals(expectedText, projetosLoginPage.retornaTitulo());
    }

    @Test
    public void realizaLoginSucesso() {

        //Criar novas contas crowdtest - http://blackmirror.crowdtest.me.s3-website-us-east-1.amazonaws.com/tester-projects?selectedIndex=0
        String expectedText = "Extrato";
        String emailLogin = "1a84854c52@emailmonkey.club";
        String senhaLogin = "cypress1";

        projetosLoginPage = new ProjetosLoginPage();
        loginPage = new LoginPage();
        homePage = new HomePage();

        projetosLoginPage.clickLoginButton();
        loginPage.fillEmail(emailLogin);
        loginPage.fillSenha(senhaLogin);
        loginPage.clickEntrarButton();

        Assert.assertEquals(expectedText, homePage.returnExtratoMenuText());
    }

}
