package com.example.minecraft.impl;

import com.example.minecraft.Minecraft;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class MinecraftImpl implements Minecraft {

  public MinecraftImpl(Vertx vertx, JsonObject config) {
    // initialization...
  }

  // TODO: Implement your service here...

  public void close() {
    // clean up...
  }

@Override
public void showTitle(String message, Handler<AsyncResult<Void>> handler) {
  System.out.println(message);
  handler.handle(Future.succeededFuture());
}
}
