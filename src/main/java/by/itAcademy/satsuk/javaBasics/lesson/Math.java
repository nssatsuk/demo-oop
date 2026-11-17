package by.itAcademy.satsuk.javaBasics.lesson;

public class Math {
    public static boolean isOdd(int number){
        boolean isOdd = false;
        if(number % 2 == 0) {
            isOdd = true;
        }
        return isOdd;
    }
}
