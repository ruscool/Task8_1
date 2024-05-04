import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Main {
    public static void main(String[] args) {
        TaskNumber numberTask = new TaskNumber();
        numberTask.printNumberTask("8.1");
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;

        String question = " является ли день недели выходным? ";
        System.out.println(monday.getDayName() + question + monday.isWeekend()); // false
        System.out.println(saturday.getDayName() + question + saturday.isWeekend()); // true
        System.out.println(sunday.getDayName() + question + sunday.isWeekend()); // true


        numberTask.printNumberTask("8.2");
        for (UserRole role : UserRole.values()) {
            System.out.println(role + " авторизован? " + role.isAuthorized());
        }

    }
}