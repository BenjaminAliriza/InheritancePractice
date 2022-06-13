package chapter9;

import java.util.Scanner;

public class InheritanceTester {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);



        int tries = 1;
        //requesting information
        while (tries == 1) {
            System.out.println("What is your name?");
            String presentedName = scanner.next();
            employee.setName(presentedName);

            System.out.println("What is your age?");
            int presentedAge = scanner.nextInt();
            employee.setAge(presentedAge);

            System.out.println("What is your gender?");
            String presentedGender = scanner.next();
            employee.setGender(presentedGender);

            String currentName = employee.getName();


            System.out.println("What is your employee ID?");
            String presentedId = scanner.next();
            employee.setEmployeeID(presentedId);

            System.out.println("Lastly, what is your job title?");
            String presentedTitle = scanner.next();
            employee.setTitle(presentedTitle);

            //currently set information
            int currentAge = employee.getAge();
            String currentGender = employee.getGender();
            String currentId = employee.getEmployeeID();
            String currentTitle = employee.getTitle();


//            allowing user to verify information
            System.out.println("EXCELLENT! "+currentName+", is the following information correct?\nName: " + currentName + "\nAge: " + currentAge + "" +
                    "\nGender: " + currentGender + "\nEmployee ID: " + currentId + "\nJob Title: " + currentTitle);

            int finalCheck = 1;
            while (finalCheck == 1) {

//          requesting verification
            System.out.println("Please type Y for yes or N for no.");
            String verified = scanner.next();



                if (verified.equals("N") || verified.equals("Y")) {
                    if (verified.equals("Y")) {
                        System.out.println("Thank you so much for registering your details.\nGoodbye, " + currentName);
                        tries--;
                        finalCheck--;
                    } else if (verified.equals("N")) {
                        System.out.println("You kak... restart then you poephol!");
                        break;
                    }
                } else {
                    System.out.println("Can't you read? I said you must type Y for yes or N for no...");
                }


            }
        }

    }
}
