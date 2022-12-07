package org.example.proxy.lazy;

public class RealThumbnail implements Thumbnail {

    private final String text;
    private final Image image;

    public RealThumbnail(String text, Image image) {
        this.text = text;
        this.image = image;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Image getImage() {
        return image;
    }
}
