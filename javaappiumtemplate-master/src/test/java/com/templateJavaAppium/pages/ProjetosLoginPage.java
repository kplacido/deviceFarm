package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProjetosLoginPage extends PageBase{


    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Projetos disponíveis']")
    private MobileElement projetosLoginPage;


    @AndroidFindBy(xpath ="//*[@class='android.widget.Button' and @text='Login']")
    private MobileElement loginButton;

    public String retornaTitulo(){
        return getText(projetosLoginPage);
    }

    public void clickLoginButton() { click(loginButton); }

}
