import java.util.*;
class Book
{
String name=new String();
String author=new String();
int price,pages;
void intake()
{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the name of the book and author");
 name=s.next();
 author=s.next();
 System.out.println("enter the price of the book and the number of pages of the book");
 price=s.nextInt();
 pages=s.nextInt();
}
 Book()
{}
void display()
{
 
 System.out.println("The Price of the Book is :"+ price +"the no.of pages in the book is :"+pages);
}
 public String toString()
  { String name1=new String();
  name1 ="The name of the book is :"+name+""+"the name of the author is :"+author;
  return name1;
  }

}
class MainBook
{
  public static void main(String xx[])
  {
  int n;
   Scanner p=new Scanner(System.in);
   System.out.println("enter the number of objects you want to create :");
   n=p.nextInt();
   Book object[]=new Book[n];
   for (int i=0;i<n;i++)
   {
    object[i]=new Book();
    object[i].intake();
   }
   for(int i=0;i<n;i++)
   {
    System.out.println(object[i]);
    object[i].display();
   }
  
 }
}   
 
