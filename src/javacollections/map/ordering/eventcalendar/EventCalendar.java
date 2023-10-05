package javacollections.map.ordering.eventcalendar;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javacollections.Common;

public class EventCalendar {
  private Map<LocalDate, Event> eventCalendar;

  private String toString(Map.Entry<LocalDate, Event> entry) {
    return "Date: " + entry.getKey() + " | " + entry.getValue();
  }

  private String data = "event";

  public EventCalendar() {
    this.eventCalendar = new HashMap<>();

    Common.printAppName(data + " calendar");
  }

  public void addEvent(LocalDate date, String name, String attraction) {
    Common.printCommonOperationName(1, data);

    try {
      if (date == null || name == null || name.isBlank() || attraction == null || attraction.isBlank()) {
        throw new IllegalArgumentException();
      }

      Event event = new Event(name, attraction);
      eventCalendar.put(date, event);

      Common.printSuccessfulMessage("Date : " + date + " | " + event);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void showEvents() {
    Common.printCommonOperationName(4, data);

    try {
      if (eventCalendar.isEmpty()) {
        throw new Exception();
      }

      Map<LocalDate, Event> orderedEvents = new TreeMap<>(eventCalendar);

      for (Map.Entry<LocalDate, Event> entry : orderedEvents.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showNextEvent() {
    Common.printCustomOperationName("Show next " + data);

    try {
      if (eventCalendar.isEmpty()) {
        throw new Exception();
      }

      LocalDate today = LocalDate.now();

      Map<LocalDate, Event> orderedEvents = new TreeMap<>(eventCalendar);
      boolean nextEvent = false;

      for (Map.Entry<LocalDate, Event> entry : orderedEvents.entrySet()) {
        if (entry.getKey().isEqual(today) || entry.getKey().isAfter(today)) {
          System.out.println(toString(entry));
          nextEvent = true;
        }
      }

      if (!nextEvent) {
        throw new Exception();
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
