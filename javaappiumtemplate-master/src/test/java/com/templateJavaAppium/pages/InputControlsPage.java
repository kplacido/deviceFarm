package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InputControlsPage extends PageBase {
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement textoField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Checkbox']")
    private MobileElement checkBox;

    public void preencherTexto(String texto) {
        sendKeys(textoField,texto);
    }
    public String  retonarTextoPreenchido() {
        return getText(textoField);
    }

    public void clicarMenuCheckBox() {
        swipeElementWithDirection(checkBox,"RIGHT");
    }


}
