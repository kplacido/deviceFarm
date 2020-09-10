package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Extrato']")
    private MobileElement extratoMenu;


    public String returnExtratoMenuText(){
        return getText(extratoMenu);
    }




}
