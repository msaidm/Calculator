package testingproject;

public class LengthConverter 
{
    public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "Centimeters":
                switch(To)
                {
                    case "Centimeters": return CmToCm(Value);
                    case "Meters": return CmToMeter(Value);
                    case "Kilometers": return CmToKm(Value);
                    case "Inches": return CmToInch(Value);
                    case "Miles": return CmToMile(Value);
                }
                
            case "Meters":
                switch(To)
                {
                    case "Centimeters": return MeterToCm(Value);
                    case "Meters": return MeterToMeter(Value);
                    case "Kilometers": return MeterToKm(Value);
                    case "Inches": return MeterToInch(Value);
                    case "Miles": return MeterToMile(Value);
                }
              
            case "Kilometers":
                switch(To)
                {
                    case "Centimeters": return KmToCm(Value);
                    case "Meters": return KmToMeter(Value);
                    case "Kilometers": return KmToKm(Value);
                    case "Inches": return KmToInch(Value);
                    case "Miles": return KmToMile(Value);
                }
                
            case "Inches":
                switch(To)
                {
                    case "Centimeters": return InchToCm(Value);
                    case "Meters": return InchToMeter(Value);
                    case "Kilometers": return InchToKm(Value);
                    case "Inches": return InchToInch(Value);
                    case "Miles": return InchToMile(Value);
                }
               
            case "Miles":
                switch(To)
                {
                    case "Centimeters": return MileToCm(Value);
                    case "Meters": return MileToMeter(Value);
                    case "Kilometers": return MileToKm(Value);
                    case "Inches": return MileToInch(Value);
                    case "Miles": return MileToMile(Value);
                }    
        }
        
        return 0;
    }
    
    private double CmToCm(double cm){return Double.parseDouble(String.format("%.2f",cm));}
    private double CmToMeter(double cm){return Double.parseDouble(String.format("%.2f",cm*0.01));}
    private double CmToKm(double cm){return Double.parseDouble(String.format("%.2f",cm*0.00001));}
    private double CmToInch(double cm){return Double.parseDouble(String.format("%.2f",cm*0.393701));}
    private double CmToMile(double cm){return Double.parseDouble(String.format("%.2f",cm*0.000006));}
            
    private double MeterToCm(double meter){return Double.parseDouble(String.format("%.2f",meter*100));}
    private double MeterToMeter(double meter){return Double.parseDouble(String.format("%.2f",meter));}
    private double MeterToKm(double meter){return Double.parseDouble(String.format("%.2f",meter*0.001));}
    private double MeterToInch(double meter){return Double.parseDouble(String.format("%.2f",meter*39.37008));}
    private double MeterToMile(double meter){return Double.parseDouble(String.format("%.2f",meter*0.000621));}
            
    private double KmToCm(double km){return Double.parseDouble(String.format("%.2f",km*100000));}
    private double KmToMeter(double km){return Double.parseDouble(String.format("%.2f",km*1000));}
    private double KmToKm(double km){return Double.parseDouble(String.format("%.2f",km));}
    private double KmToInch(double km){return Double.parseDouble(String.format("%.2f",km*39370.08));}
    private double KmToMile(double km){return Double.parseDouble(String.format("%.2f",km*0.6221371));}
           
    private double InchToCm(double inch){return Double.parseDouble(String.format("%.2f",inch*2.54));}
    private double InchToMeter(double inch){return Double.parseDouble(String.format("%.2f",inch*0.0254));}
    private double InchToKm(double inch){return Double.parseDouble(String.format("%.2f",inch*0.000025));}
    private double InchToInch(double inch){return Double.parseDouble(String.format("%.2f",inch));}
    private double InchToMile(double inch){return Double.parseDouble(String.format("%.2f",inch*0.000016));}      
            
    private double MileToCm(double mile){return Double.parseDouble(String.format("%.2f",mile*160934.4));}
    private double MileToMeter(double mile){return Double.parseDouble(String.format("%.2f",mile*1609.344));}
    private double MileToKm(double mile){return Double.parseDouble(String.format("%.2f",mile*1.609344));}
    private double MileToInch(double mile){return Double.parseDouble(String.format("%.2f",mile*63360));}
    private double MileToMile(double mile){return Double.parseDouble(String.format("%.2f",mile));}        
            
}
