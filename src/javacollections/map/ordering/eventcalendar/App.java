package javacollections.map.ordering.eventcalendar;

import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    EventCalendar eventCalendar = new EventCalendar();
    eventCalendar.addEvent(LocalDate.of(2023, 3, 15), "Spring Festival", "Live music and food stalls");
    eventCalendar.addEvent(LocalDate.of(2023, 11, 5), "Holiday Market", "Artisan crafts and holiday cheer");
    eventCalendar.addEvent(LocalDate.of(2022, 7, 8), "Summer Concert Series", "Featuring local bands");
    eventCalendar.addEvent(LocalDate.of(2023, 9, 20), "Tech Conference", "Keynote speakers and workshops");
    eventCalendar.addEvent(LocalDate.of(2023, 6, 10), "Food Truck Festival", "Gourmet cuisine");
    eventCalendar.addEvent(LocalDate.of(2022, 4, 2), "Art Gallery Opening", "Exhibition of art");
    eventCalendar.addEvent(LocalDate.of(2023, 8, 25), "Sports Championship", "Competition and fanfare");
    eventCalendar.addEvent(LocalDate.of(2022, 2, 14), "Valentine's Day Dinner", "Romantic dining experience");
    eventCalendar.addEvent(LocalDate.of(2023, 10, 2), "Film Festival", "Screening of award-winning films");
    eventCalendar.addEvent(LocalDate.of(2023, 12, 31), "New Year's Eve Party", "Fireworks and live DJ");
    eventCalendar.showEvents();
    eventCalendar.showNextEvent();
  }
}
