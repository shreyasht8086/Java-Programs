
public class NullPointerExceptionApp{
    public static void main(String x[])
    {
        String str=null;
        try{
            if(str.equals("abc"))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch(NullPointerException ex){
          System.out.println("Error is :"+ex);                                                                
        }
        System.out.println("ABCSD");
        System.out.println("dscnliohdc");
        
    }
    
}
