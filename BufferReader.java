package com.Tnsif.UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = bf.readLine();
		System.out.println("Welcome to Eclipse "+ name);
	}

}
