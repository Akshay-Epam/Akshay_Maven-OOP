import java.util.Arrays;
import java.util.Scanner;

abstract class Sweets
{
String name;
int weight;
double cost;

}

class Chocolate extends Sweets implements Comparable<Chocolate> 
{
public Chocolate(String name,int weight,double cost){
	this.name=name;
	this.weight=weight;
	this.cost=cost;
}
public String toString() {
	return"{" + "name=" + name + '\''+", weight=" + weight +'}';
}
public String getName() {
	return name;
}
@Override
public int compareTo(Chocolate o) {
	// TODO Auto-generated method stub
	if(this.weight!=o.getweight()) {
		return this.weight-o.getweight();
	}
	return this.name.compareTo(o.getName());
}
public int getweight() {
	return weight;
}

}
class Cake extends Sweets
{
	public Cake(String name,int weight,double cost){
		this.name=name;
		this.weight=weight;
		this.cost=cost;
}
}
public class NewYearGift
{
static int getTotalWeight(Chocolate[] ch,Cake[] c)
	{
		int temp=0;
		for(int i=0;i<3;i++)
		{
			temp=ch[i].weight+temp+c[i].weight;
		}
		return temp;
	}
static void search(int l,int h,Chocolate[] ch)
{
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i].getweight()>1&&ch[i].getweight()<=h)
		{
			System.out.println(ch[i].toString());
		}
	}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter lower limit");
	int l=sc.nextInt();
	System.out.println("Enter higher limit" );
	int u=sc.nextInt();
Chocolate[] ch=
{ new Chocolate("Snickers",20,9.99),
 new Chocolate("M&M",18,5.99),
 new Chocolate("Toblerone",50,14.99),
};
Cake[] c=
{
		new Cake("Chocolate Truffle",500,15),
		new Cake("Red Velvet",1000,30.25),
		new Cake("Pineapple Mania",500,1999),
};
int t;
t=getTotalWeight(ch,c);
System.out.println("Total weight of sweets is"+t);
Arrays.sort(ch);
System.out.println("Sorted Gift is");
System.out.println(Arrays.toString(ch));
System.out.println("Final Gift according to given range is:");
search(l,u,ch);


/*ch1=new Chocolate();
ch2=new Chocolate();
ch3=new Chocolate();
ch1.description("Snickers",20,9.99);
ch2.description("M&M",18,5.99);
ch3.description("Toblerone",50,14.99);
c1=new Cake();
c2=new Cake();
c3=new Cake();
c1.description("Chocolate Truffle",500,15);
c2.description("Red Velvet",1000,30.25);
c3.description("Pineapple Mania",500,19.99);
*/}
}
