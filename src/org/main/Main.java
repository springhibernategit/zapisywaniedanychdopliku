package org.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> nazwy = new ArrayList<>();
		nazwy.add("jeden");
		nazwy.add("dwa");
		nazwy.add("trzy");
		nazwy.add("cztery");
		nazwy.add("piêæ");
		nazwy.add("szeœæ");
		nazwy.add("siedem");

		File file = new File("dane.txt"); // tworzy obiekt pliku
		BufferedWriter bufferedWriter = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);  // umozliwia zapisywanie danych
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
			
			for(String nazwa : nazwy) {
				bufferedWriter.write(nazwa);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println("Problem z zapisem danych");
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				System.err.println("Problem z zamknieciem BufferedWriter");
			}
		}
	}

}
