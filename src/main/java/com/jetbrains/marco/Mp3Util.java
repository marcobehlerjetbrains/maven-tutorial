package com.jetbrains.marco;

import com.mpatric.mp3agic.*;

import java.io.IOException;
import java.nio.file.Path;

public class Mp3Util {

    public static String getArtist(Path path) {
        try {
            Mp3File mp3file = new Mp3File(path);
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            return id3v2Tag != null ? id3v2Tag.getAlbumArtist() : null;
        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            return null;
        }
    }
}
