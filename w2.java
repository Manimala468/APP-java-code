class Book{
  string title;
  string author;
  float price;

  Book(string title,string author,float price){
    this title=title;
    this author=author;
    this price=price;
  }
}
  void display(){
    system.out.println("title:" +title);
    system.out.println("author:" +author);
    system.out.println("price:" +price);
                       
  }
  public class main{
    public static void main(string[] args){
      book b1= new book("The Alchemist","Paulo Coelho","399.0");
      b1.display();
    }
  }

    
