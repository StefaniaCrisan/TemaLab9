package ro.fasttrack.lab9.tema;

import java.util.Date;

public class Programmer extends Employee {
    private String language;

    public Programmer(Date dateOfEmployment, String position, String language) {
        super(dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getPosition() {
        return "programmer";
    }
}
