package oop1.transport.mechanic;

import oop1.transport.Bus;
import oop1.transport.Transport;
import oop1.transport.drivers.Driver;


import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport<? extends Driver>> transportQueue = new ArrayDeque<>();

    public void addTransportToQueue(Transport<? extends Driver> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не проходят техобслуживание");
        } else {
            transportQueue.add(transport);
            System.out.println("В очередь добавлена машина: " + transport.getBrand() + " " + transport.getModel());
        }
    }

    public void startMaintenance() {
        Transport<?> transport = transportQueue.poll();

        try {
            if (transportQueue != null) {
                transport.getMechanics().iterator().next().maintenance();
            }
        } catch (RuntimeException e) {
            System.out.println("В очереди нет машин");
        }
    }
}
