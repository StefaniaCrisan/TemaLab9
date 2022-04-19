package ro.fasttrack.lab9.tema;

import java.util.Date;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(Date dateOfEmployment, String position, String dbTechnology) {
        super(dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public String getAddress() {
        return "db admin: ";
    }
}
