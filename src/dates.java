import java.util.ArrayList;

public class dates {
    private int day;
    private int month;
    private int year;
    public dates(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public boolean equals(dates x){
        return day == x.getDay() && month == x.getMonth() && year == x.getYear();
    }

    public String toString(){
        return day + " / " + month + " / " + year;
    }
}
