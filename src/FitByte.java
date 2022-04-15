public class FitByte 
{
    private int age;
    private int restHR;
    
    public FitByte (int age, int restHR)
    {
        this.age = age;
        this.restHR = restHR;
    }

    public double targetHeartRate (double percentageOfMaximum)
    {
        double maxHR = 206.3 - (0.711 * this.age);
        double targetHR = ((maxHR - this.restHR) * percentageOfMaximum + this.restHR);

        return targetHR;
    }
}
