package org.example;

import org.example.proxy.lazy.ProxyThumbnail;
import org.example.proxy.lazy.Thumbnail;

public class Main {
    public static void main(String[] args) {
        playOriginalProxy();
    }

    private static void playOriginalProxy() {
        Thumbnail thumbnail = new ProxyThumbnail("hello");
        System.out.println(thumbnail.getText());
        System.out.println(thumbnail.getImage());
    }

}
