package remotes;

import devices.Device;

public abstract class Remote {
    protected String id;
    protected int volumePreset;
    protected Device device;

    public Remote(String id, Device device) {
        this.id = id;
        this.device = device;
    }

    public void setImplementation(Device device) {
        this.device = device;
    }

    public String execute() {
        String deviceState = device.applySettings(volumePreset);
        return "Remote ID: " + id + " executed -> " + deviceState;
    }

    public String getId() {
        return id;
    }
}