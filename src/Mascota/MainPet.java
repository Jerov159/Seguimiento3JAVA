package Mascota;

public class MainPet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lupe", 2, "pitbull", "Black and white");
        Pet pet2 = new Pet("Firulais", 3, "chanda", "Golden");
        Pet pet3 = new Pet("Arle", 5, "Golden Retriever", "Black");

        System.out.println("His name is: " + pet1.getName()
                + "\n The age is:  " + pet1.getAge() + "\n The race is: " + pet1.getRace() + "\n The color is: " + pet1.getColor());

        System.out.println("His name is: " + pet2.getName()
                + "\n The age is: " + pet2.getAge() + "\n The race is: " + pet2.getRace() + "\n The color is: " + pet2.getColor());

        System.out.println("His name is: " + pet3.getName()
                + "\n The age is: " + pet3.getAge() + "\n The race is: " + pet3.getRace() + "\n The color is: " + pet3.getColor());


        pet1.setName("Doggui");pet1.setAge(2); pet1.setRace("bullterrier");pet1.setColor("White");

        System.out.println("His name is: " + pet1.getName()
                + "\n The age is:  " + pet1.getAge() + "\n The race is: " + pet1.getRace() + "\n The color is: " + pet1.getColor());

    }

}