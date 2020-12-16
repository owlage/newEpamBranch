package builder;

import sweets.Present;

public abstract class PresentBuilder {

    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}
