package customer;

import sweets.Present;

public class Customer {

    private String name;
    private Present present;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent(Present present) {
        this.present = present;
    }
}
