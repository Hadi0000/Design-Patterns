package FileConvertion;
import java.io.*;
import java.util.Scanner;

public class ReadFile {
		
		String filename = "inputFile.txt";
		String line;
		Transform catchIt;
		MillFactory factory = new MillFactory();
		String output;
		
		public void getFileContent() throws IOException {
			System.out.println("CSV / TSV / XML");
			Scanner sc = new Scanner(System.in);
			String option = sc.nextLine();
			System.out.println("give a filename.");
			String outputFile = sc.nextLine();
			
			try {
					FileReader  f = new FileReader(filename);
					BufferedReader bff = new BufferedReader(f);
					catchIt = factory.getObject(option);
					FileWriter f2 = new FileWriter(outputFile);
					BufferedWriter bff2 = new BufferedWriter(f2);
					
					while((line=bff.readLine()) != null) {
						output = catchIt.transformToAnotherFile(line);
						System.out.println("Hello");
						bff2.write(output);	
					}
					bff.close();
					bff2.close();
				
			}catch(FileNotFoundException e) {
				System.out.println("try ");
			}	
		}
}
