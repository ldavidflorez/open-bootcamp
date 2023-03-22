package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public NotificationService service;

    public UserService(NotificationService service) {
        this.service = service;

        System.out.println("Creando objeto UserService...");
    }

    public void saludar() {
        service.imprimirSaludo();
    }

}
