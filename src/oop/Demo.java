package oop;

class Person {
    String name;
    String email;
    String phone;

    void walking(){
        System.out.println(name + " is Walking");
    }
    void sleeping(){
        System.out.println(email + " is Sleeping");
    }
}




public class Demo {

    public static void main (String[] args){
        Person Person1 = new Person();
        Person1.name = "Joe";
        Person1.email = "Joe@SaveReadFromProperties.com";
        Person1.walking();
        Person1.sleeping();
        Person Person2 = new Person();
        Person2.name = "Sarah";
        Person2.email = "Sarha@SaveReadFromProperties.com";
        Person2.walking();
        Person2.sleeping();
        /*
        //Attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "Joe@SaveReadFromProperties.com";
        String phone = "85695896589";
        walking(name);
        sleeping(email);
        //Behaviour, Action, Activity
//        System.out.println(name + " is Walking" );
//        System.out.println(email + " is sleeping" );

        String name2 = "Sarha";
        String email2 = "Sarha@SaveReadFromProperties.com";
        String phone2 = "52362145565";
walking(name2);
sleeping(email2);
        //Behaviour, Action, Activity
//        System.out.println(name2 + " is Walking" );
//        System.out.println(email2 + " is sleeping" );
    }
    static void walking (String name){
        System.out.println(name + " is walking");
    }
    static void sleeping (String email){
        System.out.println(email + " is Sleeping");
    */
    }

}
