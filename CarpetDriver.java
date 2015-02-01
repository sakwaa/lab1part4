// Sakwa Alvitre
// Lab1Part4
import java.util.Scanner;

public class CarpetDriver {
    // Main class
    public static void main(String args[]) {
        RoomCarpet[] carpetHistory = new RoomCarpet[10];
        boolean moreQuotes = true;
        String selection = "";
        int currentQuote = 0;
        int maxQuotes = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("CarpetDriver v1.0 - Please make a selection (type help for available options).");
        while(moreQuotes && currentQuote < maxQuotes) {
        	selection = in.next();
        	int index = 0;
            switch(selection) {
                case "add":
                	carpetHistory[currentQuote] = getQuote();
            		currentQuote++;
            		break;
                case "view":
                	index = in.nextInt();
                	if(index <= maxQuotes && index > 0 && carpetHistory[index-1] != null) {
                		System.out.println("Carpet Cost: $" + carpetHistory[index-1].getTotalCost() + " (" +  
                			carpetHistory[index-1].roomDimension.length + "x" + carpetHistory[index-1].roomDimension.width + 
                			" @ $" + carpetHistory[index-1].carpetCost + ")");
                	} else {
                		System.out.println("No quote found for carpet " + index);
                	}
                	break;
            	case "del":
            		index = in.nextInt();
            		if(index <= maxQuotes && index > 0  && carpetHistory[index-1] != null) {
            			carpetHistory[index-1] = null;
            			System.out.println("Successfully removed quote for carpet " + index);
            		} else {
            			System.out.println("No quote found for carpet " + index);	
            		}
            		break;
        		case "quit": 
        			System.out.println("Goodbye.");
        			System.exit(0);
        			break;
        		case "help":
                default:
                	System.out.println("\nCarpetDriver v1.0");
            		System.out.println("add: add a new carpet quote.");
            		System.out.println("view (quote #): view a previously evaluated carpet quote.");
            		System.out.println("del (quote #): delete a quote from the carpet quote history.");
            		System.out.println("quit: exit CarpetDriver.");
            		System.out.println("help: display this help message.");
            		break;
            }
        }
    }
    public static RoomCarpet getQuote() {
        int length, width, cost;
        System.out.println("Please enter the dimensions of your room (L W): ");
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        width = in.nextInt();
        
        RoomDimension dim = new RoomDimension(length, width);
        System.out.println("Please enter the carpet cost:");
        cost = in.nextInt();
        RoomCarpet carpet = new RoomCarpet(dim, cost);
        System.out.println("Cost of carpet is: $" + carpet.getTotalCost());
        return carpet;
    }
}