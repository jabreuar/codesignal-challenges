package exercises;

public class FindCentury {
    public int find(int year) {
        boolean evenlyDivides = year % 100 == 0;
        if(evenlyDivides) {
            return year / 100;
        }
        return  year / 100 + 1;
    }
}
