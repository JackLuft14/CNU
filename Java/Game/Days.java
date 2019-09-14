import java.util.Scanner;
//=====================================================================
// READ!!!!!!!!
// To enter dates via console, set userInput = true
// To manually enter days    , set userInput = false, edit code in 'else'
//
// Note: ONLY WORKS WHEN START AND END ON WEEKDAYS
// Note: Dates must be within the same year
// Note: Does NOT include starting day in final answer 
//       i.e. 01/31 -> 02/05 returns 3 (Feb 1st, Feb 2nd, and Feb 5th)
//
// Hint: If you want to end on a weekend, just enter the previous Friday as finish
//
// Num->Day:    0=Mon, 1=Tue, 2=Wed, 3=Thu, 4=Fri, 5=Sat, 6=Sun
//=====================================================================
public class Days {

    public static void main(String[] args){
        
        boolean userInput = true;   //if false, modify code manually in 'else'
        
        int stday  = 0;     //Do not change here
        int start  = 0;     //Do not change here  
        int finish = 0;     //Do not change here
        
        if (userInput){
            Scanner scan = new Scanner(System.in);
            System.out.println("Starting day of week INT (0=Mon, 4=Fri)");
            stday = scan.nextInt();
            
            System.out.print("Start date  ('mm/dd')-> ");
            String sdate = scan.next();
            System.out.print("Finish date ('mm/dd')-> ");
            String fdate = scan.next();
            scan.close();
            String smonth = sdate.substring(0, 2);
            String fmonth = fdate.substring(0, 2);
            
            int numdays1 = 0;
            switch(smonth){
                case "01" : numdays1 =   0; break;
                case "02" : numdays1 =  31; break;
                case "03" : numdays1 =  59; break;
                case "04" : numdays1 =  90; break;
                case "05" : numdays1 = 120; break;
                case "06" : numdays1 = 151; break;
                case "07" : numdays1 = 181; break;
                case "08" : numdays1 = 212; break;
                case "09" : numdays1 = 243; break;
                case "10" : numdays1 = 273; break;
                case "11" : numdays1 = 304; break;
                case "12" : numdays1 = 334; break;
                default : System.out.println("Enter in mm/dd format with month < 13"); break;
            }
            
            char[] schdate = sdate.toCharArray();
            numdays1 += (schdate[3]-48)*10 + schdate[4]-48;
            //System.out.println(numdays1);
            
            int numdays2 = 0;
            switch(fmonth){
                case "01" : numdays2 =   0; break;
                case "02" : numdays2 =  31; break;
                case "03" : numdays2 =  59; break;
                case "04" : numdays2 =  90; break;
                case "05" : numdays2 = 120; break;
                case "06" : numdays2 = 151; break;
                case "07" : numdays2 = 181; break;
                case "08" : numdays2 = 212; break;
                case "09" : numdays2 = 243; break;
                case "10" : numdays2 = 273; break;
                case "11" : numdays2 = 304; break;
                case "12" : numdays2 = 334; break;
                default : System.out.println("Enter in mm/dd format with month < 13"); break;
            }
            
            char[] fchdate = fdate.toCharArray();
            numdays2 += (fchdate[3]-48)*10 + fchdate[4]-48;
            //System.out.println(numdays2);
            
            
            start  = numdays1;
            finish = numdays2;
        }
        else{
            stday = 2;      //day of week   0=Mon, 1=Tue,...6=Sun
            start = 1;      //date (no month, only day)
            finish = 31;    //date (no month, only day)
        }
        System.out.println();
        
        // DO CALCULATIONS
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int diff   = finish-start;

        int fnday = (stday+diff)%7;   // end day of week, 0=Mon, etc.
        System.out.println("End on: " + days[fnday]);
        System.out.println("Tot days: " + diff);
        
        int numWeekends = 0;
        int temp = stday+diff;
        while(temp > 6){
            temp = temp - 7;
            numWeekends++;      // Every 7 days has one additional weekend
        }
        
        int ANSWER = 0;
        
        //IF BOTH ARE WEEKDAYS
        if (stday < 5 && fnday < 5){
            System.out.println("Weekends: " + numWeekends);
            ANSWER = (diff)-(2*numWeekends);
        }
        else{
            System.out.println("Either start or end date is a weekend!");
        }
        
        System.out.println("WEEKDAYS: " + ANSWER);
    }
}
