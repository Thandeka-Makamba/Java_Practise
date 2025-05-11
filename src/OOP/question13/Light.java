package OOP.question13;

public class Light extends SmartDevice implements MoodResponsive {

    Light(String name, boolean isOn, Mood mood) {
        super(name, isOn, mood);
    }

    @Override
    public void operate() {
        System.out.println("Light is glowing warmly.");
    }

    @Override
    public void respondToMood(Mood mood) {
        switch(this.getMood()) {
            case RELAXED:
                System.out.println("Dimmed warm light.");
            case ENERGETIC:
                System.out.println("Bright white light.");
            case NEUTRAL:
                System.out.println("Standard brightness.");
        }
        System.out.println("");
    }
}
