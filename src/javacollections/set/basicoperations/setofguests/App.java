package javacollections.set.basicoperations.setofguests;

public class App {
  public static void main(String[] args) {
    SetOfGuests setOfGuests = new SetOfGuests();
    setOfGuests.addGuest("John", 123456);
    setOfGuests.addGuest("Emily", 987654);
    setOfGuests.addGuest("Michael", 567890);
    setOfGuests.addGuest("Sarah", 234567);
    setOfGuests.addGuest("William", 345678);
    setOfGuests.addGuest("Olivia", 789012);
    setOfGuests.addGuest("James", 456789);
    setOfGuests.addGuest("Sophia", 890123);
    setOfGuests.addGuest("Benjamin", 654321);
    setOfGuests.addGuest("Ava", 901234);
    setOfGuests.addGuest("Daniel", 876543);
    setOfGuests.removeGuestByInvitationCode(789012);
    setOfGuests.showGuests();
    setOfGuests.countGuests();
  }
}