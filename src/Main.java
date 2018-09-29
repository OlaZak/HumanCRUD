public class Main {
    public static void main(String[] args) {


        Human [] humans = new Human[10];
        Routing routing=new Routing();

        while (!routing.theEndProgram){
            routing.mainMenu();
            humans=routing.route(humans);
        }
    }
}
