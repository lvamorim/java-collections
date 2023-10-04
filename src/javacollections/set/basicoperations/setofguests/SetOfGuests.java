package javacollections.set.basicoperations.setofguests;

import java.util.HashSet;
import java.util.Set;

import javacollections.Common;

public class SetOfGuests {
  private Set<Guest> setOfGuests;
  private String data = "guest";

  public SetOfGuests() {
    this.setOfGuests = new HashSet<>();

    Common.printAppName("Set of guests");
  }

  public void addGuest(String name, int invitationCode) {
    Common.printCommonOperationName(1, data);

    try {
      if (name == null || name.isBlank() || invitationCode == 0) {
        throw new IllegalArgumentException();
      }

      Guest guest = new Guest(name, invitationCode);
      setOfGuests.add(guest);
      Common.printSuccessfulMessage(guest);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeGuestByInvitationCode(int invitationCode) {
    Common.printCommonOperationName(2, data);

    try {
      if (invitationCode == 0) {
        throw new IllegalArgumentException();
      }

      Guest guestToRemove = null;

      for (Guest guest : setOfGuests) {
        if (guest.getInvitationCode() == invitationCode) {
          guestToRemove = guest;
          break;
        }
      }

      setOfGuests.remove(guestToRemove);

      if (guestToRemove == null) {
        throw new Exception();
      }

      Common.printSuccessfulMessage(guestToRemove);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showGuests() {
    Common.printCommonOperationName(4, data);

    try {
      if (setOfGuests.isEmpty()) {
        throw new Exception();
      }

      for (Guest guest : setOfGuests) {
        System.out.println(guest);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void countGuests() {
    Common.printCustomOperationName("Guest count");
    int numberOfGuests = setOfGuests.size(); 

    System.out.println(numberOfGuests);
  }
}