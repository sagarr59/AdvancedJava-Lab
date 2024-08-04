package lab4;

import java.io.Serializable;

public class PersonImp implements Serializable {


    private String name;

    // Public no-argument constructor
    public PersonImp() {
    }

    // Constructor with argument
    public PersonImp(String name) {
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
