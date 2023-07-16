package creativeDesignPattern.prototype.shallowCopy;

/**
 * Author: shawn
 * createTime: 2023/7/13
 * Description: 歌曲
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song: " + title + " - " + artist;
    }
}

