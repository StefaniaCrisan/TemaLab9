package ro.fasttrack.lab9.tema;

import java.util.Date;

public interface Person {
    String getFirstName();

    String getLastName();

    int getBirthday(Date birthday, Date date);

    String getAddress();
}
