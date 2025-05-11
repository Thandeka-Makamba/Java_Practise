package OOP.question13;

abstract public class SmartDevice {
    private String deviceName;
    private boolean isOn;
    private Mood mood;

    SmartDevice(String deviceName, boolean isOn, Mood mood) {
        this.deviceName = deviceName;
        this.isOn = isOn;
        this.mood = mood;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getState() {
        return isOn;
    }

    public Mood getMood() {
        return mood;
    }

    public void setDeviceName(String name) {
        deviceName = name;
    }

    public void setState(boolean state) {
        isOn = state;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void togglePower() {
        this.isOn = !isOn;
    }

    abstract public void operate();
}
