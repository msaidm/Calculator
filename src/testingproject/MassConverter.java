package testingproject;
public class MassConverter
{
    public double Convert(double Value,String From, String To)
    {
        switch(From)
        {
            case "Kilograms":
                switch(To)
                {
                    case "Kilograms": return KilogramToKilogram(Value);
                    case "Grams": return KilogramToGram(Value);
                    case "Milligrams": return KilogramToMilligram(Value);
                    case "Pounds": return KilogramToPound(Value);
                }
                
            case "Grams":
                switch(To)
                {
                    case "Kilograms": return GramToKilogram(Value);
                    case "Grams": return GramToGram(Value);
                    case "Milligrams": return GramToMilligram(Value);
                    case "Pounds": return GramToPound(Value);
                }
              
            case "Milligrams":
                switch(To)
                {
                    case "Kilograms": return MilligramToKilogram(Value);
                    case "Grams": return MilligramToGram(Value);
                    case "Milligrams": return MilligramToMilligram(Value);
                    case "Pounds": return MilligramToPound(Value);
                }
                
            case "Pounds":
                switch(To)
                {
                    case "Kilograms": return PoundToKilogram(Value);
                    case "Grams": return PoundToGram(Value);
                    case "Milligrams": return PoundToMilligram(Value);
                    case "Pounds": return PoundToPound(Value);
                }     
        }
        
        return 0;
    }
    
    private double KilogramToGram(double kilos){return Double.parseDouble(String.format("%.2f",kilos*1000));}
    private double KilogramToMilligram(double kilos){return Double.parseDouble(String.format("%.2f",kilos*1000000));}
    private double KilogramToPound(double kilos){return Double.parseDouble(String.format("%.2f",kilos*2.204623));}
    private double KilogramToKilogram(double kilos){return Double.parseDouble(String.format("%.2f",kilos));}
    
    private double GramToGram(double grams){return Double.parseDouble(String.format("%.2f",grams));}
    private double GramToMilligram(double grams){return Double.parseDouble(String.format("%.2f",grams*1000));}
    private double GramToPound(double grams){return Double.parseDouble(String.format("%.2f",grams*0.002205));}
    private double GramToKilogram(double grams){return Double.parseDouble(String.format("%.2f",grams*0.001));}
    
    private double MilligramToGram(double milligrams){return Double.parseDouble(String.format("%.2f",milligrams*0.001));}
    private double MilligramToMilligram(double milligrams){return Double.parseDouble(String.format("%.2f",milligrams));}
    private double MilligramToPound(double milligrams){return Double.parseDouble(String.format("%.2f",milligrams*0.000002));}
    private double MilligramToKilogram(double milligrams){return Double.parseDouble(String.format("%.2f",milligrams*0.000001));}
    
    private double PoundToGram(double pounds){return Double.parseDouble(String.format("%.2f",pounds*453.5924));}
    private double PoundToMilligram(double pounds){return Double.parseDouble(String.format("%.2f",pounds*453592.4));}
    private double PoundToPound(double pounds){return Double.parseDouble(String.format("%.2f",pounds));}
    private double PoundToKilogram(double pounds){return Double.parseDouble(String.format("%.2f",pounds*0.453592));}
}
