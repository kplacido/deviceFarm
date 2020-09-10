package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;

public class MainPage extends PageBase {
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='ReferenceApp']")
    private MobileElement menu;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Login Page']" )
    private  MobileElement menuLogin;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Input Controls']" )
    private  MobileElement inputControls;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Alerts']" )
    private  MobileElement alerts;


    public void clicarMenu() {
        click(menu);
    }
    public void clicarMenuLoginPage() {
        clicarMenu();
        click(menuLogin);
    }
    public void clicarMenuInputControls() {
        clicarMenu();
        click(inputControls);
    }
    public void clicarMenuAlerts() {
        clicarMenu();
        click(alerts);
    }


}
