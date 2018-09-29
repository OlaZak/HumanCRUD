public class Routing {
    Menu menu = new Menu();
    Redactor redactor = new Redactor();

    boolean theEndProgram = false;

    public void mainMenu() {
        System.out.println("----------MENU----------- \n" +
                "Please, enter the command for action \n" +
                "c - create \n" +
                "r - read \n" +
                "u - update \n" +
                "d - delete \n" +
                "s - sort by id \n" +
                "exit - for finish program");
    }

    public Human[] route(Human[] humans) {
        String command = menu.readConsoleElement();
        if (command.equalsIgnoreCase("c")) {
            humans = menu.createHuman(humans);
        } else if (command.equalsIgnoreCase("r")) {
            menu.readHuman(humans);
        } else if (command.equalsIgnoreCase("u")) {
            humans = menu.updateHuman(humans);
        } else if (command.equalsIgnoreCase("d")) {
            humans = menu.deleteHuman(humans);
        } else if (command.equalsIgnoreCase("s")) {
            humans = menu.sortHumansById(humans);
        } else if (command.equalsIgnoreCase("exit")) {
            System.out.println("You exit from program: ");
            theEndProgram = checkExit();
        } else {
            System.out.println("Incorrect command try again : ");
        }
        return humans;
    }

    private boolean checkExit() {
        System.out.println("If you want exit enter 'y', return enter other value: ");
        if (menu.readConsoleElement().equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }


}
