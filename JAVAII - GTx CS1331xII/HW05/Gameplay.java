package HW05;

public class Gameplay {
    public static void main(String[] args) {

        BlueAstronaut Bob = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut Heath = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut Albert = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut Angel = new BlueAstronaut("Angel", 0, 1, 0);

        RedAstronaut Liam = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut Suspicious = new RedAstronaut("Suspicious Person", 100, "expert");

        Liam.sabotage(Bob);
        String output = String.format("Bob suslevel: %d frozen %b", Bob.getSusLevel(), Bob.isFrozen());
        System.out.println(output); // 30, false

        Liam.freeze(Suspicious);
        String output2 = String.format("Nothing changed -> Suspicions suslevel: %d frozen %b", Suspicious.getSusLevel(), Suspicious.isFrozen());
        System.out.println(output2); // no change
        
        Liam.freeze(Albert);
        String output3 = String.format("Albert suslevel: %d frozen %b", Albert.getSusLevel(), Albert.isFrozen());
        System.out.println(output3); // 19, frozen

        Albert.emergencyMeeting();
        String output4 = String.format("Albert suslevel: %d frozen %b", Albert.getSusLevel(), Albert.isFrozen());
        System.out.println(output4); // no change as he is frozen

        Suspicious.emergencyMeeting();
        String output5 = String.format("Suspicious suslevel: %d frozen %b", Suspicious.getSusLevel(), Suspicious.isFrozen());
        System.out.println(output5); // tie between Bob and Heath, nothing happens

        Bob.emergencyMeeting();
        String output6 = String.format("Suspicious suslevel: %d frozen %b", Suspicious.getSusLevel(), Suspicious.isFrozen());
        System.out.println(output6); // Suspicious person should have frozen true

        Bob.emergencyMeeting();
        String output7 = String.format("Suspicious suslevel: %d frozen %b", Suspicious.getSusLevel(), Suspicious.isFrozen());
        System.out.println(output7); // Suspicious person should have frozen true
        
        Heath.completeTask();
        String output8 = String.format("Heath numTasks: %d", Heath.getNumTasks());
        System.out.println(output8); // Heath should have numTasks = 1

        Heath.completeTask();
        String output9 = String.format("Heath numTasks: %d", Heath.getNumTasks());
        System.out.println(output9); // Heath should have numTasks = 1
    }
/*
 * This Java file is a driver, meaning it will run the simulation. 
 * You can also use it to test your code. 
 * Here are some basic tests to get you started with Amidst Us. 
 * These tests are by no means comprehensive, so be sure to create your own!


8.Have BlueAstronaut Heath complete tasks:
“I have completed all my tasks” should be printed to console
Heath should have: numTasks = 0, susLevel = 15

9.Have BlueAstronaut Heath complete tasks:
Nothing should happen

10.Have RedAstronaut Liam freeze Angel:
Angel should have: frozen = false
Liam should have: susLevel = 38

11.Have RedAstronaut Liam sabotage Bob twice:
Bob should have: susLevel = 46 (30 -> 37 -> 46)

12.Have RedAstronaut Liam freeze Bob:
Bob should have: frozen = true
Now there are two options going forward

13.1.Have BlueAstronaut Angel call emergency meeting:
Liam should have: frozen = true
“Crewmates win!” should be printed to console

OR


13.2.Have RedAstronaut Liam call sabotage on Heath 5 times:
Heath should have: susLevel = 41 (15->18->22->27->33->41)

14.Have RedAstronaut Liam freeze Heath:
Heath should have: frozen = true
“Impostors win!” should be printed to console

Reuse your code when possible. Certain methods can be reused using certain keywords.

Allowed Imports
To prevent trivialization of the assignment, you are only allowed to import java.util.Arrays. You are not allowed to import any other classes or packages.

Feature Restrictions
There are a few features and methods in Java that overly simplify the concepts we are trying to teach or break our auto grader. For that reason, do not use any of the following in your final submission:

var (the reserved keyword)
System.exit
 */
}
