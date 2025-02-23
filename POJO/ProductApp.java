import java.util.Scanner;

class Product
{   private int id, qty,rate,sub_total;
    private String product_name;
    void set_id(int i)
    {
         id=i;
    }
    void set_product_name(String name)
    {
         product_name=name;
    }
    void set_quantity(int q)
    {
         qty=q;
    }
    void set_rate(int r)
    {
        rate=r;
    }
    void set_sub_total(int st)
    {
        sub_total=st;
    }
    int get_id()
    {
        return id;
    }
    int get_quantity()
    {
        return qty;
    }
    int get_rate()
    {
        return rate;
    }
    String get_product_name()
    {
        return product_name;
    }
    int get_sub_total()
    {
        return sub_total;
    }
}
class BillCalulate{
    Product pro[];
    private int i,sum=0;
    void set_total_bill(Product p[])
    {
        pro=p;
    }
    void show_total_bill()
    {
        System.out.printf("----------------------------------------PRODUCT BILL-------------------------------------\n");
        System.out.printf("Product id\tProduct Name\tQuantity\tRate\tSub total\n");
        for(i=0;i<pro.length;i++)
        {
           System.out.printf("%d\t\t%s\t\t  %d\t         %d\t       %d\n",pro[i].get_id(),pro[i].get_product_name(),pro[i].get_quantity()
           ,pro[i].get_rate(),pro[i].get_sub_total());
        }
        for(i=0;i<pro.length;i++)
        {
            sum=sum+pro[i].get_sub_total();
        }
        System.out.printf("\nTotal bil order---->%d\n",sum);
      
        System.out.printf("----------------------------------------PRODUCT BILL-------------------------------------\n");
        

    }
}
public class ProductApp
{
    public static void main(String [] args)
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of data\n");
        int size=sc.nextInt();
        Product pro[]=new Product[size];
        int i,subtotal_bill;
        
        for(i=0;i<pro.length;i++)
        {
            pro[i]=new Product();
            System.out.printf("------------------------------Enter the Product details--------------------------------------\n");
            System.out.printf("Enter the product id\n");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.printf("Enter the product name\n");
            String p_name=sc.nextLine();
            System.out.printf("Enter the quantity of product\n");
            int qty=sc.nextInt();
            System.out.printf("Enter the rate of product\n");
            int rt=sc.nextInt();
            subtotal_bill=qty*rt;

            pro[i].set_id(id);
            pro[i].set_product_name(p_name);
            pro[i].set_quantity(qty);
            pro[i].set_rate(rt);
            pro[i].set_sub_total(subtotal_bill);
        }
          BillCalulate bill_cal=new BillCalulate();
          bill_cal.set_total_bill(pro);
          bill_cal.show_total_bill();


        sc.close();

    }
}