package Steps;

import Pages.PracticeFormPage;

public class PracticeFormPageSteps {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    public void setFirstName(String firstName) {
        practiceFormPage.firstNameInput.setValue(firstName);
    }

    public void setLastName(String lastName) {
        practiceFormPage.lastNameInput.setValue(lastName);
    }

    public void setMobileNumber(String mobileNumber) {
        practiceFormPage.mobileNumberInput.setValue(mobileNumber);
    }
}
