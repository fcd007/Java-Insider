public class Aplicacao {

    public static void main(String[] args) {
        Pointer hour = new Pointer();
        Pointer minute = new Pointer();
        Pointer second = new Pointer();

        Watch relogio1 = new Watch();
        relogio1.hour = hour;
        relogio1.minute = minute;
        relogio1.second = second;

        relogio1.setTime(3, 25, 50);

        System.out.println("Horário " + relogio1.readHour() + ":" + relogio1.readMinute() + ":" + relogio1.readSecond());
    }
}
