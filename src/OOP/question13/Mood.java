package OOP.question13;

public enum Mood {
    RELAXED, ENERGETIC, NEUTRAL;

    public String getDescription() {
        switch(this) {
            case RELAXED:
                return " reacts to RELAXED";
            case ENERGETIC:
                return " reacts to ENERGETIC";
            case NEUTRAL:
                return " reacts to NEUTRAL";
        }
        return "";
    }
}
