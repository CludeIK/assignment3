package devices;

public class RadioDevice implements Device {
    private boolean powerOn = false;

    @Override
    public String applySettings(int volume) {
        this.powerOn = true;
        return "Radio [Power: " + (powerOn ? "ON" : "OFF") + ", Volume: " + volume + "]";
    }
}