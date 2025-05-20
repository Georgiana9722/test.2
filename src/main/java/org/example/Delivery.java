package org.example;

public class Delivery implements Runnable {
    private final DeliveryGroup deliveryGroup;
    public Delivery(DeliveryGroup deliveryGroup) {
        this.deliveryGroup = deliveryGroup;
    }
    @Override
    public void run() {
        String message= " [Delivering for <Apahida> and date <2017-09-02> in <15> seconds] "
                .formatted(deliveryGroup.location(),
                        deliveryGroup.deliveryDate(),deliveryGroup.distancekm());
        System.out.println(message);

        try{
            Thread.sleep(deliveryGroup.distancekm() * 1_000 );
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
