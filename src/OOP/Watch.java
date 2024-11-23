package OOP;

public class Watch {
    private int hours;
    private int minutes;


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        if (minutes <= 0 || minutes < 59) {
            this.minutes = minutes % 60;
        }
        return minutes;
    }

    public int getHours() {
        if (hours <= 0 || hours < 23) {
            this.hours = hours % 23;
        }
        return hours;
    }

    public String getTimeInfo() {
        return String.format("%02d:%02d", getHours(), getMinutes());
    }
}
