package eventSystem.services;

import eventSystem.models.Event;

import java.util.List;

public interface EventService {
    List<Event> findAll();
    List<Event> findUpcoming5();
    Event findById(Long id);
    Event create(Event event);
    Event edit(Event event);
    void deleteById(Long id);
}
