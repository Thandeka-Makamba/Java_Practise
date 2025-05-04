package OOP.question8;



public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public String getSeason() {

        switch (this) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return "Winter";
            case MARCH:
            case APRIL:
            case MAY:
                return "Spring";
            case JUNE:
            case JULY:
            case AUGUST:
                return "Summer";
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return "Fall";
        }
        return "";
    }
}
