package org.example.proxy.lazy;

public class ProxyThumbnail implements Thumbnail {

    private final String text;
    private Thumbnail thumbnail;

    public ProxyThumbnail(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public Image getImage() {
        if (this.thumbnail == null) {
            this.thumbnail = new RealThumbnail(text, new Image());
            System.out.println("proxy: load original Image");
        }

        return this.thumbnail.getImage();
    }
}
