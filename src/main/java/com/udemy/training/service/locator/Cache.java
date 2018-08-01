package com.udemy.training.service.locator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cache {

    private List<Service> services;

    public Cache() {
        this.services = new ArrayList<>();
    }

    public Service getService(String jndi) {
        return services.stream()
                .filter(service -> jndi.equals(service.getName()))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            if (list.size() != 1) {
                                System.out.println(MessageFormat.format("Service {0} is not in cache.", jndi));
                                return null;
                            }
                            return list.get(0);
                        }
                ));
    }

    public void addService(Service service) {
        services.add(service);
    }
}
