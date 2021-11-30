public class dateConverter {

    public int dateConversion(int d, int m, int y){
        int converted=0;
        for(int i=globals.startYear; i<y; i++){
            if(leapYears.isLeapYear(y)){
                converted += 366;
            }
            else{
                converted += 365;
            }
        }
        switch (m-1){
            case 1, 3, 5, 7, 8, 10, 12:
                converted += 31;
                break;
            case 2:
                if(leapYears.isLeapYear(y)){
                    converted += 29;
                }
                else{
                    converted += 28;
                }
            case 4, 6, 9, 11:
                converted += 30;
                break;
            default: break;
        }
        converted += d;
        return converted;
    }
}
