import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    Map<Person, List<Pet>> map = new HashMap<>();

    public void addMember (Person person, List<Pet> list){
        map.put(person, list);
    }

    public void addPet (Person person, Pet pet){
        List<Pet> list = map.get(person);
        list.add(pet);
        map.put(person, list);
    }

    public void remuvePet (Person person, Pet pet){
        List<Pet> list = map.get(person);
        list.remove(pet);
        map.put(person, list);
    }

    public void remuvePerson (Person person){
        map.remove(person);
    }

    public void remuveSpecialPet (Pet pet){
        for (Map.Entry<Person, List<Pet>> entry: map.entrySet()){
            List<Pet> list = entry.getValue();
            if (list.contains(pet));
            list.remove(pet);
            map.put(entry.getKey(), list);
        }
    }

    public void printClub(){
        for (Map.Entry<Person, List<Pet>> entry:map.entrySet()){
            System.out.println(entry.getKey().toString());
            for (Pet pet: entry.getValue()){
                System.out.println(pet.toString());
            }
        }
    }
}
