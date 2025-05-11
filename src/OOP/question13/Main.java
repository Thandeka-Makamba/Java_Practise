package OOP.question13;

public class Main {
    public static void main(String[] args) {
        SmartDevice speaker = new Speaker("JBL", true, Mood.RELAXED);
        SmartDevice light = new Light("Chandelier", true, Mood.ENERGETIC);
        SmartDevice fan = new Fan("Auto fan", true, Mood.NEUTRAL);

        SmartDevice[] devices = {speaker, light, fan};
        for (SmartDevice device: devices) {
            if (! device.getState()) {
                System.out.println(device.getDeviceName() + " is OFF");
            } else {
                System.out.println(device.getDeviceName() + "is now ON");
                device.operate();
                System.out.print(device.getDeviceName() + device.getMood().getDescription());
                //((SmartDevice)device).respondToMood(device.getMood());
            }
        }
    }
}
