public class Month
{
    private String Month;
    private int number;

    public Month(int userNumber)
    {
        number = userNumber;
        String MonthList = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        
        int MonthsPerYear = 12;
        int MonthLength = MonthList.length() / MonthsPerYear;
        int Month2 = userNumber * MonthLength;
        int Month3 = MonthList.length() - (MonthList.length() - Month2);
        Month = MonthList.substring(Month2, Month3);
        
    }
    
    public String getName()
    {
        return Month;
    }
}

