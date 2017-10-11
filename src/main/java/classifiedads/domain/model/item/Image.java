package classifiedads.domain.model.item;

public class Image {
    private String id;
    private String href;

    public Image(String id, String href) {
        this.id = id;
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public String getHref() {
        return href;
    }
}
