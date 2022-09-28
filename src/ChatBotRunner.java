public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot maurice = new ChatBot("maurice",64);

        maurice.greeting("PierceVDR");

        maurice.weather();

        int feet = 5;
        System.out.println( feet + " feet in meters is " + maurice.convertFeetToMeters(feet) );

        maurice.favoriteNumber(7);

        int num1 = 3;
        int num2 = 4;
        int num3 = 3;
        System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + maurice.addNumbers(num1,num2,num3) );

        // calling my methods:
        System.out.println("I think the average of those numbers is " + maurice.averageNumbers(num1,num2,num3));
        maurice.printAverageNumbers(num1,num2,num3);
        //

        maurice.goodbye();
    }
}
