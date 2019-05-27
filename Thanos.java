import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> survivor = new ArrayList<>();
        // name: Black Widow, age: 34
        Hero blackWidow = new Hero("Black Widow", 34);
        // name: Captain America, age: 100
        Hero captainAmerica = new Hero("Captain America", 100);
        // name: Vision, age: 3
        Hero vision = new Hero("Vision", 3);
        // name: Iron Man, age: 48
        Hero ironMan = new Hero("Iron Man", 48);
        // name: Scarlet Witch, age: 29
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        // name: Thor, age: 1500
        Hero thor = new Hero("Thor", 1500);
        // name: Spider-Man, age: 18
        Hero spiderMan = new Hero("Spider-Man", 18);
        // name: Hulk, age: 49
        Hero hulk = new Hero("Hulk", 49);
        // name: Doctor Strange, age: 42
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        // TODO 1 : Create an empty heroes list


        survivor.add(blackWidow);
        survivor.add(captainAmerica);
        survivor.add(vision);
        survivor.add(ironMan);
        survivor.add(scarletWitch);
        survivor.add(thor);
        survivor.add(spiderMan);
        survivor.add(hulk);
        survivor.add(doctorStrange);


        // TODO 2 : Add those heroes to the list


        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(survivor);


        // TODO 5 : Keep only the half of the list
        survivor.remove(0);
        survivor.remove(1);
        survivor.remove(2);
        survivor.remove(3);
        survivor.remove(4);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < survivor.size(); i++) {
            System.out.println(survivor.get(i).getName());
        }
    }
}