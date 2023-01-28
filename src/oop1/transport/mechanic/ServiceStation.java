package oop1.transport.mechanic;

import oop1.transport.Bus;
import oop1.transport.Transport;
import oop1.transport.drivers.Driver;


import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport<? extends Driver>> transportQueue = new ArrayDeque<>();

    public void addTransportToQueue(Transport<? extends Driver> transport) {
/*
        if (transport instanceof Bus) {

 */
        if (transport.isNeedService()) {
            transportQueue.add(transport);
            System.out.println("В очередь добавлена машина: " + transport.getBrand() + " " + transport.getModel());
        } else {
            System.out.println(transport.getBrand() + " " + transport.getModel() + " не проходит техобслуживание");
        }
    }

    public void startMaintenance() {

        if (!transportQueue.isEmpty()) {
            Transport<?> transport = transportQueue.poll();
            transport.getMechanics().iterator().next().maintenance();
        } else {
            System.out.println("В очереди нет машин");
        }
    }
}
