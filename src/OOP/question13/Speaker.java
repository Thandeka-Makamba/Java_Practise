package OOP.question13;

public class Speaker extends SmartDevice implements MoodResponsive {

    Speaker(String name, boolean isOn, Mood mood) {
        super(name, isOn, mood);
    }

    @Override
    public void operate() {
        System.out.println("Speaker is playing music");
    }

    @Override
    public void respondToMood(Mood mood) {
        switch(this.getMood()) {
            case RELAXED:
                System.out.println("Playing soft ambient music.");
            case ENERGETIC:
                System.out.println("Playing upbeat, high-energy tracks.");
            case NEUTRAL:
                System.out.println("Playing default playlist at medium volume.");
        }
        System.out.println("");
    }
}
