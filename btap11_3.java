public class btap11_3 {

    public static void  main (String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;

        int number = lowerbound;
        while (number <= upperbound) {
            if ( number % 7 == 0)
            {
                sum = sum + number;

            }
              number++;
        }
        System.out.println("The sum Form " + lowerbound + "  to " + upperbound + "  is " + number);
    }
}
