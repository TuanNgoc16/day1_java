public class btap11 {
public static void  main (String[] args) {
    int lowerbound = 9;
    int upperbound = 899;
    int sum = 0;

    int number = lowerbound;
    while (number <= upperbound) {
    sum = sum + number;
    ++ number;
    }
    System.out.println("The sum Form " + lowerbound + "  to " + upperbound + "  is " + sum);
}




}
