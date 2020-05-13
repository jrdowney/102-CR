public class Example {
    public static void main(String[]args){
        //objects interaction
        User shay = new User("Shay",21);
        // second object
        User jonathan = new User("Jonathan",38);

        Student cristian = new Student("Christian",30,9);
        Student austin = new Student("Austin",4,9);


        //display the object
        shay.printUser();

        //display the second object
        jonathan.printUser();

        cristian.printStudent();
        austin.printStudent();

        //  two animals
        Animal shark = new Animal("Baby", "Shark");
        Animal karmady = new Animal("Karmady", "Cat");

        shark.printAnimal();
        karmady.printAnimal();

        shark.attacks(shay);
        karmady.attacks(austin);
        
    }
}