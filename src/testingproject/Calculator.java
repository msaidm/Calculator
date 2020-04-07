package testingproject;

public class Calculator 
{
    LengthConverter Length;
    AreaConverter Area;
    MassConverter Mass;
    TimeConverter Time;
    SpeedConverter Speed;
    TemperatureConverter Temperature;
    double currentResult;
    
    public Calculator()
    {
        Length = new LengthConverter();
        Area = new AreaConverter();
        Mass = new MassConverter();
        Time = new TimeConverter();
        Speed = new SpeedConverter();
        Temperature = new TemperatureConverter();
        currentResult = 0;
    }
    
    public double add(double a, double b)
    {
        currentResult = a+b;
        return currentResult;
    }
    
    public double subtract(double a, double b)
    {
        currentResult = a-b;
        return currentResult;
    }
    
    public double multiply(double a, double b)
    {
        currentResult = a*b;
        return currentResult;
    }
     public double power(double a,double b)
    {
        currentResult= Math.pow(a, b) ; 
        return currentResult;
    }
      public double fact(double a)
    {
         currentResult = 1;

        for (int factor = 2; factor <= a; factor++) {
            currentResult *= factor;
        }

        return currentResult;
    }
    public double root(double a)
    {
          currentResult= Math.sqrt(a) ; 
        return currentResult;
    }
    public double modulus(double a,double b)
    {
          currentResult= a % b ; 
        return currentResult;
    }
    public double divide(double a, double b)
    {
        try
        {
            currentResult = a/b;   
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by Zero");
        }
        
        return currentResult;
    }
}
