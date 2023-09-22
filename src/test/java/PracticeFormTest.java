import Steps.PracticeFormPageSteps;
import org.testng.annotations.Test;
import data.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    PracticeFormPageSteps practiceFormPageSteps;
    Student student;
    RetriveData retriveData;

    @Test
    public void fillForm() throws SQLException {
        practiceFormPageSteps = new PracticeFormPageSteps();
        retriveData = new RetriveData();
        student = new Student(retriveData);
        retriveData.retriveData();

        open("https://demoqa.com/automation-practice-form");
        while (RetriveData.resultSet.next()) {
            practiceFormPageSteps.setFirstName(student.getFirstName());
            practiceFormPageSteps.setLastName(student.getLastName());
            practiceFormPageSteps.setMobileNumber(student.getPhone());
        }
        retriveData.close();
    }
}
