public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Amina","London");
        Person person2 = new Person("bob", "Brighton");

        System.out.println(person1.getName());
        person1.setName("Richard");



        person1.greet(" afternoon");
        person2.greet(" evening");

        String person1Bio = person1.generateBio();
        String person2Bio = person2.generateBio();

        System.out.println(person1Bio);
        System.out.println(person2Bio);

        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);


    }


}
