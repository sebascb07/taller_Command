package commands;

import Receiver.Toaster;

public class MakeToastCommand implements Command {
	private Toaster toaster;
	
	public MakeToastCommand(Toaster toaster) {
		this.toaster = toaster;
	}
	
	@Override
	public void execute() {
		toaster.MakeToast();
	}
	
	@Override
	public void undo() {
		System.out.println("cancelando tostada");
	}
}
