public class time {

    protected int days=0;

    public time(){}

    public void setDays(int year){
        if(year % 4 != 0)
            days = 365;
        else if(year % 100 != 0)
            days = 366;
        else if(year % 400 == 0)
            days = 366;
        else
            days = 365;
    }

    public int returnDays(){
        return days;
    }

}
