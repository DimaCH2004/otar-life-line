package data;


import java.sql.SQLException;

public class Student {
    private String
            firstName,
            lastName,
            phone;

    public Student(RetriveData retriveData) throws SQLException {
        this.firstName = retriveData.resultSet.getString("firstName");
        this.lastName = retriveData.resultSet.getString("lastName");
        this.phone = retriveData.resultSet.getString("phone");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}