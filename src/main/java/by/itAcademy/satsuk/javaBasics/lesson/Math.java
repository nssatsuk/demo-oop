package by.itAcademy.satsuk.javaBasics.lesson;

public class Math {
    public static boolean isOdd(int number){
        boolean isOdd = false;
        if(number % 2 == 0) {
            isOdd = true;
        }
        return isOdd;
    }

    public static boolean isPositive(int number){
        boolean isPositive = false;
        if(number > 0){
            isPositive = true;
        }
        return isPositive;
    }

    public static boolean isPositive(double number){
        boolean isPositive = false;
        if(number > 0){
            isPositive = true;
        }
        return isPositive;
    }
}
