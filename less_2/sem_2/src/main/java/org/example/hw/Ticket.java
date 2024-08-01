package org.example.hw;

import java.time.LocalDateTime;

public class Ticket {
    //
    private String number;
    private LocalDateTime createdAt;
    private int queue; // людей в очереди

    public Ticket(String number, int queue) {
        this.number = number;
        this.createdAt = LocalDateTime.now();
        this.queue = queue;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", queue=" + queue +
                '}';
    }
}
