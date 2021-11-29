import java.util.*;

public class room {
    private int stars=0;
    private int sqrMeters=0;
    private double price=0;
    private boolean wifi=false;
    private boolean parking=false;
    private boolean booked=false;
    private String name = new String();

    public room(int stars, int meters, double price, boolean wifi, boolean parking, boolean booked, String name){
        this.stars = stars;
        sqrMeters = meters;
        this.price = price;
        this.wifi = wifi;
        this.parking = parking;
        this.booked = booked;
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
    public boolean ReturnBooked(){
        return booked;
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
    public void SetBooked(boolean x){
        booked = x;
    }
    public void SetName(String x){
        name = x;
    }
}
