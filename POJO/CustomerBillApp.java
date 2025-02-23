import java.util.Scanner;

class Customer{
    private int cus_id,cus_contact;
    private String cus_name,cus_address;
    ProductDetails pro[];
    public ProductDetails[] getPro() {
        return pro;
    }
    public void setPro(ProductDetails[] pro) {
        this.pro = pro;
    }
    public int getCus_id() {
        return cus_id;
    }
    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }
    public int getCus_contact() {
        return cus_contact;
    }
    public void setCus_contact(int cus_contact) {
        this.cus_contact = cus_contact;
    }
    public String getCus_name() {
        return cus_name;
    }
    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }
    public String getCus_address() {
        return cus_address;
    }
    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }
    
}
class ProductDetails{
    private int product_id,product_qty;
    private float product_rate,product_subtotal,product_total;
    private String product_name;
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public int getProduct_qty() {
        return product_qty;
    }
    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }
    public float getProduct_rate() {
        return product_rate;
    }
    public void setProduct_rate(float product_rate) {
        this.product_rate = product_rate;
    }
    public float getProduct_subtotal() {
        return product_subtotal;
    }
    public void setProduct_subtotal(float product_subtotal) {
        this.product_subtotal = product_subtotal;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    } 
}
class CustomerBill{
    Customer cus[];
    void setCustomer(Customer c[])
    {
        cus=c;
    }
    void showCustomerBill()
    {
        
        for(int i=0;i<cus.length;i++)
        {   System.out.printf("-----------------------------------------Customer Bill----------------------------------\n");
            System.out.printf("Customer id: %d\tCustomer name: %s\tCustomer Address: %s\tCustomer contact: %d\n",
            cus[i].getCus_id(),cus[i].getCus_name(),cus[i].getCus_address(),cus[i].getCus_contact()); 
            System.out.printf("-----------------------------------------------------------------------------------------------\n");
            ProductDetails pro[]=cus[i].getPro();
            System.out.printf("Product id\tProduct_name\tProduct Qty\tProduct rate\t Subtotal:\n");
            System.out.printf("-----------------------------------------------------------------------------------------------\n");
            float total=0;
            for(int j=0;j<pro.length;j++)
            {
                System.out.printf("%d\t%s\t%d\t%f\t%f\n",pro[j]. getProduct_id(),pro[j].getProduct_name(),pro[j].getProduct_qty(),pro[j].getProduct_rate(),
                pro[j].getProduct_subtotal());
                 total=total+pro[j].getProduct_subtotal();
            }
            System.out.printf("Total bill:%f\n",total);
            System.out.printf("-----------------------------------------Customer Bill----------------------------------\n");

        }
    }

}
public class CustomerBillApp{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of customer data");
        int cs_size=sc.nextInt();
        Customer c[]=new Customer[cs_size];
        for(int i=0;i<c.length;i++)
        {
            c[i]=new Customer();
          System.out.printf("Enter the Customer id\n");
          int cs_id=sc.nextInt();
          sc.nextLine();
          System.out.printf("Enter the Customer name\n");
          String cs_name=sc.nextLine();
          System.out.printf("Enter the customer addresss\n");
          String cs_address=sc.nextLine();
          System.out.printf("Enter the Customer contact number\n");
          int cs_contact=sc.nextInt();

          c[i].setCus_id(cs_id);
          c[i].setCus_name(cs_name);
          c[i].setCus_address(cs_address);
          c[i].setCus_contact(cs_contact);
          
          System.out.printf("Enter the size of product data\n");
          int pr_size=sc.nextInt();

          ProductDetails pro[]=new ProductDetails[pr_size];
          float pr_total=0.0f;
          for(int j=0;j<pro.length;j++)
          {
            pro[j]=new ProductDetails();
            System.out.printf("Enter the product id\n");
            int pr_id=sc.nextInt();
            sc.nextLine();
            System.out.printf("Enter the product name\n");
            String pr_name=sc.nextLine();
            System.out.printf("Enter the quantity of product\n");
            int pr_quantity=sc.nextInt();
            System.out.printf("Enter the rate of product\n");
            float pr_rate=sc.nextFloat();
            float pr_subtotal= pr_quantity*pr_rate;
            pr_total=pr_total+pr_subtotal;
            pro[j].setProduct_id(pr_id);
            pro[j].setProduct_name(pr_name);
            pro[j].setProduct_qty(pr_quantity);
            pro[j].setProduct_rate(pr_rate);
            pro[j].setProduct_subtotal(pr_subtotal);
          }
          
          c[i].setPro(pro);
        }
         CustomerBill cs=new CustomerBill();
         cs.setCustomer(c);
         cs.showCustomerBill();
        
        sc.close();     
    }
}