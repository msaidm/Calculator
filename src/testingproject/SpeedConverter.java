package testingproject;
public class SpeedConverter 
{
    public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "cm/s":
                switch(To)
                {
                    case "km/h": return CmToKm(Value);
                    case "cm/s": return CmToCm(Value);
                    case "m/s": return CmToMeter(Value);
                    case "miles/h": return CmToMile(Value);
                }
                
            case "km/h":
                switch(To)
                {
                    case "km/h": return KmToKm(Value);
                    case "cm/s": return KmToCm(Value);
                    case "m/s": return KmToMeter(Value);
                    case "miles/h": return KmToMile(Value);
                }
              
            case "miles/h":
                switch(To)
                {
                    case "km/h": return MileToKm(Value);
                    case "cm/s": return MileToCm(Value);
                    case "m/s": return MileToMeter(Value);
                    case "miles/h": return MileToMile(Value);
                }
                
            case "m/s":
                switch(To)
                {
                    case "km/h": return MeterToKm(Value);
                    case "cm/s": return MeterToCm(Value);
                    case "m/s": return MeterToMeter(Value);
                    case "miles/h": return MeterToMile(Value);
                }     
        }
        
        return 0;
    }
    
    private double CmToCm(double cm){return Double.parseDouble(String.format("%.2f",cm));}
    private double CmToMeter(double cm){return Double.parseDouble(String.format("%.2f",cm*0.01));}
    private double CmToKm(double cm){return Double.parseDouble(String.format("%.2f",cm*0.036));}
    private double CmToMile(double cm){return Double.parseDouble(String.format("%.2f",cm*0.022371));}
            
    private double KmToCm(double km){return Double.parseDouble(String.format("%.2f",km*27.77778));}
    private double KmToMeter(double km){return Double.parseDouble(String.format("%.2f",km*0.277778));}
    private double KmToKm(double km){return Double.parseDouble(String.format("%.2f",km));}
    private double KmToMile(double km){return Double.parseDouble(String.format("%.2f",km*0.621427));}
            
    private double MeterToCm(double meter){return Double.parseDouble(String.format("%.2f",meter*100));}
    private double MeterToMeter(double meter){return Double.parseDouble(String.format("%.2f",meter));}
    private double MeterToKm(double meter){return Double.parseDouble(String.format("%.2f",meter*3.8));}
    private double MeterToMile(double meter){return Double.parseDouble(String.format("%.2f",meter*2.237136));}
            
    private double MileToCm(double mile){return Double.parseDouble(String.format("%.2f",mile*44.7));}
    private double MileToMeter(double mile){return Double.parseDouble(String.format("%.2f",mile*0.447));}
    private double MileToKm(double mile){return Double.parseDouble(String.format("%.2f",mile*1.6092));}
    private double MileToMile(double mile){return Double.parseDouble(String.format("%.2f",mile));}
}