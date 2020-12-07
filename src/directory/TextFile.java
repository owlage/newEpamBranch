package directory;

public class TextFile {

    private String nameTextFile;
    private String text = "";

    public TextFile(String nameTextFile, String text) {
        this.nameTextFile = nameTextFile;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text += " " + text;
    }

    public String getNameTextFile() {
        return nameTextFile;
    }

    public void setNameTextFile(String nameTextFile) {
        this.nameTextFile = nameTextFile;
    }
}
