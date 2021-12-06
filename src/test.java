public class test{
    public static void main(String[] args){
        System.out.println("123");
        System.out.println("123");
        room a = new room(5, 20, 300, true, true, "Kringe");
        System.out.println(a.ReturnPrice());
        dates x = new dates(1, 1, 2022);
        dates y = new dates(5, 1, 2022);
        dates xx = new dates(3, 1, 2022);
        dates yy = new dates(4, 1, 2022);
        System.out.println(a.bookDate(x, y));
        for(Integer test: a.datesBooked.keySet()){
            System.out.println(dateConverter.convertedToDate(test) + "\n");
        }
    }
}