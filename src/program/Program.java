package program;

import Service.TimeMenu;
import Service.TimeService;

public class Program {

    public static void main(String[] args) {
        TimeService timeService = new TimeService();
        TimeMenu timeMenu = new TimeMenu();
        timeMenu.showNewTime(timeService.timeEntry());
    }
}
