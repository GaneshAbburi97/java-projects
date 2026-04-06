
public class railway_system {
    boolean booked=false;
    String name;
    String source;
    String destination;
    float distance;
    double price;
    void book_ticket(String name,String source,String destination)
    {
        this.name=name;
        this.source=source;
        this.destination=destination;
         distance=200;
         price=distance*0.5;
        if(booked==false){
        System.out.println("Ticket Booked Successfully");
        System.out.println("Name:"+name);
        System.out.println("Source:"+source);
        System.out.println("Destination:"+destination);
         System.out.println("Distance between "+source+" and "+destination+" is 200 km");
           
          System.out.println("Price of the ticket is: "+(distance*0.5));
        }
        booked=true;
    }
    void cancel(String name){
        if(booked==true)
        {
            System.out.println("Ticket was cancelled  for "+name);
            System.out.println("Refund ammount:"+(price-50)); 
            booked=false;
        }
        else{
            System.out.println("No ticket was booked for "+name);
        }
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Source:"+source);
        System.out.println("Destination:"+destination);
        System.out.println("Distance:"+distance+" km");
        System.out.println("Booked Status:"+booked);
        System.out.println("-------------");
    }
    public static void main(String[] args) {
        railway_system r=new railway_system();
        r.book_ticket("Ganesh", "Pune", "Mumbai");
        r.display();
        r.cancel("Ganesh");
        r.display();
    }
}
