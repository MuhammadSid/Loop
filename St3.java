class St3{
public static void main(String[]args)
{
	//i = row print 
for(int i=1; i<=4;i++)
{
	//j= coloumn print 
for(int j=1; j<=i;j++)
{
	//print star in coloumn
System.out.print("*");
}
//jump to the next line
	System.out.println();
		}
		//reverse pattern start here
		for(int i= 1; i<=4; i++)
{
for(int j=3; j>=i; j--)
{
System.out.print("*");
}
System.out.println();
}}}
