import java.util.Scanner;

public class Calc {

    public static void main(String args[]) {
    	final Scanner in = new Scanner(System.in);

    	System.out.print("Enter a calculation: ");

        String calc = in.nextLine();

        String[] calcSplit  = calc.split(" ");

        double num1 = Double.parseDouble(calcSplit[0]);
        double num2 = Double.parseDouble(calcSplit[2]);
        String operator = calcSplit[1];
        double ans = 0.0;
        int out = 0;
        boolean useInt = false;

        switch (operator) {
            case ("+"):
                ans = (num1 + num2);
            break;
                                    
            case ("-"):
                ans = (num1 - num2);
            break;
                                    
            case ("/"):
                ans = (num1 / num2);
            break;
                                    
            case ("*"):
                ans = (num1 * num2);
            break;

	    case ("^"):
	        ans = Math.pow(num1, num2);
	    break;	
                                    
            default:
                ans = (num1 + num2);
            break;
        }

        if (calcSplit.length > 4) {
            double num3 = Double.parseDouble(calcSplit[4]);
            switch (calcSplit[3]) {
                case ("+"):
                    ans = (ans + num3);
                break;
 
                case ("-"):
                    ans = (ans - num3);
                break;
                                        
                case ("/"):
                    ans = (ans / num3);
                break;
                                         
                case ("*"):
                    ans = (ans * num3);
                break;

                case ("^"):
	            ans = Math.pow(ans, num3);
		break;
                                         
                default:
                    ans = (ans + num3);
                break;
	    }
        }

        if ((ans - Math.floor(ans)) == 0) {
            out = (int)(Math.floor(ans));
            useInt = true;
        }

        if (useInt)
            System.out.println(out);
        else
            System.out.println(ans);

    }
}
