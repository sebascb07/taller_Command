package Main;

import Receiver.CoffeeMaker;
import Receiver.JuiceExtractor;
import Receiver.Toaster;
import commands.Command;
import commands.MakeCoffeeCommand;
import commands.MakeJuiceCommand;
import commands.MakeToastCommand;
import invoker.Waiter;

public class Main {
	 public static void main(String[] args) {

	        CoffeeMaker coffeemaker = new CoffeeMaker();
	        Toaster toaster = new Toaster();
	        JuiceExtractor juiceextractor = new JuiceExtractor();

	        Command makecoffeecommand = new MakeCoffeeCommand(coffeemaker);
	        Command maketoastcommand = new MakeToastCommand(toaster);
	        Command makejuicecommand = new MakeJuiceCommand(juiceextractor);

	        Waiter waiter = new Waiter();
	        
	        waiter.takeOrder(makecoffeecommand);
	        waiter.takeOrder(maketoastcommand);
	        waiter.takeOrder(makejuicecommand);
	        
	        waiter.cancellOrder(makejuicecommand);
	        
	        waiter.executeOrder();
	    }

}
