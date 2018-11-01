package estelwu.sample;

public class SimpleItemEntity {

    private String defaultText;

    public SimpleItemEntity(String text) {
        setDefaultText(text);
    }

    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String text) {
        this.defaultText = text;
    }
}
