package OOP.question9;

public enum TrafficLight {
    RED, YELLOW, GREEN;

    public int getDuration() {
        switch(this) {
            case RED:
                return 60;
            case YELLOW:
                return 5;
            case GREEN:
                return 30;
        }
        return 0;
    }
}
