package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AlertsPage extends PageBase {
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private MobileElement alertButton;
    @AndroidFindBy(id = "android:id/message")
    private MobileElement mensagemAlert;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okAlert;


    public void clicarBotaoAlert() {
        click(alertButton);
    }
    public String retornarMensagemAlert() {
        return getText(mensagemAlert);
    }
    public void confirmarAlert() {
        click(okAlert);
    }


}
