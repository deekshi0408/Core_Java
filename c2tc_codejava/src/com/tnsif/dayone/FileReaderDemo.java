package com.tnsif.dayone;

public class FileReaderDemo {
	public static void main(String[] args) {
		//
		URL resource = FileReaderDemo.class.getResource("MVIT_TNS.txt");
		
		if(resource == null) {
			System.err.println("File not found");
		}
		
		//converting URL int file object
		File f = new File(resource.getFile());
		
		FileReader fr = new FileReader(f);
		
	}

}
