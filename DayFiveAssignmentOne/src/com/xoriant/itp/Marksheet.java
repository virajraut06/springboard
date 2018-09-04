package com.xoriant.itp;
//import java.io.*;

public class Marksheet {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FullName fullName = new FullName("John","Bob","Smith");
		Participant participant = new Participant(1, fullName, 80f, 76.8f, 92f);
		System.out.println("----------MARKSHEET----------\nRoll no: "+participant.rollNo
				+"\nName: "+participant.name.fName+" "+participant.name.mName+" "+participant.name.lName
				+"\nUnix Marks:"+participant.unix_marks+"\nSQL Marks:"+participant.sql_marks
				+"\nJava Marks:"+participant.java_marks+"\nTotal Marks: "+participant.findTotal());
	}
}