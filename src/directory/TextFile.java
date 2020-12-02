package directory;

public class TextFile {

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text += " " + text;
    }
}
