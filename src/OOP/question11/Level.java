package OOP.question11;

public enum Level {
    EASY, MEDIUM, HARD;

    public String getDescription() {

        switch(this) {
            case EASY:
                return "Suitable for beginners";
            case MEDIUM:
                return "Moderate difficulty";
            case HARD:
                return "Challenging";
        }
        return "";
    }
}
