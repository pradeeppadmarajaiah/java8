package com.bitiknow.methodreference;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {

	public static void main(String[] args) {
		File[] unhiddenFiles = new File("C:\\Projects\\WCS_Curricullum\\Intro\\").listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return !(pathname.isHidden());

			}
		});

		System.out.println("Before java 8 : " + unhiddenFiles.length);

		unhiddenFiles = new File("C:\\Projects\\WCS_Curricullum\\Intro\\").listFiles((pathname) -> {
			if (pathname.isHidden()) {
				return false;
			} else {
				return true;
			}
		});

		unhiddenFiles = new File("C:\\Projects\\WCS_Curricullum\\Intro\\").listFiles((pathname) -> {
			return !(pathname.isHidden());
		});

		unhiddenFiles = new File("C:\\Projects\\WCS_Curricullum\\Intro\\")
				.listFiles((pathname) -> !(pathname.isHidden()));

		System.out.println("After java 8 : " + unhiddenFiles.length);

		File[] hiddenFiles = new File("C:\\Projects\\WCS_Curricullum\\Intro\\").listFiles(File::isHidden);

		System.out.println("After java 8 : " + hiddenFiles.length);
	}

}
