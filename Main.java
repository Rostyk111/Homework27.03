import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        String type;
        String petName;
        while (true) {
            System.out.println("Animal Club");
            System.out.println("Виберіть дію від 0 до 6");
            System.out.println("0 - виіхд");
            System.out.println("1 - додати учасника");
            System.out.println("2 - додати тварину");
            System.out.println("3 - видалити тварину");
            System.out.println("4 - видалити учасника");
            System.out.println("5 - видалити конкретну тварину");
            System.out.println("6 - список клубу");
            String input = scanner.nextLine();
            switch (input) {

                case "0":
                    System.exit(0);
                    break;
                case "1":
                    System.out.println(" Введіть ім'я учасника ");
                    name = scanner.nextLine();
                    System.out.println(" Введіть вік учасника ");
                    age = Integer.parseInt(scanner.nextLine());
                    zooClub.addMember(new Person(name,age), new ArrayList<>());
                    break;

                case "2":
                    System.out.println(" Введіть вид тварини ");
                    type = scanner.nextLine();
                    System.out.println(" Введіть кличку тварини ");
                    petName = scanner.nextLine();
                    System.out.println(" Введіть ім'я учасника ");
                    name = scanner.nextLine();
                    System.out.println("Введіть вік учасника ");
                    age = Integer.parseInt(scanner.nextLine());
                    zooClub.addPet(new Person(name,age), new Pet(type,petName));
                    break;


                case "3":
                    System.out.println(" Введіть вид тварини ");
                    type = scanner.nextLine();
                    System.out.println("Введіть кличку тварини");
                    petName = scanner.nextLine();
                    System.out.println("Введіть ім'я учасника ");
                    name = scanner.nextLine();
                    System.out.println("Введіть вік учасника ");
                    age = Integer.parseInt(scanner.nextLine());
                    zooClub.remuvePet(new Person(name,age), new Pet(type,petName));
                    break;
                case "4":
                    System.out.println("Введіть ім'я учасника ");
                    name = scanner.nextLine();
                    System.out.println("Введіть вік учасника ");
                    age = Integer.parseInt(scanner.nextLine());
                    zooClub.remuvePerson(new Person(name,age));
                    break;
                case "5":
                    System.out.println("Введіть вид тварини ");
                    type = scanner.nextLine();
                    System.out.println("Введіть кличку тварини");
                    petName = scanner.nextLine();
                    zooClub.remuveSpecialPet(new Pet(petName, type));
                    break;
                case "6":
                    zooClub.printClub();
            }
        }
    }
}