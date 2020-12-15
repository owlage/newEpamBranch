package directory;

public class TextFile extends File{

    private String text = "";

    public TextFile(String nameTextFile, String text) {
        super(nameTextFile);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text += " " + text;
    }
}
