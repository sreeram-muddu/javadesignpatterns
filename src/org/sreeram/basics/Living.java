package org.sreeram.basics;

public interface Living {
	
	public  void setName(String name);
	
	public default String getName(){
		
		return "Muddu";
		
	}
	
	
	public void setHeight(Double height);
	
	public Double getHeight();

}
