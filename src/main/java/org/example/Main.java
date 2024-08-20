package org.example;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin server = Javalin.create()
                .start(7000);
        server.get("hello", ctx -> ctx.result("Hello World"));
    }
}