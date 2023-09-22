package Pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {
    public SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            mobileNumberInput = $("#userNumber");

}
