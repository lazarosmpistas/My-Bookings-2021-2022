import java.util.*;

public class room {
    private int stars;
    private int sqrMeters;
    private double price;
    private boolean wifi;
    private boolean parking;
    private String name;

    public HashMap<Integer, dates> datesBooked;


    public room(int stars, int meters, double price, boolean wifi, boolean parking, String name){
        datesBooked = new HashMap<>();
        this.stars = stars;
        sqrMeters = meters;
        this.price = price;
        this.wifi = wifi;
        this.parking = parking;
        this.name = name;
    }
    //getters
    public int ReturnStars(){
        return stars;
    }
    public int ReturnMeters(){return sqrMeters;}
    public double ReturnPrice(){
        return price;
    }
    public boolean ReturnWifi(){
        return wifi;
    }
    public boolean ReturnParking(){
        return parking;
    }
    public String ReturnName(){
        return name;
    }
    //setters
    public void SetStars(int stars){
        this.stars = stars;
    }
    public void SetMeters(int meters){
        sqrMeters = meters;
    }
    public void SetPrice(double x){
        price = x;
    }
    public void SetWifi(boolean x){
        wifi = x;
    }
    public void SetParking(boolean x){
        parking = x;
    }
    public void SetName(String x){ name = x; }

    public boolean bookDate(dates checkIn, dates checkOut){
        int checkInConverted, checkOutConverted;
        checkInConverted = dateConverter.dateToConverted(checkIn);
        checkOutConverted = dateConverter.dateToConverted(checkOut);
        for(int i=checkInConverted; i<checkOutConverted; i++){
            if(datesBooked.containsKey(i)){
                return false;
            }
        }
        for(int i=checkInConverted; i<checkOutConverted; i++){
            datesBooked.put(i, dateConverter.convertedToDate(i));
        }
        return true;
    }
}
