package trigcalculator;

// Main class for user interactionextending TrigCalculatorAppHelper to inherit methods
public class TrigCalculatorApp extends TrigCalculatorAppHelper{
    public static void main(String[] args) {
        // Welcome message
    	
    	//All methods are inherited from DialogManager thru TrigCalculatorAppHelper > TrigonometryFunction > DialogManager
        showMessage("Welcome to PSD Trigo Calculator!");

        // Ask the user for the number of identities
        String[] identityOptions = {"1", "2"};
        //All methods are inherited from DialogManager
        int identityChoice = showOptionDialog( "How many identities?",
                "Identity Selection",
                identityOptions);

        // Based on the number of identities chosen, proceed accordingly
        if (identityChoice == 0) {
        	//All methods are inherited from TrigCalculatorAppHelper
            calculateIdentity1();
        } else if (identityChoice == 1) {
            calculateIdentity2();
        }
    }
}
