package com.ustglobal.objectclass;

public class USBPort {
	
	public static void connect(Object obj) {
		
		if(obj instanceof PenDrive) {
			PenDrive p = (PenDrive) obj;
			p.read();
			p.write();
		}
		else if(obj instanceof Mouse) {
			Mouse m = (Mouse) obj;
			m.click();
			m.scroll();
		}
		else {
			System.out.println("invalid object");
		}
	}
	
}
