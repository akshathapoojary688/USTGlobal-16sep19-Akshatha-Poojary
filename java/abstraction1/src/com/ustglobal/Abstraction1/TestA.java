package com.ustglobal.Abstraction1;

public class TestA {
	
	public static void main(String[] args) {
		
		Browser b = new Browser();
		
		//Gmail g = new Gmail();
		//b.open(g);
		
		GoogleDrive gd = new GoogleDrive();
		b.open(gd);
		
		
		
		//Google g = new Gmail();
		//b.open(g);
		
		Google g = new Gmail();
		g.shareDocument();
		
	}

}



