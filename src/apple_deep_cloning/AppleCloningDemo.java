package assorted__TO_MOVE.object_cloning;

public class AppleCloningDemo {
    public static void main(String[] args) {

        //instantiating and populating original objects
        Apple apple = new Apple();
        Seed seed1 = new Seed("black seed");
        Seed seed2 = new Seed("red seed");
        Seed seed3 = new Seed("yellow seed");
        Seed seed4 = new Seed("green seed");
        Seed seed5 = new Seed("purple seed");
        apple.addAllSeeds(seed1, seed2, seed3, seed4, seed5);

        //cloning original object
        Apple clonedApple = apple.clone();

        System.out.println("Original seeds desc: ");
        apple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));

        System.out.println("\n----------------------------");

        System.out.println("Cloned seed desc: ");
        clonedApple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));

        //modify original seed desc
        apple.getSeeds().forEach(seed -> seed.setDescription("Dead seed"));

        System.out.println("\n----------------------------");

        System.out.println("Original seed desc after seeds in original object modified: ");
        apple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));

        System.out.println("\n----------------------------");

        System.out.println("Cloned seed desc after seeds in original object modified: ");
        clonedApple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));

        //empty original seed list
        System.out.println("\n----------------------------");
        apple.getSeeds().clear();

        System.out.println("Original list seed desc after list cleared: ");
        apple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));

        System.out.println("\n----------------------------");

        System.out.println("Cloned list seed desc after original list cleared: ");
        clonedApple.getSeeds().forEach(seed -> System.out.print(seed.getDescription() + " "));




    }
}
