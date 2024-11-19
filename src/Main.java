//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int millionNumber = 1236534;
        byte smallNumber = 4;
        short threeZero = - 20000;
        long bigLarge = 10000000000L;
        float floatingComma = 234.5678f;
        double c = 5469.123456789;
        System.out.println("Значение переменной millionNumber c типом int равно " + millionNumber);
        System.out.println("Значение переменной smallNumber c типом byte равно " + smallNumber);
        System.out.println("Значение переменной threeZero c типом short равно " + threeZero);
        System.out.println("Значение переменной bigLarge c типом long равно " + bigLarge);
        System.out.println("Значение переменной floatingComma c типом float равно " + floatingComma);
        System.out.println("Значение переменной c c типом double равно " + c);

        float a = 27.12F;
        long b = 987678965549L;
        float d = 2.786f;
        short e = 569;
        short f = -159;
        short j = 27897;
        byte h = 67;

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int allPaper = 480;
        int allStudent = lp + as + ea;
        System.out.println("На каждого ученика рассчитано " + allPaper / allStudent + " листов бумаги");

        byte bottleToTwoMinutes = 16;
        byte time = 2;
        byte minutesInHour = 60;
        byte hourInDay = 24;
        int bottleToOneMinutes = bottleToTwoMinutes / time;
        System.out.println("За 20 минут машина произвела " + bottleToOneMinutes * 20 + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + bottleToOneMinutes * minutesInHour * hourInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleToOneMinutes * minutesInHour * hourInDay * 3 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleToOneMinutes * minutesInHour * hourInDay * 31 + " штук бутылок");

        byte allColor = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int colorToOneClass = whiteColor + brownColor;
        int totalClass = allColor / colorToOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whiteColor * totalClass + " банок белой краски и " + brownColor * totalClass + " банок коричневой краски." );

        byte totalBanana = 5;
        byte weightBanana = 80;
        short totalMilk = 200;
        byte weightMilk = 105;
        byte totalIceCream = 2;
        byte weightIceCream = 100;
        byte totalEgge = 4;
        byte weightEgge = 70;
        int banana = totalBanana * weightBanana;
        int milk = weightMilk / 100 * totalMilk;
        int iceCream = weightIceCream * totalIceCream;
        long egge = weightEgge * totalEgge;
        long all = banana + milk + iceCream + egge;
        float kg = (float) all / 1000;
        System.out.println("Общий вес завтрака равен " + all + " гр" + " или " + kg + " кг" );

        byte massReset = 7;
        short resetToDayOne = 250;
        short resetToDayTwo = 500;
        float resetToDay1Kg = (float) resetToDayOne / 1000;
        float resetToDay2Kg = (float) resetToDayTwo / 1000;
        int dayOne = (int) (massReset / resetToDay1Kg);
        int dayTwo = (int) (massReset / resetToDay2Kg);
        int middleValue = (dayOne + dayTwo) / 2;
        System.out.println("Если терять в день по 250 гр, то уйдет " + dayOne + " дней, если терять в день по 500 гр, то уйдет "
                + dayTwo + " дней. В среднем уйдет " + middleValue + " дней." );

        int unitOne = 67760;
        int unitTwo = 83690;
        int unitThree = 76230;
        float unitOneUp = (float) unitOne / 100 * 10;
        float unitTwoUp = (float) unitTwo / 100 * 10;
        float unitThreeUp = (float) unitThree / 100 * 10;
        float totalOne = unitOneUp + unitOne;
        float totalTwo = unitTwoUp + unitTwo;
        float totalThree = unitThreeUp + unitThree;
        System.out.println("Маша теперь получает теперь " + totalOne + " рублей. Годовой доход вырос на " + unitOneUp + " рублей");
        System.out.println("Денис теперь получает теперь " + totalTwo + " рублей. Годовой доход вырос на " + unitTwoUp + " рублей");
        System.out.println("Кристина теперь получает теперь " + totalThree + " рублей. Годовой доход вырос на " + unitThreeUp + " рублей");





    }
}
