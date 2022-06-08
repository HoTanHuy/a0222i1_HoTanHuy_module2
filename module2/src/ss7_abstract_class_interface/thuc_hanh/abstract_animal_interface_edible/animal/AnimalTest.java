package ss7_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals){
            animal.makeSound();
        }

    }
}
