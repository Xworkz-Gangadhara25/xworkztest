package com.xworkz.xworkzapp.test;

public class CityWardDTO {
	private String wardNumber;
   private String  wardName;
   private String corporatorName;
   private String population;
   private String area;
  
   public CityWardDTO(String wardNumber,String wardName,String corporatorName,String population,String area) {
	   this.wardNumber=wardNumber;
	   this.wardName=wardName;
	   this.corporatorName=corporatorName;
	   this.population=population;
	   this.area=area;
   }
  
public String getWardNumber() {
	return wardNumber;
}
public void setWardNumber(String wardNumber) {
	this.wardNumber = wardNumber;
}
public  String getWardName() {
	return wardName;
}
public void setWardName(String wardName) {
	this.wardName = wardName;
}
public String getCorporatorName() {
	return corporatorName;
}
public void setCorporatorName(String corporatorName) {
	this.corporatorName = corporatorName;
}
public String getPopulation() {
	return population;
}
public void setPopulation(String population) {
	this.population = population;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}


}
