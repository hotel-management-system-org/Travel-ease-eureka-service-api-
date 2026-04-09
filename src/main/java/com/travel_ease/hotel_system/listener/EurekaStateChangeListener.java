package com.travel_ease.hotel_system.listener;

import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void onInstanceRegistered(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("Service Registered: {} - {}:{}",
                instanceInfo.getAppName(), 
                instanceInfo.getIPAddr(), 
                instanceInfo.getPort());
    }

    @EventListener
    public void onInstanceCanceled(EurekaInstanceCanceledEvent event) {
        log.warn("Service Deregistered: {}", event.getAppName());
    }

    @EventListener
    public void onInstanceRenewed(EurekaInstanceRenewedEvent event) {
        log.debug("Service Renewed: {}", event.getInstanceInfo().getAppName());
    }

    @EventListener
    public void onRegistryAvailable(EurekaRegistryAvailableEvent event) {
        log.info("Eureka Registry is now Available");
    }

    @EventListener
    public void onServerStart(EurekaServerStartedEvent event) {
        log.info("Eureka Server Started Successfully!");
    }
}