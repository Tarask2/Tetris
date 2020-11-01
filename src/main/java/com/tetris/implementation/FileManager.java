package com.tetris.implementation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileManager {
	private File appConfigFile;
	private File userHighScore;
	
	public FileManager() {
		appConfigFile = new File("config.txt");	     
		userHighScore = new File("userhighscore.txt");

		 try {
		     
		      
		      if (appConfigFile.createNewFile()) {
		        System.out.println("File config.txt created: " + appConfigFile.getName());
		        try {
				      FileWriter myWriter = new FileWriter("config.txt");
				      String defaultString = "#1#Music#-14#true#2#GameHardLevel#Latwy#3#Settings#true#false#";
				      myWriter.write(defaultString);
				      myWriter.close();
				    } catch (IOException e) {
				      e.printStackTrace();
				    } 
		      } else if (userHighScore.createNewFile()) {
			        System.out.println("File userhighscore.txt created: " + userHighScore.getName());
			        try {
					      FileWriter myWriter = new FileWriter("userhighscore.txt");
					      String defaultString = "#1#empty#0#2#empty#0#3#empty#0#4#empty#0#5#empty#0#6#empty#0#7#empty#0#8#empty#0#9#empty#0#10#Empty#0#11#empty#0#12#empty#0#13#empty#0#14#empty#0#15#empty#0#16#empty#0#17#empty#0#18#empty#0#19#empty#0#20#empty#0#21#empty#0#22#empty#0#23#empty#0#24#empty#0#25#empty#0#26#empty#0#27#empty#0#28#empty#0#29#empty#0#30#empty#0#";
					      myWriter.write(defaultString);
					      myWriter.close();
					    } catch (IOException e) {
					      e.printStackTrace();
					    } 
			      } 
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	
	}
	

	
	public void writeAppConfigFileMethod(StringBuilder sb) {
		 try {
		      FileWriter myWriter = new FileWriter("config.txt");
		      myWriter.write(sb.toString());
		      myWriter.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    } 
	}
	
	
	public void writeUserHighScoreFileMethod(StringBuilder sb) {
		 try {
		      FileWriter myWriter = new FileWriter("userhighscore.txt");
		      myWriter.write(sb.toString());
		      myWriter.close();		     
		    } catch (IOException e) {
		      e.printStackTrace();
		    } 
	}
	
	
	public String loadAppConfigFileMethod() {
		
			 StringBuilder sb = new StringBuilder();
			    try (Stream<String> stream = Files.lines(Paths.get(System.getProperty("user.dir")+"/config.txt") , StandardCharsets.UTF_8)){
			        stream.forEach(s -> sb.append(s).append("\n"));
			    }
			    catch (IOException e) {
			        e.printStackTrace();
			    } return sb.toString();
	}
	
}
