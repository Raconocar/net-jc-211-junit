package Library.users;

import java.util.ArrayList;

public abstract class User {
    String FIO;


    public User(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }
}
