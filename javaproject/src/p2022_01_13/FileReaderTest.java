﻿package p2022_01_13;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0; //입력을 받아들이는 변수 선언

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader("data.txt"); // 1,2바이트 둘다됨 read.txt읽기 가능

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
//			유니크도로 변환후 char형으로 변환하여 출력 -한글자씩 읽어서 출력
			}

			// stream을 닫음
			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null)
				try {
					file.close();
				} catch (Exception e) {
				}
		}
	}// main() end
}
