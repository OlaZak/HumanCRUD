import java.util.Scanner;

public class Menu {

Redactor redactor = new Redactor();

    public Human[] createHuman(Human[]humans){
    Human human1 = new Human();
        System.out.println("Enter Data for new Human");
        System.out.println("Name:");
        human1.setName(readConsoleElement());
        System.out.println("LastName: ");
        human1.setLastName(readConsoleElement());
        System.out.println("Age: ");
        human1.setAge(Integer.parseInt(readConsoleElement()));
   return redactor.addHuman(humans,human1);
    }

    public void readHuman (Human[] humans){redactor.readNuman(humans);}

    public Human[] updateHuman(Human[]humans){
        Human human;
        System.out.println("Please enter Data for update Human:");
        System.out.println("Enter ID for update:");
        human = redactor.findById(humans, Integer.parseInt(readConsoleElement()));
        System.out.println("Enter new Name:");
        human.setName(readConsoleElement());
        System.out.println("Enter new LastName:");
        human.setLastName(readConsoleElement());
        System.out.println("Enter new Age");
        human.setAge(Integer.parseInt(readConsoleElement()));
        return redactor.updateHuman(humans,human);
    }

    public Human[] deleteHuman (Human[]humans){
        int id;
        System.out.println("Please enter data for delete Human:");
        System.out.println("Enter ID for delete:");
        id = Integer.parseInt(readConsoleElement());
        if (redactor.findById(humans, id) != null) {
            redactor.deleteHuman(humans, id);
        }
        return humans;
    }

    public Human[] sortHumansById(Human[] humans) {
        Human[] sortedHuman = new Human[humans.length];
        int count = 0;
        Human secondHuman;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] != null) {
                sortedHuman[count] = humans[i];
                count++;
            }
        }
        for (int i = 1, j = 0; i < sortedHuman.length; i++, j++) {

            if (sortedHuman[i] != null) {
                secondHuman = sortedHuman[i];
                Human firstHuman = sortedHuman[j];
                if (secondHuman.getId() < firstHuman.getId()) {
                    sortedHuman[j] = secondHuman;
                    sortedHuman[i] = firstHuman;
                }
            }
        }
        humans = sortedHuman;
        return humans;
    }



    public String readConsoleElement (){
        String value;
        Scanner scanner = new Scanner(System.in);
        value= scanner.nextLine();
        return value;
    }
}
