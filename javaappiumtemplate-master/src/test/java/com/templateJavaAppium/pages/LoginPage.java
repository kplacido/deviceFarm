package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends PageBase
{

    @AndroidFindBy(xpath = "//android.view.View[@text='E-MAIL*']/following-sibling::android.widget.EditText")
    private MobileElement emailField;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement senhaField;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='ENTRAR']")
    private MobileElement entrarButton;


    public void fillEmail(String email)
    {
        sendKeys(emailField, email);
    }

    public void fillSenha(String password)
    {
        sendKeys(senhaField, password);
    }

    public void clickEntrarButton()
    {
        click(entrarButton);
    }

}
