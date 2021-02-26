package chapter5.infomationHidding;

class BirthDay {

    //int day;
    //int month;
    //int year;

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month == 2){
            if(day<1 || day >28){
                System.out.println("잘못된 날짜");
            }else{
                this.month = month;
            }
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthDayTest{


   /*누가나 접근(변경)가능 무결성이 침해될수 있다.
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.month = 5;
        day.year = 1988;
        day.day = 18;
    }*/

    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.setMonth(2);
        day.setYear(1988);
        day.setDay(30);
    }




}
