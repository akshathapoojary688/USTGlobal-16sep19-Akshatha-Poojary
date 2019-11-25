package com.ustglobal.phonesimulator.util;

import com.ustglobal.phonesimulator.dao.PhoneDao;
import com.ustglobal.phonesimulator.dao.PhoneDaoImplementation;

public class PhoneFactory {
	public PhoneFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static PhoneDao getPhoneDao() {
		return new PhoneDaoImplementation();
	}
}
