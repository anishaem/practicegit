package com.git.practice;

import com.git.practice.Area;

public class Area {
	 static double area;
	 static double areaC,areaS,areaR;
		public double findArea(float r)
		{
		return areaC=Math.PI*r*r;
		}
		
		public double findArea(float l,float b)
		{
			return areaR=l*b;
		}
		
		public double findArea(int side)
		{
			return areaS=side*side;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 Area ob=new Area();
	 areaC=ob.findArea(3);
	 areaR=ob.findArea(25.5f, 15);
	 areaS=ob.findArea(7);
	 System.out.println("Area of Circle:" + " " + areaC);
	 System.out.println("Area of Rectangle:" + " " + areaR);
	 System.out.println("Area of Square:" + " " + areaS);
		}

	}
