package main.homework15_05.Task2;

public class Light {
    private String location;
    private int brightness; // 0 - 100
    private boolean isOn;

    public Light(String location) {
        this.location = location;
        this.brightness = 100;
        this.isOn = false;
    }

    public String getLocation() {
        return location;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}