package com.dxc.beans;

import org.springframework.stereotype.Component;

@Component
public class PortablePC implements Computer {

	@Override
	public void monitor() {
		// TODO Auto-generated method stub
		System.out.println("No physical monitor");
		
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("Some other powerfull processor");
		
	}

	@Override
	public void storage() {
		// TODO Auto-generated method stub
		System.out.println("Very high and speed storage device");
		
	}
	

}

