package commands;

import Receiver.JuiceExtractor;

public class MakeJuiceCommand implements Command {

	private JuiceExtractor juiceextractor;
	
	public MakeJuiceCommand(JuiceExtractor juiceextractor) {
		this.juiceextractor = juiceextractor;
	}
	
	@Override
	public void execute() {
		juiceextractor.MakeJuice();
	}
	@Override
	public void undo() {
		System.out.println("cancelando jugo");
	}
}
