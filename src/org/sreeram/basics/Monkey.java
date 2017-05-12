package org.sreeram.basics;

public class Monkey implements Living{
	
	String name;
	Double height;
	

	@Override
	public void setName(String name) {
			this.name=name;		
	}

	@Override
	public void setHeight(Double height) {

		this.height  = height;
	}

	@Override
	public Double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

}
