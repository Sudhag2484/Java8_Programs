package in.sudha.streamapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileInputDemo {

	public static void main(String[] args) throws Exception {
/*
		File file = new File("info.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String readLine = bufferedReader.readLine();
		while(readLine!=null) {
			System.out.println(readLine);
			String line = bufferedReader.readLine();
		}
		bufferedReader.close();
		*/
		
		String file="info.txt";
		Stream<String> stream = Files.lines(Paths.get(file));
		stream.forEach(line->System.out.println(line));
	}

}
