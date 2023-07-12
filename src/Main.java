import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int apples = 4567475;
        System.out.println("Яблок " + apples);
        byte tomatoes = 2;
        System.out.println(tomatoes + " помидора");
        short way = 5467;
        System.out.println("Дорога составит " + way + " км");
        long landArea = 510100000;
        System.out.println("Площадь Земли составляет " + landArea + " квадратных киллометра");
        float weight = 65.5F;
        System.out.println("Вес человека " + weight + " кг");
        double numberP = 3.1415926535;
        System.out.println("Число Пи ровно " + numberP);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965547L;
        float c = 2.786F;
        int d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task3() {

        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int paper = 480;
        int onOnePerson = paper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + onOnePerson + " листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte totalBottles = 16;
        byte totalMin = 2;
        byte twentyMin = 20;
        int oneDay = 1440;
        int oneMinBottles = totalBottles / totalMin;
        int in20Min = twentyMin * oneMinBottles;
        int bottlesInOneDay = oneDay * oneMinBottles;
        int threeDayMinutes = oneDay * 3;
        int bottlesInThreeDays = threeDayMinutes * oneMinBottles;
        System.out.println("За 20 мин получится " + in20Min + " бутылок");
        System.out.println("За сутки получится " + bottlesInOneDay + " бутылок");
        System.out.println("За 3 дня получится " + bottlesInThreeDays + " бутылок ");
        int oneMonthMinutes = oneDay * 30;
        int bottlesInOneMonth = oneMonthMinutes * oneMinBottles;
        System.out.println("За один месяц получится " + bottlesInOneMonth + " бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        int allJar = 120;
        byte whiteDyeOnOneRoom = 2;
        byte brownDyeOnOneRoom = 4;
        int oneStudyRoom = whiteDyeOnOneRoom + brownDyeOnOneRoom;
        int allRoomsInSchool = allJar / oneStudyRoom;
        System.out.println("В школе где, " + allRoomsInSchool + " классов, нужно " +allRoomsInSchool * whiteDyeOnOneRoom + " банок белой краски и " +allRoomsInSchool * brownDyeOnOneRoom + " коричневой краски");}
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int inOneBananas = 80;
        float inMilk = 1.05F;
        int inOneIceCream = 100;
        int inOneEggs = 70;
        int allGramms = (int) ((bananas * inOneBananas) + (milk * inMilk) + (iceCream * inOneIceCream) + (eggs * inOneEggs));
        System.out.println("Всего в граммаx " + allGramms + " за завтрак");
        float inKg = (float) allGramms / 1000;
        System.out.println("Всего в килограммах " + inKg);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int need = 7000;
        int on250InOnDay = 250;
        int on500InOnDay = 500;
        System.out.println("Понадобится " + need / on250InOnDay + " дней, если худеть по 250г в день");
        System.out.println("Понадобится " + need / on500InOnDay + " дней, если худеть по 500г в день");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int masha = 67600;
        int denis = 83690;
        int kristina = 76230;
        float afterYears = 0.1F;
        float mashaAfterYears =  masha * afterYears + masha;
        float denisAfterYears  = denis * afterYears + denis;
        float kristinaAfterYears  = kristina * afterYears + kristina;
        System.out.println("Маша теперь получает " + mashaAfterYears + "рублей. Годовой доход вырос на " + masha * afterYears+ " рублей");
        System.out.println("Денис теперь получает " + denisAfterYears + "рублей. Годовой доход вырос на " + denis * afterYears+ " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfterYears + "рублей. Годовой доход вырос на " + kristina * afterYears+ " рублей");


    }
}

