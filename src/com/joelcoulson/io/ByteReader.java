package com.joelcoulson.io;

import java.io.*;

public class ByteReader {

		public static void main(String[] args) {

			// we need a file descriptor
			File file = new File("/data/data/com.spartacusrex.spartacuside/files/system/bin/bbdir/date");
			
			try{
				// attempt to create a new reader
				FileInputStream fileInputStream = new FileInputStream(file);
				DataInputStream dataInputStream = new DataInputStream(fileInputStream);
				byte bytes[] = {};

				// get one char at a 
				while(dataInputStream.read(bytes) != -1) {
					// cast the int back to a char
					for(byte chunk : bytes) {
						System.out.println("Chunk: " + chunk);
					}
				}

				} catch (FileNotFoundException fnfe) {
				System.out.println("File not found: " + fnfe.getMessage());
				} catch (IOException ioe) {
				System.out.println("Another kind of exception occurred: " + ioe.getMessage());
				}

			}
	}
