public class Player {
/*
 * This class represents a player in the game. You must not be able to create an instance of this class (Hint: there is a keyword that prevents us from creating instances of a class). Players implement the Comparable interface with the proper type parameter.

A portion of this class was given to you. There are 2 methods (as follows) that you need to implement. Make sure to code where there are comments that say YOUR CODE HERE. Javadocs have been provided to guide you.

Variables (These have been provided to you)
String name – The Player’s name as a String.
int susLevel – This represents how suspicious a Player is; the higher, the more suspicious.
boolean frozen – This represents if a Player is frozen, which will affect their ability to participate in some methods below.
static Player[] players – This is the array of Player objects that have been created. It is always guaranteed to be full by the constructor (no null spaces), so if a Player is created, players becomes larger by one. Frozen players will NOT be removed from this array! (Note: It’s ok move around elements in this array, but don’t add or delete any elements)
Methods
Do not create any other methods than those specified. Any extra methods will result in point deductions. All methods must have the proper visibility to be used where it is specified they are used.

emergencyMeeting()
Any concrete class that extends the Player class must provide a method definition for emergencyMeeting()
An abstract method for a Player to call an emergency meeting to vote on which Player to freeze
Does not return anything
compareTo(Player p)
Override the compareTo method (You should be able to put @Override on the line before the method header)
Takes in a Player object and returns an int, adhering to the API contract (Comparable Interface)
The method body should compare two Player objects based on the susLevel attribute. If the current Player instance’s susLevel is less than the Player passed in, return a negative number. If it is greater, return a positive number. If their susLevel attributes are equal, return 0
 */
}
