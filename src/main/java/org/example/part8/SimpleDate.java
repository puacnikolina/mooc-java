package org.example.part8;


public class SimpleDate {
    private int hour;
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = 0;
    }
    public SimpleDate(int day, int month, int year, int hour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object object){
        //ako se nalaze na istom mestu, isti su
        if(this == object){
            return true;
        }

        //ako objekat nije tip SimpleDate nisu isti objekti
        if(!(object instanceof SimpleDate)){
            return false;

        }

        //konvertuje se u SimpleDate i poredimo pojedinacno atribute
        SimpleDate comparedDate = (SimpleDate) object;
        return this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year && this.hour == comparedDate.hour;

    }

    @Override
    public int hashCode() {
        return hour + 24 * day + 768 * month + 9984 * year;
    }
}
