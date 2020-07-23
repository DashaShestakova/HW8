package HW8;

import java.util.LinkedList;

public class Person {
    String nick;
    String password;


    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

}
