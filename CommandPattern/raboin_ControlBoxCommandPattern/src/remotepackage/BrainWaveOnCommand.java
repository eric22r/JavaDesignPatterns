package remotepackage;

public class BrainWaveOnCommand implements Command
{
	BrainWaveDevice brainWaveDevice;
	
	public BrainWaveOnCommand(BrainWaveDevice brainWaveDevice)
	{
		this.brainWaveDevice = brainWaveDevice;
	}
	
	public void execute()
	{
		brainWaveDevice.on();
	}
	
	public void undo()
	{
		brainWaveDevice.off();
	}
}
