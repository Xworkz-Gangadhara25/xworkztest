package com.xworkz.xworkzapp.test;


import com.xworkz.xworkzapp.test.CityWardDTO;
public class CityWard {
	public CityWardDTO[] cityWardDtos;
	public int index;
	
	
	public CityWard(int size) {
		CityWardDTO[] cityWardDtos=new CityWardDTO[3];
	}
	public void addAllDetail(CityWardDTO cityWard) {
		if(cityWardDtos !=null)
		{
		System.out.println("Adding cityward details");
		cityWardDtos[index++]=cityWard;
		System.out.println("Added all cityward details");
	}
	}
/*
public void showAllDetail() {
	for (CityWardDTO cityWard: cityWardDtos) {
		
		if(wardName != null && wardNumber !=null population !=null) {
			System.out.println(cityWard.getWardNumber()
					+" "+ cityWard.getWardName()+" "+cityWard.getPopulation());
		}else {
			System.out.println("all details are added");
		}
	}
}
/*public void searchByName() {
	for (int i = 0; i < cityWardDtos.length; i++) {
		if(cityWardDtos.getName().equals(wardName));
		{
			System.out.println(cityWardDtos.getWardname()+" "+);
		}
		}
	}*/ 
	
}