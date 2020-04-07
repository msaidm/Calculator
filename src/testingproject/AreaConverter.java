package testingproject;
public class AreaConverter
{
    public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "Square kilometers":
                switch(To)
                {
                    case "Square Kilometers": return SquareKmToKilometer(Value);
                    case "Square centimeters": return SquareKmToCm(Value);
                    case "Square meters": return SquareKmToMeter(Value);
                    case "Square miles": return SquareKmToMile(Value);
                }
                
            case "Square centimeters":
                switch(To)
                {
                    case "Square Kilometers": return SquareCmToKilometer(Value);
                    case "Square centimeters": return SquareCmToCm(Value);
                    case "Square meters": return SquareCmToMeter(Value);
                    case "Square miles": return SquareCmToMile(Value);
                }
              
            case "Square meters":
                switch(To)
                {
                    case "Square Kilometers": return SquareMeterToKilometer(Value);
                    case "Square centimeters": return SquareMeterToCm(Value);
                    case "Square meters": return SquareMeterToMeter(Value);
                    case "Square miles": return SquareMeterToMile(Value);
                }
                
            case "Square miles":
                switch(To)
                {
                    case "Square Kilometers": return SquareMileToKilometer(Value);
                    case "Square centimeters": return SquareMileToCm(Value);
                    case "Square meters": return SquareMileToMeter(Value);
                    case "Square miles": return SquareMileToMile(Value);
                }     
        }
        
        return 0;
    }
    
    private double SquareCmToMeter(double cm){return Double.parseDouble(String.format("%.2f",cm*0.0001));}
    private double SquareCmToKilometer(double cm){return Double.parseDouble(String.format("%.2f",cm*0.0000000001));}
    private double SquareCmToCm(double cm){return Double.parseDouble(String.format("%.2f",cm));}
    private double SquareCmToMile(double cm){return Double.parseDouble(String.format("%.2f",cm*0.00000000003861));}
    
    private double SquareMeterToMeter(double meters){return Double.parseDouble(String.format("%.2f",meters));}
    private double SquareMeterToKilometer(double meters){return Double.parseDouble(String.format("%.2f",meters*0.000001));}
    private double SquareMeterToCm(double meters){return Double.parseDouble(String.format("%.2f",meters*10000));}
    private double SquareMeterToMile(double meters){return Double.parseDouble(String.format("%.2f",meters*0.0000003861));}
            
    private double SquareKmToMeter(double km){return Double.parseDouble(String.format("%.2f",km*1000000));}
    private double SquareKmToKilometer(double km){return Double.parseDouble(String.format("%.2f",km));}
    private double SquareKmToCm(double km){return Double.parseDouble(String.format("%.2f",km*10000000000.0));}
    private double SquareKmToMile(double km){return Double.parseDouble(String.format("%.2f",km*0.386102));}
            
    private double SquareMileToMeter(double miles){return Double.parseDouble(String.format("%.2f",miles*2589988));}
    private double SquareMileToKilometer(double miles){return Double.parseDouble(String.format("%.2f",miles*2.589988));}
    private double SquareMileToCm(double miles){return Double.parseDouble(String.format("%.2f",miles*25899881103.0));}
    private double SquareMileToMile(double miles){return Double.parseDouble(String.format("%.2f",miles));}
}
