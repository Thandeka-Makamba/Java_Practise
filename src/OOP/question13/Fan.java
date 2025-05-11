package OOP.question13;

public class Fan extends SmartDevice implements MoodResponsive {

    Fan(String name, boolean isOn, Mood mood) {
        super(name, isOn, mood);
    }

    @Override
    public void operate() {
        System.out.println("Fan is spinning gently.");
    }

    @Override
    public void respondToMood(Mood mood) {
        switch(this.getMood()) {
            case RELAXED:
                System.out.println("Runs at low speed for a calming breeze.");
            case ENERGETIC:
                System.out.println("Runs at high speed to cool quickly.");
            case NEUTRAL:
                System.out.println("Runs at medium speed.");
        }
        System.out.println("");
    }
}

