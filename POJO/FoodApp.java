import java.util.Scanner;

class Food{
   private int f_id,f_price;
   private  String f_name,f_category;
    public int getF_id() {
        return f_id;
    }
    public void setF_id(int f_id) {
        this.f_id = f_id;
    }
    public int getF_price() {
        return f_price;
    }
    public void setF_price(int f_price) {
        this.f_price = f_price;
    }
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getF_category() {
        return f_category;
    }
    public void setF_category(String f_category) {
        this.f_category = f_category;
    }
   
}
class FoodFunction{
    Scanner sc=new Scanner(System.in);
    Food food[];
    String pur[];
    void set_food_details(Food f[])
    {
        food=f;
    }
    void set_purchase_items(String pur[])
    {
        this.pur=pur;
    }
    void show_food_details()
    {   
        for(int i=0;i<food.length;i++)
        {
           System.out.printf("%d\t%s\t%d\t%s\n",food[i].getF_id(),food[i].getF_name(),food[i].getF_price(),food[i].getF_category());

        }
    }
    void search_id(int id)
    {
        
        for(int i=0;i<food.length;i++)
        {
            if(id==food[i].getF_id())
            {
            System.out.printf("%d\t%s\t%d\t%s\n",food[i].getF_id(),food[i].getF_name(),food[i].getF_price(),food[i].getF_category());
            }
        } 
    }
    void show_food_between(){
        for(int i=0;i<food.length;i++)
        {
            if(food[i].getF_price()<=1000&&food[i].getF_price()>=500)
            {
            System.out.printf("%d\t%s\t%d\t%s\n",food[i].getF_id(),food[i].getF_name(),food[i].getF_price(),food[i].getF_category());
            }
        } 
    }
    void update_food_name(String f_name)
    {
        System.out.printf("Enter the new food name\n");
        String f_newName=sc.nextLine();
        System.out.printf("Enter the new food price\n");
        int f_newPrice=sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter the new food category\n");
        String f_newCategory=sc.nextLine();

        for(int i=0;i<food.length;i++)
        {
            if(f_name.equals(food[i].getF_name()))
            {
                food[i].setF_name(f_newName);
                food[i].setF_category(f_newCategory);
                food[i].setF_price(f_newPrice);
            }
        }
    }
    void delete_food_name(int s_id)
    {    int count=0;
        for(int i=0;i<food.length;i++)
        {
            if(food[i].getF_id()==s_id)
            {
                food[i]=food[i+1];
                count++;
            }
        }
        System.out.printf("After delete food by id\n");
         for(int i=0;i<food.length-count;i++)
         {
            System.out.printf("%d\t%s\t%d\t%s\n", food[i].getF_id(), food[i].getF_name(), food[i].getF_price(), food[i].getF_category());
         }
    } 

    void show_food_start_with_p_end_with_a()
   {
    for (int i = 0; i < food.length; i++) {
        if (food[i].getF_name().startsWith("P") && food[i].getF_name().endsWith("A")) {
            System.out.printf("%d\t%s\t%d\t%s\n", food[i].getF_id(), food[i].getF_name(), food[i].getF_price(), food[i].getF_category());
        }
    }
   }
   void show_purchase_items()
   {
       
        for(int j=0;j<pur.length;j++)
        {
            for(int i=0;i<food.length;i++)
            {
                if(pur[j].equals(food[i].getF_name()))
                {
                    System.out.printf("%d\t%s\t%d\t%s\n", food[i].getF_id(), food[i].getF_name(), food[i].getF_price(), food[i].getF_category());  
                }
            }

        }
   }
   void ShowBillWithGst()
   {
      int  totalbill=0;
     for(int j=0;j<pur.length;j++)
     {
        for(int i=0;i<food.length;i++)
        {
            if(pur[j].equals(food[i].getF_name()))
            {
                System.out.printf("%d\t%s\t%d\t%s\n\n", food[i].getF_id(), food[i].getF_name(), food[i].getF_price(), food[i].getF_category()); 
                totalbill+=food[i].getF_price(); 
            }
        }

     }  
     System.out.println("Bill with GST :"+(totalbill+(totalbill*0.18)));  
   }

