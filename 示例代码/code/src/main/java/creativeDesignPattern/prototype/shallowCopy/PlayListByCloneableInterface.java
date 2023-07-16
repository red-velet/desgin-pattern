package creativeDesignPattern.prototype.shallowCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: shawn
 * createTime: 2023/7/13
 * Description: 歌单
 */
public class PlayListByCloneableInterface implements Cloneable, Serializable {
    private String name;
    private List<Song> songs;

    public PlayListByCloneableInterface(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public PlayListByCloneableInterface shallowCopy(String newName) {
        PlayListByCloneableInterface copy = new PlayListByCloneableInterface(newName);
        copy.songs = new ArrayList<>(songs);
        return copy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayList: ").append(name).append("\n");
        for (Song song : songs) {
            sb.append("- ").append(song).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PlayListByCloneableInterface playList = new PlayListByCloneableInterface("歌单-全是redvelet的歌");
        playList.addSong(new Song("feel my rhythm", "redvelet"));
        playList.addSong(new Song("psycho", "redvelet"));
        playList.addSong(new Song("bad boy", "redvelet"));

        //创建一个新歌单,歌单包含原歌单playList1的所有歌曲,自己在新增歌曲
        PlayListByCloneableInterface newPlayList = (PlayListByCloneableInterface) playList.clone();
        newPlayList.setName("歌单-全是kpop的歌");
        System.out.println("playList = " + playList);
        System.out.println("newPlayList = " + newPlayList);

        //修改新歌单内的歌曲bad boy为人员为wendy,旧歌单的原信息会改变吗?
        Song song = newPlayList.getSongs().get(2);
        song.setArtist("wendy");

        System.out.println("修改新歌单内的歌曲bad boy");
        System.out.println("playList = " + playList);
        System.out.println("newPlayList = " + newPlayList);
    }
}
