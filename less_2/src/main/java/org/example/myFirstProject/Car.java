package org.example.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Autowired
    Engine engine;

    public void start() {
        engine.go();
    }

}
