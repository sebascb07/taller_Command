package commands;

import Receiver.CoffeeMaker;

public class MakeCoffeeCommand implements Command {
	private CoffeeMaker coffeemaker;
	
	public MakeCoffeeCommand(CoffeeMaker coffeemaker) {
		this.coffeemaker = coffeemaker;
	}
	
	@Override
	public void execute() {
		coffeemaker.MakeCoffee();
	}
	
	@Override
	public void undo() {
		System.out.println("cancelando cafe");
	}
	
	
}
