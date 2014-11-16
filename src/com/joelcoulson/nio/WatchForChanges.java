package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;

public class WatchForChanges {

    public static void main(String[] args) {

        Path path = Paths.get("/tmp/");
        WatchService watchService = null;

        try {

            // we create a new watch service via the path object
            watchService = path.getFileSystem().newWatchService();

            // registers the file located by this path with a watch service. in this
            // case, all modify events are watched for within the path
            path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            // infinitely loop
            for (;;) {
                WatchKey key = null;
                try {
                    // retrieves and removes the next watch key. waits if none are present
                    key = watchService.take();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }

                // retrieves and removes all pending events for this watch key
                // returning a List of the events that were retrieved
                for (WatchEvent<?> event : key.pollEvents()) {
                    switch (event.kind().name()) {
                        case "OVERFLOW":
                            System.out.println("We lost some events");
                            break;
                        case "ENTRY_MODIFY":
                            System.out.println("File: " + event.context() + " is changed!");
                            break;
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
