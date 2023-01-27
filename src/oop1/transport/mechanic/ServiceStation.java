package oop1.transport.mechanic;

import oop1.transport.Bus;
import oop1.transport.Transport;


import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public void addTransportToQueue(Transport<?> transport) {
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
                transport.getMechanics().get(0).maintenance();
            }
        } catch (RuntimeException e) {
            System.out.println("В очереди нет машин");
        }
    }
}
