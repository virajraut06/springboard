package com.xoriant.newpack;
import com.xoriant.itp.*;
import java.io.*;

public class Marklist {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FullName fullName[] = new FullName[5];
		Participant participant[] = new Participant[5];
		Marklist marklist[] = new Marklist[5];
		int rollNo;
		String firstName, middleName, lastName;
		float linuxMarks, sqlMarks, javaMarks, highestScore=0;
		String highestScorer = "";
		System.out.println("Enter records of 5 participants:");
		for(int i=0; i<5; i++) {
			System.out.println("Details of participant "+(i+1));
			System.out.println("Enter Roll Number:");
			rollNo = Integer.parseInt(br.readLine());
			System.out.println("Enter First name:");
			firstName = br.readLine();
			System.out.println("Enter Middle name:");
			middleName = br.readLine();
			System.out.println("Enter Last name:");
			lastName = br.readLine();
			System.out.println("Enter Linux marks (0-100):");
			linuxMarks = Float.parseFloat(br.readLine());
			System.out.println("Enter SQL marks (0-100):");
			sqlMarks = Float.parseFloat(br.readLine());
			System.out.println("Enter Java marks (0-100):");
			javaMarks = Float.parseFloat(br.readLine());
			fullName[i] = new FullName(firstName,middleName,lastName);
			marklist[i]= new Marklist();
			try {
				if(linuxMarks<0 || sqlMarks<0 || javaMarks<0)
					throw new LessThanZeroException("Marks cannot be less than zero!");
				else
					participant[i] = new Participant(rollNo,fullName[i],linuxMarks,sqlMarks,javaMarks);
			}
			catch(LessThanZeroException le) {
				le.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("----------MARKSHEET----------\nRoll no: "+participant[i].rollNo
					+"\nName: "+participant[i].name.fName+" "+participant[i].name.mName+" "+participant[i].name.lName
					+"\nUnix Marks:"+participant[i].unix_marks+"\nSQL Marks:"+participant[i].sql_marks
					+"\nJava Marks:"+participant[i].java_marks+"\nTotal Marks: "+participant[i].findTotal());
			if(participant[i].findTotal()>highestScore) {
				highestScorer = participant[i].name.fName+" "+participant[i].name.mName+" "+participant[i].name.lName;
				highestScore = participant[i].findTotal();
			}
		}
		System.out.println("Highest Scorer: "+highestScorer+"\nScore: "+highestScore);
	}
}