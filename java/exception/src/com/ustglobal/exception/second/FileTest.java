package com.ustglobal.exception.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {
	
	void open() throws IOException, ClassNotFoundException, SQLException {  //throws used only in checked exception
		File f = new File("b.txt");
		f.createNewFile();  //checked exception this can be handled by using throws(2nd method tho handle)
		
		Class.forName("com.a");
	}

}


