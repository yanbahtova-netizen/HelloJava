package javaCore2;

public enum Day {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String translation;

    Day(String translation) {
        this.translation = translation;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String getTranslation() {
        return translation;
    }
}
class Test {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.isWeekend());
        System.out.println(day.getTranslation());
    }
}