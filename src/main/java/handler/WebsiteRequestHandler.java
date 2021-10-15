package handler;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public interface WebsiteRequestHandler {
    String handle(HttpExchange exchange, String request) throws IOException;
}
