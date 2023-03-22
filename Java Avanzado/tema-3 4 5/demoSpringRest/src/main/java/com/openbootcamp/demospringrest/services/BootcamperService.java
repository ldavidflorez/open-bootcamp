package com.openbootcamp.demospringrest.services;

import com.openbootcamp.demospringrest.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }

        return null;
    }

    public void delete(String nombre) {
        int idx = 0;
        for (Bootcamper bootcamper: bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                bootcampers.remove(idx);
                return;
            }
            idx++;
        }
    }

    public void update(String nombre, Bootcamper newBootcamper) {
        int idx = 0;
        for (Bootcamper bootcamper: bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                bootcampers.set(idx, newBootcamper);
                return;
            }
            idx++;
        }
    }
}
