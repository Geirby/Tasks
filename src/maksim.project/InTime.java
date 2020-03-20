package maksim.project;

public class InTime {
    public static void main(String[] args) {
        System.out.println("введите часы ");
        int p = CommonMethods.getUserInteger();
        switch (getDayType(p)) {
            case NIGHT:
                System.out.println("Good Night");
            case MORNING:
                System.out.println("Good Morning");
            case DAY:
                System.out.println("Good Day");
            case EVENING:
                System.out.println("Good Evening");
        }

    }

    public enum DayType {
        NIGHT,
        MORNING,
        DAY,
        EVENING;
    }

    public static DayType getDayType(int p) {
        if (p >= 0 && p < 6) {
            return DayType.NIGHT;
        } else if (p >= 6 && p < 13) {
            return DayType.MORNING;
        } else if (p >= 13 && p < 17) {
            return DayType.DAY;
        } else if (p >= 17 && p < 24) {
            return DayType.EVENING;
        } else {
            throw new RuntimeException();
        }

    }
}
