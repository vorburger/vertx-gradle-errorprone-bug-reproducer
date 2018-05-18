package com.example.minecraft;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ServiceProxyBuilder;

/**
 * Minecraft API.
 */
@VertxGen
@ProxyGen
public interface Minecraft {

  void showTitle(String message, Handler<AsyncResult<Void>> results);

  /**
   * The default service address.
   */
  String DEFAULT_ADDRESS = "com.example.minecraft.service";

  /**
    * Method called to create a proxy (to consume the service).
    *
    * @param vertx   vert.x
    * @param address the address on the event bus where the service is served.
    * @return the proxy
    */
  static Minecraft createProxy(Vertx vertx, String address) {
    return new ServiceProxyBuilder(vertx)
      .setAddress(address)
      .build(Minecraft.class);
  }
}
