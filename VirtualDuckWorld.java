public class VirtualDuckWorld {
    public static void main(String[] args) {
        // Create a new duck
        // Create 2 new duck

        Duck bunny = new Duck();
        Duck downy = new Duck();

        // Set our dogs' names
        bunny.setName("Bunny");
        downy.setName("Downy");

        // Set our dogs' ages
        bunny.setAge(4);
        downy.setAge(6);


        String message = bunny.speak();
        String message2 = downy.speak();
        System.out.println("Bunny says, " + message);
        System.out.println(bunny.getName() + " says, " + message);
        System.out.println("We have two dogs:");
        System.out.println("Name = " + bunny.getName() + "\nAge = " + bunny.getAge() + "\n" + bunny.speak() +
                "\n\nName = = " + downy.getName() + "\nAge = " + downy.getAge() + "\n" + downy.speak());
    }
}
