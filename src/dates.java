import java.util.ArrayList;

public class dates{

    /*public dates(int year){
        globals x;
        time years[];
        for(int i=0; i<5; i++){
            years[i] = new time(x.startYear+i);
        }
        datesBooked1 = new boolean[];
        for(int i=0; i<days; i++){
            dateBooked[i] = false;
        }
    }
    */
    ArrayList<Integer> datesBooked;
    public dates(){
        datesBooked = new ArrayList<>();
    }

    public int dateConversion(int d, int m, int y){
        int converted=0;
        for(int i=0; i<y; i++){
            if(leapYears.isLeapYear(y)){
                converted += 366;
            }
            else{
                converted += 365;
            }
        }
        switch (m){
            case 1: converted += 31; break;
            case 2:
                if(leapYears.isLeapYear()){
                    converted += 29;
                }
                else{
                    converted += 28;
                }
            case 3: converted += 31; break;
            case 4: converted += 30; break;
            case 5: converted += 31; break;
            case 6: converted += 30; break;
            case 7: converted += 31; break;
            case 8: converted += 31; break;
            case 9: converted += 30; break;
            case 10: converted += 31; break;
            case 11: converted += 30; break;
            case 12: converted += 31; break;
        }
        converted += d;
    }

    public boolean addDates()
}
