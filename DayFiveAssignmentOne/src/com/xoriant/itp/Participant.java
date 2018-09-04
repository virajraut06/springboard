package com.xoriant.itp;

public class Participant extends FullName implements Calculate{
	public int rollNo;
	public FullName name;
	public float unix_marks, sql_marks, java_marks, total;
	public Participant(int rollNo, FullName name, float unix_marks, float sql_marks, float java_marks){
		super(name.fName, name.mName, name.lName);
		this.rollNo = rollNo;
		this.name = name;
		this.unix_marks = unix_marks;
		this.sql_marks = sql_marks;
		this.java_marks = java_marks;
	}
	@Override
	public float findTotal() {
		this.total = this.unix_marks + this.sql_marks + this.java_marks;
		return this.total;
	}
	
}
