public class FLDate {

    private int month, day, year;

    public FLDate (int m, int d, int y) {

        month = m;
        day = d;
        year = y;

    }

    public int compareTo(FLDate second) {

        if (year < second.year)
            return -1;
        if (year > second.year)
            return 1;
        if (month < second.month)
            return -1;
        if (month > second.month)
            return 1;
        if (day < second.day)
            return -1;
        if (day > second.day)
            return 1;
        return 0;

    }

    public boolean equals(FLDate second) {
     
        return (year==second.year && month==second.month && day==second.day);
    
    }

}
