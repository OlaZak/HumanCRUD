public class Redactor {

    Human human = new Human();

    public Human[] addHuman(Human[] humans, Human human) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] == null) {
                humans[i] = human;
                break;
            }
        }
        return humans;
    }

    public void readNuman(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] != null) {
                System.out.println(humans[i].toString());
            }
        }
    }
    public Human findById(Human[] humans, int id){
        Human human=null;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getId() == id){
                human=humans[i];
                break;
            }
        }
        return human;
    }

    public Human[] updateHuman (Human[] humans,Human human) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getId() == human.getId()){
                humans[i] = human;
            break;
            }
        }
        return humans;
    }

        public Human[] deleteHuman (Human[] humans, int id){
            for (int i = 0; i < humans.length; i++) {
                if (humans[i].getId()==id){
                    humans[i]=null;
                break;
                }
            }
            return humans;
    }

}
