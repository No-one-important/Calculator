import java.util.Scanner;

public class Calc {

    public static void main(String args[]) {
    	final Scanner in = new Scanner(System.in);

    	System.out.print("Enter a calculation: ");

        String calc = in.nextLine();

        String[] calcSplit  = calc.split(" ");

        float num1 = Float.parseFloat(calcSplit[0]);
        float num2 = Float.parseFloat(calcSplit[2]);
        String operator = calcSplit[1];
        float ans = 0.0F;
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
	        ans = (float)Math.pow(num1, num2);
	    break;	
                                    
            default:
                ans = (num1 + num2);
            break;
        }

        if (calcSplit.length > 4) {
            float num3 = Float.parseFloat(calcSplit[4]);
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
	            ans = (float)Math.pow(ans, num3);
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
