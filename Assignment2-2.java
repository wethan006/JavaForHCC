import java.util.Scanner; //brings in the scanner function
public class Java_Assignment {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal and gratuity rate: ");
        //creates new scanner called userinput
        Scanner userinput = new Scanner(System.in);
        //create new variable for inputs
        double subtotal = userinput.nextDouble();
        double gratuity = userinput.nextDouble();
        //closes the scanner when not in use
        userinput.close();
        if (gratuity > 1) { //if statement will make sure the gratuity is a percentage
            gratuity /= 100;
        }
        double gratDollar = subtotal * gratuity; //This is the variable for the dollar amount of gratuity
        double total = gratDollar+subtotal; //This will be the grand total of the bill
        System.out.println("The gratuity is $" + gratDollar + " and the total is $" + total);
    }
}
