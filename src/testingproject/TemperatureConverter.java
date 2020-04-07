package testingproject;
public class TemperatureConverter
{   public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "Celsius":
                switch(To)
                {
                    case "Celsius": return CelisusToCelisus(Value);
                    case "Fahrenheit": return CelisusToFahrenheit(Value);
                    case "Kelvin": return CelisusToKelvin(Value);
                }
                
            case "Fahrenheit":
                switch(To)
                {
                    case "Celsius": return FahrenheitToCelisus(Value);
                    case "Fahrenheit": return FahrenheitToFahrenheit(Value);
                    case "Kelvin": return FahrenheitToKelvin(Value);
                }
              
            case "Kelvin":
                switch(To)
                {
                    case "Celsius": return KelvinToCelisus(Value);
                    case "Fahrenheit": return KelvinToFahrenheit(Value);
                    case "Kelvin": return KelvinToKelvin(Value);
                }     
        }
        
        return 0;
    }

    private double CelisusToKelvin(double value){return Double.parseDouble(String.format("%.2f",value+273.15));} 
    private double CelisusToCelisus(double value){return Double.parseDouble(String.format("%.2f",value));}
    private double CelisusToFahrenheit(double value){return Double.parseDouble(String.format("%.2f",value*1.8+32));}
            
    private double KelvinToCelisus(double value){return Double.parseDouble(String.format("%.2f",value-273.15));}
    private double KelvinToKelvin(double value){return Double.parseDouble(String.format("%.2f",value));}
    private double KelvinToFahrenheit(double value){return Double.parseDouble(String.format("%.2f",(value-273.15)*1.8+32));}
            
    private double FahrenheitToCelisus(double value){return Double.parseDouble(String.format("%.2f",(value-32)/1.8));}
    private double FahrenheitToFahrenheit(double value){return Double.parseDouble(String.format("%.2f",value));}
    private double FahrenheitToKelvin(double value){return Double.parseDouble(String.format("%.2f",(value-32)/1.8+273.15));}
}
