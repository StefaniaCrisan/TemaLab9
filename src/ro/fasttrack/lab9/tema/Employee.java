package ro.fasttrack.lab9.tema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static java.time.Period.between;

public class Employee implements Person {
    private Date dateOfEmployment;
    private String position;

    public Employee(Date dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return "First name: Ionut";
    }

    @Override
    public String getLastName() {
        return "Last name: Grigore";
    }

    @Override
    public int getBirthday(Date birthday, Date date) {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        int d1 = Integer.parseInt(formatter.format(birthday));
        int d2 = Integer.parseInt(formatter.format(date));
        int age = (d2-d1)/10000;
        return age;
     /*   Date today = new Date();
        Date birthday = new Date(1987, 9, 24);
        System.out.println(p.getYears());
        long ageInMillis = new Date().getTime() - getBirthDate().getTime();

        Date age = new Date(ageInMillis);

        return age.getYear();
        return today;   */
    }
    @Override
    public String getAddress() {
        return "Adresa este: ";
    }
}
