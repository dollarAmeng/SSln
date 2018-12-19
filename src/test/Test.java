package test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Test {
	public static void main(String[] args) {
		MobileCodeWS ws = new MobileCodeWS();
		MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
		String string = soap.getMobileCodeInfo("13938005014", null);
		System.out.println(string);
	}
}
