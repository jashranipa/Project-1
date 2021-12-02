package package1;
import java.util.*;
import java.time.Duration;


// module , not required....

interface Frame  
{
	void display(int n);
}
interface Wheel
{
	void display(int n);
}

interface Engine 
{
	void display(int n);
}

interface Interior
{
	void display(int n);
}

interface Chasis 
{
	void display(int n);
}

interface Color 
{ 
	void display(int n);
}
class Frame1 implements Frame
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
		     System.out.println(end1+1-AssemblyLine.start1 + " Frame 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class Frame2 implements Frame
{
	public void display(int n)
	{
		
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
		     System.out.println(end1+2-AssemblyLine.start1 + " Frame 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
class Frame3 implements Frame
{
	public void display(int n)
	{
		
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
		     System.out.println(end1+3-AssemblyLine.start1 + " Frame 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
class Frame4 implements Frame
{
	public void display(int n)
	{
		
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(4000);
		     System.out.println(end1+4-AssemblyLine.start1 + " Frame 4 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
class Frame5 implements Frame
{
	public void display(int n)
	{
		
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(5000);
		    System.out.println(end1+5-AssemblyLine.start1 + " Frame 5 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
class Wheel1 implements Wheel
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
			System.out.println(end1+1-AssemblyLine.start1+ " Wheel 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class Wheel2 implements Wheel
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
			System.out.println(end1+2-AssemblyLine.start1 + " Wheel 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
class  Wheel3 implements Wheel
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
			System.out.println(end1+3-AssemblyLine.start1 + " Wheel 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine1 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
			System.out.println(end1+1-AssemblyLine.start1 + " Engine 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine2 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
			System.out.println(end1+2-AssemblyLine.start1 + " Engine 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine3 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
			System.out.println(end1+3-AssemblyLine.start1 + " Engine 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
class  Engine4 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(4000);
			System.out.println(end1+4-AssemblyLine.start1 + " Engine 4 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine5 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(5000);
			System.out.println(end1+5-AssemblyLine.start1 + " Engine 5 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine6 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(6000);
			System.out.println(end1+6-AssemblyLine.start1 + " Engine 6 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Engine7 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(7000);
			System.out.println(end1+7-AssemblyLine.start1 + " Engine 7 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
class  Engine8 implements Engine
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(8000);
			System.out.println(end1+8-AssemblyLine.start1 + " Engine 8 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Interior1 implements Interior
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
			System.out.println(end1+1-AssemblyLine.start1 + " Interior 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Interior2 implements Interior
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
			System.out.println(end1+2-AssemblyLine.start1+ " Interior 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Interior3 implements Interior
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
			System.out.println(end1+3-AssemblyLine.start1 + " Interior 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis1 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
			System.out.println(end1+1-AssemblyLine.start1 + " Chasis 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
// main tread not close
// t1 off and other run
class  Chasis2 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
			System.out.println(end1+2-AssemblyLine.start1 + " Chasis 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis3 implements Chasis
{
	
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
			System.out.println(end1+3-AssemblyLine.start1 + " Chasis 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis4 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(4000);
			System.out.println(end1+4-AssemblyLine.start1 + " Chasis 4 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis5 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(5000);
			System.out.println(end1+5-AssemblyLine.start1 + " Chasis 5 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis6 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(6000);
			System.out.println(end1+6-AssemblyLine.start1 + " Chasis 6 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Chasis7 implements Chasis
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(7000);
			System.out.println(end1+7-AssemblyLine.start1 + " Chasis 7 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color1 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(1000);
			System.out.println(end1+1-AssemblyLine.start1 + " Color 1 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color2 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(2000);
			System.out.println(end1+2-AssemblyLine.start1 + " Color 2 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color3 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(3000);
			System.out.println(end1+3-AssemblyLine.start1 + " Color 3 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color4 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(4000);
			System.out.println(end1+4-AssemblyLine.start1 + " Color 4 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color5 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(5000);
			System.out.println(end1+5-AssemblyLine.start1 + " Color 5 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color6 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(6000);
			System.out.println(end1+6-AssemblyLine.start1 + " Color 6 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color7 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(7000);
			System.out.println(end1+7-AssemblyLine.start1 + " Color 7 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color8 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(8000);
			System.out.println(end1+8-AssemblyLine.start1 + " Color 8 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class Color9 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(9000);
			System.out.println(end1+9-AssemblyLine.start1 + " Color 9 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class  Color10 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(10000);
			System.out.println(end1+10-AssemblyLine.start1 + " Color 10 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Color11 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(11000);
			System.out.println(end1+11-AssemblyLine.start1 + " Color 11 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class Color12 implements Color
{
	public void display(int n)
	{
		try {
			long end1 = System.nanoTime()/1000000000;
			Thread.currentThread().sleep(12000);
			System.out.println(end1+12-AssemblyLine.start1 + " Color 12 fitted at car on assembly Line "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}


interface CarInterface
{
	 
	void frame(int n,int m);
	void wheel(int n,int m);
	void engine(int n,int m);
	void interior(int n,int m);
	void chasis(int n,int m);
	void color(int n,int m);	
}


public class AssemblyLine extends Thread implements CarInterface {
	
	// rem. scope then initialize later.
	int n; // given id to all
	static long start1;
	AssemblyLine(int n)
	{
		this.n = n;
	}
	static int num; 
	static int arr1[][] = new int [1000000][6] ;
	public void frame(int n,int m)
	{
		if(m==1)
		{
		    Frame f=new Frame1();
		    f.display(n);
		    
		}
		else if(m==2)
		{
			Frame f=new Frame2();
			f.display(n);
		}
		else if(m==3)
		{
			Frame f=new Frame3();	
			f.display(n);
		}
		else if(m==4)
		{
			Frame f=new Frame4();	
			f.display(n);
		}
		else if(m==5)
		{
			Frame f=new Frame5();
			f.display(n);
		}
	}
			
		

	public void wheel(int n,int m)
	{
		if(m==1)
		{
		    Wheel w=new Wheel1();
		    w.display(n);
		    
		}
		else if(m==2)
		{
			Wheel w=new Wheel2();
			w.display(n);
		}
		else if(m==3)
		{
			Wheel w=new Wheel3();	
			w.display(n);
		}
	
		
		
	}
	public void engine(int n,int m)
	{
		if(m==1)
		{
		    Engine e=new Engine1();
		    e.display(n);
		    
		}
		else if(m==2)
		{
			Engine e=new Engine2();
			e.display(n);
		}
		else if(m==3)
		{
			Engine e=new Engine3();
			e.display(n);
		}
		else if(m==4)
		{
			Engine e=new Engine4();
			e.display(n);
		}
		else if(m==5)
		{
			Engine e=new Engine5();
			e.display(n);
		}
		else if(m==6)
		{
			Engine e=new Engine6();
			e.display(n);
		}
		else if(m==7)
		{
			Engine e=new Engine7();
			e.display(n);
		}
		else if(m==8)
		{
			Engine e=new Engine8();
			e.display(n);
		}
		
	}
	public void interior(int n,int m)
	{
		if(m==1)
		{
		    Interior i=new Interior1();
		    i.display(n);
		    
		}
		else if(m==2)
		{
			Interior i=new Interior2();
			i.display(n);
		}
		else if(m==3)
		{
			Interior i=new Interior3();	
			i.display(n);
		}
	
		
	}
	public void chasis(int n,int m)
	{
		if(m==1)
		{
			Chasis ch=new Chasis1();
			ch.display(n);
		    
		}
		else if(m==2)
		{
			Chasis ch=new Chasis2();
			ch.display(n);
		}
		else if(m==3)
		{
			Chasis ch=new Chasis3();
			ch.display(n);
		}
		else if(m==4)
		{
			Chasis ch=new Chasis4();
			ch.display(n);
		}
		else if(m==5)
		{
			Chasis ch=new Chasis5();
			ch.display(n);
		}
		else if(m==6)
		{
			Chasis ch=new Chasis6();
			ch.display(n);
		}
		else if(m==7)
		{
			Chasis ch=new Chasis7();
			ch.display(n);
		}
		
	}
	public void color(int n,int m)
	{
		if(m==1)
		{
		   Color c=new Color1();
		   c.display(n);
		    
		}
		else if(m==2)
		{
			 Color c=new Color2();
			 c.display(n);
		}
		else if(m==3)
		{
			 Color c=new Color3();
			 c.display(n);
		}
		else if(m==4)
		{
			 Color c=new Color4();
			 c.display(n);
		}
		else if(m==5)
		{
			 Color c=new Color5();
			 c.display(n);
		}
		else if(m==6)
		{
			 Color c=new Color6();
			 c.display(n);
		}
		else if(m==7)
		{
			 Color c=new Color7();
			 c.display(n);
		}
		else if(m==8)
		{
			 Color c=new Color8();
			 c.display(n);
		}
		else if(m==9)
		{
			 Color c=new Color9();
			 c.display(n);
		}
		else if(m==10)
		{
			 Color c=new Color10();
			 c.display(n);
		}
		else if(m==11)
		{
			 Color c=new Color11();
			 c.display(n);
		}
		else if(m==12)
		{
			 Color c=new Color12();
			 c.display(n);
		}
		
		
	} 
	
	public void run()
	{
//		int n = assembly line
		
		for(int i=0;i<6;i++)
		{
			if(i==0)
			{
				frame(n,arr1[n-1][i]);
			}
			if(i==1)
			{
				wheel(n,arr1[n-1][i]);
			}
			if(i==2)
			{
				engine(n,arr1[n-1][i]);
			}
			if(i==3)
			{
				interior(n,arr1[n-1][i]);
			}
			if(i==4)
			{
				chasis(n,arr1[n-1][i]);
			}
			if(i==5)
			{
				color(n,arr1[n-1][i]);
			}
		}
	}
	
	
	public static void main(String[]args)
	{
		Car_production window = new Car_production();
		window.frame.setVisible(true);			
	}
	
}
