/*
import java.util.ArrayList;
import java.util.HashMap;

public class bookedDates{

    ArrayList<Integer> datesBooked;
    public bookedDates(){
        datesBooked = new ArrayList<>();
    }

    public boolean bookDate(int d1, int m1, int y1, int d2, int m2, int y2){
        //*first date CHECK IN, second date CHECK OUT (2nd date can be later booked)*
        int convertedDateCheckIn = dateConverter.dateConversion(d1, m1, y1);
        int convertedDateCheckOut = dateConverter.dateConversion(d2, m2, y2);
        boolean flagBooked = false;
        if(!datesBooked.isEmpty()){
            for(int i=convertedDateCheckIn; i<convertedDateCheckOut; ++i){
                if(datesBooked.contains(i)){
                    flagBooked = true;
                    break;
                }
            }
        }
        if(flagBooked){
            return false;
        }
        else {
            for (int i = convertedDateCheckIn; i < convertedDateCheckOut; ++i) {
                datesBooked.add(i);
            }
            return true;
        }
    }
    public boolean removeBook(int d, int m, int y){
        int convertedDate = dateConverter.dateConversion(d, m, y);
        if(datesBooked.contains(convertedDate)){
            datesBooked.remove(convertedDate);
            return true;
        }
        else{
            return false;
        }
    }

}
*/