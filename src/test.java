public class test{
    public static void main(String[] args){
        System.out.println("123");
        System.out.println("123");
        room a = new room(5, 20, 300, true, true, false, "Kringe");
        System.out.println(a.ReturnBooked());
        System.out.println(a.ReturnPrice());
    }
}