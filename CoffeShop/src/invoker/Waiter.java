package invoker;

import java.util.ArrayList;
import java.util.List;

import commands.Command;

public class Waiter {
	private List <Command> Orders;
	
	public Waiter() {
		Orders = new ArrayList<>();
	}
	public void takeOrder(Command command) {
		Orders.add(command);
	}
	
	public void cancellOrder(Command command) {
		Orders.remove(command);
	}
	public void executeOrder() {
		for(Command command : Orders) {
			command.execute();
		}
	}
	
	
	
}
