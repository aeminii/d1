package Project;
import java.util.*;
import java.text.*;

public class Project {

	    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Shkruani kohën e kryerjes së telefonatës (në format 24-orësh): ");
	    int time = input.nextInt();
	    System.out.print("Shkruani kohëzgjatjen e telefonatës (në minuta): ");
	    int duration = input.nextInt();
	    System.out.print("Shkruani distancën e destinacionit (në milje): ");
	    int distance = input.nextInt();
	    input.close();
	    
	    double basicCost = duration * distance * 0.003;
	    double surcharge = 0;
	    if (time >= 800 && time <= 2400) {
	      surcharge = basicCost * 0.2;

	    }
	    int roundedSurcharge = (int) Math.ceil(surcharge);
	    double cost = basicCost + roundedSurcharge ;
	    double tax = cost * 0.06;
	    double totalCost = cost + tax;
	    DecimalFormat formatter= new DecimalFormat("0.00");

	    System.out.println("Total cost: $"+ formatter.format(totalCost));
	    }
	}



