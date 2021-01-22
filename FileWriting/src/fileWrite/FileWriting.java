package fileWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:/Data/Trainee4/workspace/StudentInfo.csv"));
			BufferedReader br1 = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentMarksInfo.csv"));

			BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Data/Trainee4/workspace/output.csv"));

			String s1, s2 = null;

			while ((s1 = br.readLine()) != null && (s2 = br1.readLine()) != null) {

				String[] Split = s2.split("\t");
				for (int i = 1; i < Split.length; i++) {
					System.out.println(Split[i]);

				}
				bw.write(s1 + "," + " \t " + s2 + "\n");
				System.out.println(s1 + "," + s2 + "\n");
			}
			br.close();
			br1.close();
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
