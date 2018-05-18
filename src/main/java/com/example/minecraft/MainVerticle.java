package com.example.minecraft;

import com.example.minecraft.impl.MinecraftImpl;

import io.vertx.core.AbstractVerticle;
import io.vertx.serviceproxy.ServiceBinder;

public class MainVerticle extends AbstractVerticle {

  private MinecraftImpl service;

  @Override
  public void start() throws Exception {
    service = new MinecraftImpl(vertx, config());
    new ServiceBinder(vertx)
      .setAddress(Minecraft.DEFAULT_ADDRESS)
      .register(Minecraft.class, service);
  }

  @Override
  public void stop() throws Exception {
    service.close();
  }
}
