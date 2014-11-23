package com.joelcoulson.exceptions;

public class Engine {

    private static final int MAX_RPM = 8000;

    public Engine() {}

    public void revEngine(int rpm) throws EngineException {
        if(rpm > MAX_RPM) {
            throw new EngineException(rpm + " exceeds the maxmimum rpm of " + MAX_RPM);
        } else {
            System.out.println("Engine revved to " + rpm + " rpm");
        }
    }

    public static void main(String[] args) {
        Engine engine = new Engine();

        try {
            engine.revEngine(2000);
            engine.revEngine(4000);
            engine.revEngine(8000);
            engine.revEngine(16000);
        } catch(EngineException ee) {
            System.out.println("Exception: " + ee.getMessage());
        }
    }

}
