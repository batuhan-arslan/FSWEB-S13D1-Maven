package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }

        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int highestTemp = isSummer ? 45 : 35 ;

        return temp >= 25 && temp <= highestTemp;

    }

    public static double area(double width, double height) {
        if ( width < 0 || height < 0) {
            System.out.println("Width veya height değeri sıfırdan küçük olamaz ! Width: " + width + "Height: " + height);
            return -1;
    }
            return  width * height;
    }


    public static double area(double radius) {
            if ( radius <0) {
                System.out.println("Radius sıfırdan küçük olamaz Radius: " + radius);
                return -1;

            }
            return Math.PI * radius * radius;
        }

    }

