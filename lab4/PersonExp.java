package lab4;

import java.io.Serializable;

public class PersonExp implements Serializable {


    private String name;

    // Public no-argument constructor
    public PersonExp() {
    }

    // Constructor with argument
    public PersonExp(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
