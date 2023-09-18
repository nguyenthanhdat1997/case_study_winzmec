package entity;

import java.io.Serializable;

public class Booking implements Serializable {
    private String days;
    private String months;
    private String years;

    public Booking() {
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "days='" + days + '\'' +
                ", months='" + months + '\'' +
                ", years='" + years + '\'' +
                '}';
    }

    public Booking days(String days) {
        this.days = days;
        return this;
    }

    public Booking months(String months) {
        this.months = months;
        return this;
    }

    public Booking years(String years) {
        this.years = years;
        return this;
    }
}
