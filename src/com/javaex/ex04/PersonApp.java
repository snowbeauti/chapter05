package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import com.javaex.ex04.Person;

public class PersonApp {

	public static void main(String[] args) throws IOException {


		ArrayList<Person> pList = new ArrayList<Person>();

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		Reader per = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(per);

		while (true) {
			String str = br.readLine();
			String[] pArray = str.split(",");
			
			for(int i=0; i<pList.size(); i++) {
			pList.get(i).setName(pArray[0]);
			pList.get(i).setHp(pArray[1]);
			pList.get(i).setCompany(pArray[2]);
			}
			if (str == null) {
				break;
			}
			pList.get(1).draw();
		}
		per.close();

	
		
		Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("황일영, 010-3333-5151, 비트");
		
		bw.close();
		
		
		

	}

}
