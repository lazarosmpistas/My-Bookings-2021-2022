public class dateConverter {

    public static int  dateToConverted(dates date){
        int converted=0;
        int y = date.getYear(), m = date.getMonth(), d = date.getDay();
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
                break;
            case 4, 6, 9, 11:
                converted += 30;
                break;
            default: break;
        }
        converted += d;
        /*
        converted += y;
        converted += 10000 * m;
        converted += 1000000 * d;
        */
        return converted;


    }
    public static dates convertedToDate(int converted){
        int counter=0, y=globals.startYear, m=1, d;

        while(true){
            if(leapYears.isLeapYear(y)){
                counter +=366;
            }
            else{
                counter += 365;
            }
            if(converted <= counter){
                break;
            }
            y++;
        }
        for(int i=globals.startYear; i<y; ++i){
            if(leapYears.isLeapYear(i)){
                converted -=366;
            }
            else{
                converted -= 365;
            }
        }
        counter = 0;

        while(true){
            switch (m){
                case 1, 3, 5, 7, 8, 10, 12:
                    counter += 31;
                    break;
                case 2:
                    if(leapYears.isLeapYear(y)){
                        counter += 29;
                    }
                    else{
                        counter += 28;
                    }
                    break;
                case 4, 6, 9, 11:
                    counter += 30;
                    break;
                default: break;
            }
            if(converted <= counter){
                break;
            }
            m++;
        }
        for(int i=1; i<m; i++){
            switch (i){
                case 1, 3, 5, 7, 8, 10, 12:
                    converted -= 31;
                    break;
                case 2:
                    if(leapYears.isLeapYear(y)){
                        converted -= 29;
                    }
                    else{
                        converted -= 28;
                    }
                    break;
                case 4, 6, 9, 11:
                    converted -= 30;
                    break;
                default: break;
            }
        }
        d = converted;
        return new dates(d, m, y);
    }
}
