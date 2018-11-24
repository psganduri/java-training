package labs;

import java.sql.SQLOutput;

class StudentDatabase {
    public static void main(String[] args) {
        Student first = new Student("Joe", "5536256");
        Student second = new Student("Tom", "523632562");

        first.setCity("Nepal");
        System.out.println(first.getCity());
        first.setPhone("0123652145");
        System.out.println(first.getPhone());
        first.setState("katmandu");
        System.out.println(first.getState());
        first.enroll("Maths001");
        first.enroll("Maths002");
        first.pay(300.00);
        first.checkbalance();
        first.tostring();
        first.showcourse();
    }
}

class Student {
    //Instance variables
    private String name;
    private String SSN;
    private static int id = 5001;
    private static final int costOfCourse = 800;
    private String phone;
    private String city;
    private String state;
    private String courses = "";
    private double balance=0;

    //constructor
    public Student(String name, String SSN) {
        id++;
        this.name = name;
        this.SSN = SSN;
        //to generate email from name
        //local variables email,userid, random
        setEmail();
        userid();

    }

    private void userid() {
        //to generate user id = static id+ random 4 digit num between 1000 and 9000 + last 4 digits of SSN
        String userid;
        String ssnNeeded = "";
//        System.out.println("id private: " + id);
        int random = (int) ((Math.random() * 100) + 1000);
//        System.out.println("random number generated is: " + random);
        if (SSN.length() == 4) {
            ssnNeeded = SSN;
        } else if (SSN.length() > 4) {
            ssnNeeded = SSN.substring(SSN.length() - 4);
        } else {
            System.out.println("Enter SSN greater than or equal to 4 characters");
        }
        //        System.out.println("checking substing of "+SSN +"is: "+SSN.substring(SSN.length()));
        userid = (id + "" + random + "" + ssnNeeded);
        System.out.println("Userid generated is: " + userid);
    }


    //    Setters/getters
    private void setEmail() {
        String email = (name.toLowerCase() + "." + id + "@javastudent.com");
        System.out.println("New student email generated is: " + email);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void enroll(String course) {
        this.courses = this.courses +"\n"+ course;
        System.out.println("You have enrolled successfully to course: "+course);
        balance=balance+costOfCourse;
        System.out.println("Balance amount to pay is: "+ balance);

    }

    public void pay(double amount) {
        System.out.println("Thanks for your payment of amount:" + amount);
        balance = (balance-amount);


    }

    public void checkbalance() {
        System.out.println("Balance amount to be paid is: "+balance);

    }

    public void tostring() {
        System.out.println("Name:"+name+ "Courses enrolled to : "+courses+"balance: "+"Cost Per course is "+costOfCourse +"Your balance after payment is "+balance);

    }

    public void showcourse() {
        System.out.println("You have now enrolled to courses:"+courses);

    }
}