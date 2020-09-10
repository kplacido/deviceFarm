package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.testng.reporters.jq.Main;

public class SampleLoginPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/username_text_input")
    private MobileElement userName;
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/password_text_input")
    private MobileElement passWord;
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_button")
    private MobileElement botaoLogar;
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView")
    private MobileElement mensagem;

    public void informarUserName(String name){
        sendKeys(userName,name);
    }

    public void informarPassword(String senha) {
        sendKeys(passWord,senha);
    }

    public void clicarBotaoLogar(){
        click(botaoLogar);
    }
    public String retornarMensagemErro(){
       return getText(mensagem);
    }




}
