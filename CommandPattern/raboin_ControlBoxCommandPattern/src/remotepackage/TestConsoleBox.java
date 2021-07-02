package remotepackage;

public class TestConsoleBox 
{
	public static void main(String[] args)
	{
		ConsoleBox consoleBox = new ConsoleBox();
		
		BrainWaveDevice brainWaveDevice = new BrainWaveDevice();
		FitDevice fitDevice = new FitDevice();
		MouseDevice mouseDevice = new MouseDevice();
		
		BrainWaveOffCommand brainWaveOff = new BrainWaveOffCommand(brainWaveDevice);
		BrainWaveOnCommand brainWaveOn = new BrainWaveOnCommand(brainWaveDevice);
		
		FitDeviceOffCommand fitDeviceOff = new FitDeviceOffCommand(fitDevice);
		FitDeviceOnCommand fitDeviceOn = new FitDeviceOnCommand(fitDevice);
		
		OffMouseCommand mouseOff = new OffMouseCommand(mouseDevice);
		OnMouseCommand mouseOn = new OnMouseCommand(mouseDevice);
		
		
		consoleBox.setCommand(0, brainWaveOn, brainWaveOff);
		consoleBox.setCommand(1, fitDeviceOn, fitDeviceOff);
		consoleBox.setCommand(2, mouseOn, mouseOff);
		
		
		System.out.println(consoleBox);
		
		consoleBox.onButtonWasPushed(0);
		consoleBox.offButtonWasPushed(0);
		consoleBox.onButtonWasPushed(1);
		consoleBox.offButtonWasPushed(1);
		consoleBox.onButtonWasPushed(2);
		consoleBox.offButtonWasPushed(2);
		consoleBox.undoButtonWasPushed(2);
		
	}
}
