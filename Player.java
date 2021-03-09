import java.util.*;

class Player
{
int id,no_matches_played;
int scores[] = new int[10];
float avg;
String name;
Scanner sc=new Scanner(System.in);

Player()
{
no_matches_played=0;
}

void getdata()
{
System.out.println("Enter player id and name");
id=sc.nextInt();
name=sc.next();
System.out.println("Enter number of matches played");
no_matches_played=sc.nextInt();
System.out.println("Enter Scores");
for(int i=0;i<no_matches_played;i++)
{
scores[i]=sc.nextInt();
}
}

float getaverage()
{
int sum=0;

for(int i=0;i<no_matches_played;i++)
{
sum=sum+scores[i];

}
avg=sum/no_matches_played;
return avg;
}
void display()
{
System.out.println("NAME:"+name);
System.out.println("ID:"+id);
System.out.println("No. of matches played:"+no_matches_played);
System.out.println("AVERAGE:"+avg);
}
public static void main(String args[])
{
Player ob1= new Player();
Player ob2=new Player();
ob1.getdata();
float avg1=ob1.getaverage();
ob2.getdata();
float avg2=ob2.getaverage();
if(avg1>avg2)
ob1.display();
else
ob2.display();
}
}

