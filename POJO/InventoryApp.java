import java.util.Scanner;

class Inventory{
            private int id,qty;
            private String name;
            private float price;
           public Inventory(int id,String name,int qty,float price)
            {
                this.id=id;
                this.name=name;
                this.qty=qty;
                this.price=price;
            }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getQty() {
            return qty;
        }
        public void setQty(int qty) {
            this.qty = qty;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public float getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }

}
class Purchase{
            private int id,qty;
            private String name;
            private float price;
        public Purchase(int id,String name,int qty,float price)
            {
                this.id=id;
                this.name=name;
                this.qty=qty;
                this.price=price;
            }
        public int getId() {
            return id;
        }
      
        public int getQty() {
            return qty;
        }
        
        public String getName() {
            return name;
        }
      
        public float getPrice() {
            return price;
        }
}
class SaleOrder{
    private int id,qty;
    private String name;
    private float price;
public SaleOrder(int id,String name,int qty,float price)
    {
        this.id=id;
        this.name=name;
        this.qty=qty;
        this.price=price;
    }
public int getId() {
    return id;
}

public int getQty() {
    return qty;
}

public String getName() {
    return name;
}

public float getPrice() {
    return price;
}
}
class InventoryFunction{
    Scanner sc=new Scanner(System.in);
    SaleOrder sale[];
    void create(Inventory in[])
    {
       
        for(int i=0;i<in.length;i++)
        {
           
            System.out.println("Enter the id of product");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of product");
            String name=sc.nextLine();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            System.out.println("Enter the price of product");
            float price=sc.nextFloat();

            in[i]=new Inventory(id,name,qty,price);

        }
    }
    void display(Inventory in[])
    {   System.out.printf("Id\tName\tQuantity\tPrice\n");
        for(int i=0;i<in.length;i++)
        {
            System.out.println(in[i].getId()+"\t"+in[i].getName()+"\t"+in[i].getQty()+"\t"+in[i].getPrice());
        }  
    }
    void purchase(Inventory in[])
    {
        System.out.printf("Enter size of purchase order\n");
        int size=sc.nextInt();
        Purchase pur[]=new Purchase[size];
        for(int i=0;i<pur.length;i++)
        {
            System.out.println("Enter the id of product");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of product");
            String name=sc.nextLine();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            System.out.println("Enter the price of product");
            float price=sc.nextFloat();

            pur[i]=new Purchase(id,name,qty,price);
        }
        for(int i=0;i<in.length;i++)
        {
            for(int j=0;j<pur.length;j++)
            {
                if(pur[j].getId()==in[i].getId())
                {
                    in[i].setQty(pur[j].getQty()+in[i].getQty());
                }
            }
            
        }
    }
    void sale(Inventory in[])
    {   
        System.out.printf("Id\tName\tQuantity\tSale Price\n");
        for(int i=0;i<in.length;i++)
        {
            System.out.println(in[i].getId()+"\t"+in[i].getName()+"\t"+in[i].getQty()+"\t"+(in[i].getPrice()+in[i].getPrice()*0.20f));
        }  
        System.out.printf("Enter size of Sale order\n");
        int size=sc.nextInt();
        sale=new SaleOrder[size];
        for(int i=0;i<sale.length;i++)
        {
            System.out.println("Enter the id of product");
            int id=sc.nextInt();
            // sc.nextLine();
            // System.out.println("Enter the name of product");
            // String name=sc.nextLine();
            // System.out.println("Enter the quantity");
            // int qty=sc.nextInt();
            // System.out.println("Enter the price of product");
            // float price=sc.nextFloat();

            sale[i]=new SaleOrder();
            for(i=0;i<)
        }
        for(int i=0;i<in.length;i++)
        {
            for(int j=0;j<sale.length;j++)
            {
                if(sale[j].getId()==in[i].getId())
                {
                    in[i].setQty(in[i].getQty()-sale[i].getQty());
                    
                }
            }
            
        }
    }
    void CalculateBill()
    {   float bill=0;
        System.out.printf("Id\tName\tQuantity\tSale Price\n");
        for(int i=0;i<sale.length;i++)
        {
            System.out.println(sale[i].getId()+"\t"+sale[i].getName()+"\t"+sale[i].getQty()+"\t"+(sale[i].getPrice()+sale[i].getPrice()*0.20f));
            bill=bill+(sale[i].getQty()*sale[i].getPrice()+sale[i].getPrice()*0.20f);

        }  
        System.out.printf("Total bill:%f",bill);
    }

}
public class InventoryApp{
    public static void main (String x[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.printf("Enter the size of inventory\n");
         int size=sc.nextInt();
        Inventory in[]=new Inventory[size];
        InventoryFunction fun= new InventoryFunction();
        int ch;
        do{
           System.out.printf("1.Create \n2.Inventory\n3.Purchase Order\n4.Sale Order\n5.Calculate Bill\n6.Exit\n");
           System.out.printf("Enter the choice\n");
           ch=sc.nextInt();
           switch(ch)
           {
            case 1:
            {
               fun.create(in);
             
            }
            break;
            case 2:
            {
                fun.display(in);
            }
            break;
            case 3:
            {
               fun.purchase(in);
            }
            break;
            case 4:
            {
               fun.sale(in);
            }
            break;
            case 5:
            {
              fun.CalculateBill();
            }
            break;
            case 6:
            {
              ch=6;
            }
            break;
            default :
            {

            }  
            break;
           }
        }while(ch>=1&&ch<6);
        sc.close();
    }
}
