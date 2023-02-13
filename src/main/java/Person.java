public class Person {

    private String name;

    public Person(String myName){
        name = myName;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public String sayHello(){
//TODO: print a message to the console using the person's name
        return String.format("Hey this person's name is: %s", name);
    }

    public static void main(String[] args) {
        Person jennie = new Person("Jennie");
//        jennie.name = "Jennie";
//        System.out.println(jennie.getName());
        System.out.println(jennie.sayHello());

        Person jack = new Person("Jack");
//        jack.name = "Jack";
        System.out.println(jack.sayHello());
    }

}
