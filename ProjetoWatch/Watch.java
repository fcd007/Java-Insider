public class Watch {
    Pointer hour;
    Pointer minute;
    Pointer second;

    void setTime(int hour, int minute, int second) {
        this.hour.setNumber(hour);
        this.minute.setNumber(minute / 5);
        this.second.setNumber(second / 5);
    }

    int readHour() {
        return this.hour.getNumber();
    }

    int readMinute() {
        return this.minute.getNumber() * 5;
    }

    int readSecond() {
        return this.second.getNumber() * 5;
    }
}
