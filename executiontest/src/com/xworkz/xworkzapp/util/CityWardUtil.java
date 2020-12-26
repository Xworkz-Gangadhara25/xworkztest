package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.test.CityWard;
import com.xworkz.xworkzapp.test.CityWardDTO;

public class CityWardUtil {
public static void main(String[] args) {
	CityWardDTO dto1=new CityWardDTO("nummber1","name1","corporator1","population1","area1");
	CityWardDTO dto2=new CityWardDTO("nummber2","name2","corporator2","population2","area2");
	CityWardDTO dto3=new CityWardDTO("nummber3","name3","corporator3","population3","area3");
CityWard cityward=new CityWard(3);
cityward.addAllDetail(dto1);
cityward.addAllDetail(dto2);
cityward.addAllDetail(dto3);
}
}
