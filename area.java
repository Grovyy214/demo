class raja
{
	int l,b;
	double ba,h,r;
	
	void area(int x,int y)
	{
		l = x;
		b = y;
		int area1 = l*b;
		System.out.println("Area of rectangle: "+area1);
	}
	void area(double x,double y)
	{
		ba = x;
		h = y;
		double area2 = 0.5*ba*h;
		System.out.println("Area of triangle: "+area2);
	}
	void area(double x)
	{
		r = x;
		double area3 = 3.14*r*r;
		System.out.println("Area of circle: "+area3);
	}
}

class area
{
	public static void main (String[] args)
	{
		raja raj = new raja();
		raj.area(10,2);
		raj.area(10.0,5.0);
		raj.area(5.0);
	}
}