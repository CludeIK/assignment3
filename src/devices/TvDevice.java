package devices;

public class TvDevice implements Device {
    private boolean powerOn = false;

    @Override
    public String applySettings(int volume) {
        this.powerOn = true;
        return "TV [Power: " + (powerOn ? "ON" : "OFF") + ", Volume: " + volume + "]";
    }
}