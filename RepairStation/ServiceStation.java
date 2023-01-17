package RepairStation;

import transport.Bus;
import transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport<?>> transportsQueue = new ArrayDeque<>();


    public void addCarQueue(Transport<?> transport){
        if (transport instanceof Bus){
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            transportsQueue.add(transport);
        }
    }

    public void technicalInspection(){
        Transport<?> transport = transportsQueue.poll();

        if (transport != null){
            transport.getMechanics().get(0).startTO();
        }
    }

}
