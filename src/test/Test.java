package test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Test {
	public static void main(String[] args) {
		WeatherWSSoap soap = new	WeatherWS().getWeatherWSSoap();
		ArrayOfString string = soap.getWeather("鹤壁", null);
		List<String> list = string.getString();
		System.out.println(list);
	}

}
