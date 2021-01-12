package by.Spring.SpringCource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
             "ApplicationContext.xml"
        );

        //Music music = context.getBean("musicBean",Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        context.close();
    }
}
