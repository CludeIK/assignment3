package devices;

public class ProjectorDevice implements Device {
    private boolean powerOn = false;

    @Override
    public String applySettings(int volume) {
        this.powerOn = true;
        return "Projector [Power: " + (powerOn ? "ON" : "OFF") + ", Volume: " + volume + "]";
    }
}