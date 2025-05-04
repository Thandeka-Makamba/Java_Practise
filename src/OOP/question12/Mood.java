package OOP.question12;

public enum Mood {
    HAPPY, SAD, ANGRY;

    public String getDescription() {
        switch(this) {
            case HAPPY:
                return "I'm happy!";
            case SAD:
                return "I'm sad.";
            case ANGRY:
                return "I'm angry!";
        }
        return "";
    }
}
