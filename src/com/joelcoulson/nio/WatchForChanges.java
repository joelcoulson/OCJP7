package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;

public class WatchForChanges {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\jcoulson\\Projects\\OCJP7\\");
        WatchService watchService = null;

        try {

            // we create a new watch service via the path object
            watchService = path.getFileSystem().newWatchService();

            // we register the watch service against the path, looking for modification events
            path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            // infinitely loop
            for (; ; ) {
                WatchKey key = null;
                try {
                    key = watchService.take();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }

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
