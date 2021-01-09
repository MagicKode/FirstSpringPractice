package by.Spring.SpringCource;

public class MusicPlayer {
    private Music music;

    //нверсия управления (внедряем зависимость)
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
