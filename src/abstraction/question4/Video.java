package abstraction.question4;

public class Video implements Playable {

    @Override
    public void play() {
        System.out.println("Playing video");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video");
    }
}
