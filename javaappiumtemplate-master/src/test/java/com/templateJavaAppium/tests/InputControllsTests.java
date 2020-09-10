package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.InputControlsPage;
import com.templateJavaAppium.pages.MainPage;
import com.templateJavaAppium.utils.Utils;
import jdk.internal.util.xml.impl.Input;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class InputControllsTests extends TestBase {

    MainPage mainPage;
    InputControlsPage inputControlsPage;
    Utils utils;

    @Test
    public void preecherTextField(){
        mainPage = new MainPage();
        inputControlsPage = new InputControlsPage();

        String texto = utils.getStringRadom(50);

        mainPage.clicarMenuInputControls();
        inputControlsPage.preencherTexto(texto);

        Assert.assertEquals(inputControlsPage.retonarTextoPreenchido(),texto);


    }

}
