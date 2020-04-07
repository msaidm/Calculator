package testingproject;
public class TimeConverter 
{   public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "Seconds":
                switch(To)
                {
                    case "Seconds": return SecondToSecond(Value);
                    case "Minutes": return SecondToMinute(Value);
                    case "Hours": return SecondToHour(Value);
                    case "Days": return SecondToDay(Value);
                    case "Weeks": return SecondToWeek(Value);
                    case "Years": return SecondToYear(Value);
                }
                
            case "Minutes":
                switch(To)
                {
                    case "Seconds": return MinuteToSecond(Value);
                    case "Minutes": return MinuteToMinute(Value);
                    case "Hours": return MinuteToHour(Value);
                    case "Days": return MinuteToDay(Value);
                    case "Weeks": return MinuteToWeek(Value);
                    case "Years": return MinuteToYear(Value);
                }
              
            case "Hours":
                switch(To)
                {
                    case "Seconds": return HourToSecond(Value);
                    case "Minutes": return HourToMinute(Value);
                    case "Hours": return HourToHour(Value);
                    case "Days": return HourToDay(Value);
                    case "Weeks": return HourToWeek(Value);
                    case "Years": return HourToYear(Value);
                }
                
            case "Days":
                switch(To)
                {
                    case "Seconds": return DayToSecond(Value);
                    case "Minutes": return DayToMinute(Value);
                    case "Hours": return DayToHour(Value);
                    case "Days": return DayToDay(Value);
                    case "Weeks": return DayToWeek(Value);
                    case "Years": return DayToYear(Value);
                }
               
            case "Weeks":
                switch(To)
                {
                    case "Seconds": return WeekToSecond(Value);
                    case "Minutes": return WeekToMinute(Value);
                    case "Hours": return WeekToHour(Value);
                    case "Days": return WeekToDay(Value);
                    case "Weeks": return WeekToWeek(Value);
                    case "Years": return WeekToYear(Value);
                }
                
            case "Years":
                switch(To)
                {
                    case "Seconds": return YearToSecond(Value);
                    case "Minutes": return YearToMinute(Value);
                    case "Hours": return YearToHour(Value);
                    case "Days": return YearToDay(Value);
                    case "Weeks": return YearToWeek(Value);
                    case "Years": return YearToYear(Value);
                }
        }
        
        return 0;
    }

    private double SecondToSecond(double second){return Double.parseDouble(String.format("%.2f",second));}
    private double SecondToMinute(double second){return Double.parseDouble(String.format("%.2f",second*0.016667));}
    private double SecondToHour(double second){return Double.parseDouble(String.format("%.2f",second*0.000278));}
    private double SecondToDay(double second){return Double.parseDouble(String.format("%.2f",second*0.000012));}
    private double SecondToWeek(double second){return Double.parseDouble(String.format("%.2f",second*0.000002));}
    private double SecondToYear(double second){return Double.parseDouble(String.format("%.2f",second*0.00000003168809));}
            
    private double MinuteToSecond(double minute){return Double.parseDouble(String.format("%.2f",minute*60));}
    private double MinuteToMinute(double minute){return Double.parseDouble(String.format("%.2f",minute));}
    private double MinuteToHour(double minute){return Double.parseDouble(String.format("%.2f",minute*0.016667));}
    private double MinuteToDay(double minute){return Double.parseDouble(String.format("%.2f",minute*0.000694));}
    private double MinuteToWeek(double minute){return Double.parseDouble(String.format("%.2f",minute*0.000099));}
    private double MinuteToYear(double minute){return Double.parseDouble(String.format("%.2f",minute*0.000002));}
           
    private double HourToSecond(double hour){return Double.parseDouble(String.format("%.2f",hour*3600));}
    private double HourToMinute(double hour){return Double.parseDouble(String.format("%.2f",hour*60));}
    private double HourToHour(double hour){return Double.parseDouble(String.format("%.2f",hour));}
    private double HourToDay(double hour){return Double.parseDouble(String.format("%.2f",hour*0.041667));}
    private double HourToWeek(double hour){return Double.parseDouble(String.format("%.2f",hour*0.005952));}
    private double HourToYear(double hour){return Double.parseDouble(String.format("%.2f",hour*0.000114));}
           
    private double DayToSecond(double day){return Double.parseDouble(String.format("%.2f",day*86400));}
    private double DayToMinute(double day){return Double.parseDouble(String.format("%.2f",day*1440));}
    private double DayToHour(double day){return Double.parseDouble(String.format("%.2f",day*24));}
    private double DayToDay(double day){return Double.parseDouble(String.format("%.2f",day));}
    private double DayToWeek(double day){return Double.parseDouble(String.format("%.2f",day*0.142857));}
    private double DayToYear(double day){return Double.parseDouble(String.format("%.2f",day*0.002738));}
            
    private double WeekToSecond(double week){return Double.parseDouble(String.format("%.2f",week*604800));}
    private double WeekToMinute(double week){return Double.parseDouble(String.format("%.2f",week*10080));}
    private double WeekToHour(double week){return Double.parseDouble(String.format("%.2f",week*168));}
    private double WeekToDay(double week){return Double.parseDouble(String.format("%.2f",week*7));}
    private double WeekToWeek(double week){return Double.parseDouble(String.format("%.2f",week));}
    private double WeekToYear(double week){return Double.parseDouble(String.format("%.2f",week*0.019165));}
    
    private double YearToSecond(double year){return Double.parseDouble(String.format("%.2f",year*31557600));}
    private double YearToMinute(double year){return Double.parseDouble(String.format("%.2f",year*525960));}
    private double YearToHour(double year){return Double.parseDouble(String.format("%.2f",year*8766));}
    private double YearToDay(double year){return Double.parseDouble(String.format("%.2f",year*365.25));}
    private double YearToWeek(double year){return Double.parseDouble(String.format("%.2f",year*52.17857));}
    private double YearToYear(double year){return Double.parseDouble(String.format("%.2f",year));}        
}