    void showBillWithoutGst()
    {
        int  totalbill=0;
        for(int j=0;j<pur.length;j++)
        {
            for(int i=0;i<food.length;i++)
            {
                if(pur[j].equals(food[i].getF_name()))
                {
                    System.out.printf("%d\t%s\t%d\t%s\n\n", food[i].getF_id(), food[i].getF_name(), food[i].getF_price(), food[i].getF_category()); 
                    totalbill+=food[i].getF_price(); 
                }
            }

        }  
        System.out.println("Bill without GST :"+totalbill);  
    }
}

public class FoodApp{
 public static void main(String x[])
 {
     Scanner sc=new Scanner(System.in);
     FoodFunction ff=new FoodFunction();
     Food f[]=new Food[5];
     int ch;
     do{
        System.out.printf("1.Add Food details\n");
        System.out.printf("2.Display food details\n");
        System.out.printf("3.Display food details price range between 500 to 1000\n");
        System.out.printf("4.Search Food details using by id\n");
        System.out.printf("5.Update Food details using by name\n");
        System.out.printf("6.Delete Food details using by price\n");
        System.out.printf("7.Purchase Food items\n");
        System.out.printf("8.Display bill details\n");
        System.out.printf("9.Display Food Details start frist letter is'P' and ends with 'A'\n");
        System.out.printf("10.Exit code\n");
        System.out.printf("Enter your choice\n");
         ch=sc.nextInt();
         switch (ch) {
                case 1:{
                    for(int i=0;i<f.length;i++)
                    {
                        f[i]=new Food();
                       System.out.println("Enter Food id");
                       int f_id=sc.nextInt();
                       sc.nextLine();
                        System.out.println("Enter the Food name");
                        String f_name=sc.nextLine();
                        System.out.println("Enter Food price");
                        int f_price=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Food category");
                        String f_category=sc.nextLine();
            
                       f[i].setF_id(f_id);
                        f[i].setF_category(f_category);
                        f[i].setF_name(f_name);
                        f[i].setF_price(f_price);
                    }
                    ff.set_food_details(f);

                }
                break;
                case 2:
                {
                    ff.show_food_details();
                } 
                break;
                case 3:
                {
                   ff.show_food_between();
                }
                break;
                case 4:{
                    System.out.printf("Enter the id to find food\n");
                    int s_id=sc.nextInt();
                    ff.search_id(s_id);

                }
                break;
                case 5:
                {
                    sc.nextLine();
                    System.out.printf("Enter the Food name you want to update\n");
                    String s_name=sc.nextLine();

                    ff.update_food_name(s_name);
                } 
                break;
                case 6:
                {
                    System.out.printf("Enter the Food id you want to delete\n");
                    int s_id=sc.nextInt();
                    ff.delete_food_name(s_id);  
                }
                break;
                case 7:{
                    System.out.println("Food item list");
                    for(int i=0;i<f.length;i++)
                    {
                       System.out.printf("%d\t%s\t%d\t%s\n", f[i].getF_id(), f[i].getF_name(), f[i].getF_price(), f[i].getF_category());
                    }
                    System.out.println("Enter the size of food you want to purchase");
                    int p_size=sc.nextInt();
                    String pur[]=new String[p_size];
                    sc.nextLine();

                    for(int i=0;i<pur.length;i++){
                        
                         System.out.printf("Enter the food name");
                         pur[i]=sc.nextLine();
                    }
                    ff.set_purchase_items(pur);
                    ff.show_purchase_items();
                }
                break;
                case 8:
                {
                    System.out.println("1.Bill with GST");
                    System.out.println("2.Bill without GST");
                    System.out.println("Enter choice");
                    int c=sc.nextInt();
                    switch(c){
                        case 1:
                        {
                            ff.ShowBillWithGst();
                        }
                        break;
                        case 2:
                        {
                            ff.showBillWithoutGst();
                        }
                    }

                } 
                break;
                case 9:
                {
                    ff.show_food_start_with_p_end_with_a(); 
                }
                break;
                case 10:
                { ch=10;
                }
                break;
            default:
                System.out.printf("Wrong choice");
                break;
         }
        
     }while(ch>=1&&ch<=9);
     sc.close();
 }
    
}