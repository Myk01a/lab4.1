package org.ntuhpi.task2;
public enum Month {
    СІЧЕНЬ("Січень", "Январь", 31),
    ЛЮТИЙ("Лютий", "Февраль", 28),
    БЕРЕЗЕНЬ("Березень", "Март", 31),
    КВІТЕНЬ("Квітень", "Апрель", 30),
    ТРАВЕНЬ("Травень", "Май", 31),
    ЧЕРВЕНЬ("Червень", "Июнь", 30),
    ЛИПЕНЬ("Липень", "Июль", 31),
    СЕРПЕНЬ("Серпень", "Август", 31),
    ВЕРЕСЕНЬ("Вересень", "Сентябрь", 30),
    ЖОВТЕНЬ("Жовтень", "Октябрь", 31),
    ЛИСТОПАД("Листопад", "Ноябрь", 30),
    ГРУДЕНЬ("Грудень", "Декабрь", 31);

    private String nameUkr;
    private String nameRus;
    private int days;

    private Month(String nameUkr, String nameRus, int days) {
        this.nameUkr = nameUkr;
        this.nameRus = nameRus;
        this.days = days;
    }

    public String getNameUkr() {
        return nameUkr;
    }

    public String getNameRus() {
        return nameRus;
    }

    public int getDays() {
        return days;
    }

    public Month getPreviousMonth() {
        int index = (this.ordinal() - 1 + 12) % 12;
        return Month.values()[index];
    }

    public Month getNextMonth() {
        int index = (this.ordinal() + 1) % 12;
        return Month.values()[index];
    }

    public String getSeason() {
        int monthNumber = this.ordinal();
        if (monthNumber >= 2 && monthNumber <= 4) {
            return "Весна";
        } else if (monthNumber >= 5 && monthNumber <= 7) {
            return "Літо";
        } else if (monthNumber >= 8 && monthNumber <= 10) {
            return "Осінь";
        } else {
            return "Зима";
        }
    }

    @Override
    public String toString() {
        return "Місяць: " + nameUkr + " (" + nameRus + "), Кількість днів: " + days;
    }

    public static void printAllMonths() {
        for (Month month : Month.values()) {
            System.out.println(month.toString());
        }
    }


}

