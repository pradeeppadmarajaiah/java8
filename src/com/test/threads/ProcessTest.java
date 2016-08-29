package com.test.threads;

import java.io.IOException;

public class ProcessTest {
	public static void main(String[] args) throws IOException {
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("notepad.exe", "C:\\SUService.log");
		builder.start();

	}

}
