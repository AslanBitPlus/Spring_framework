package org.example.hw;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TicketDisplay {
    private TicketNumberGenerator generator;
    private int queue = 0;

    public TicketDisplay(TicketNumberGenerator generator) {
        this.generator = generator;
    }

    public TicketDisplay() {
    }

    public Ticket newTicket(){
        return new Ticket(generator.createNewNumber(), queue++);
    }
}
