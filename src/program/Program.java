package program;

import time.TimeMenu;
import time.TimeService;

public class Program {

    public static void main(String[] args) {
        TimeService timeService = new TimeService();
        TimeMenu timeMenu = new TimeMenu();
        timeMenu.showNewTime(timeService.timeEntry());
    }
}
