//import java.util.*;
class AltMerge{
   private char word1[];
   private char word2[];
   private char word[];
   AltMerge(char word1[],char word2[])
   {
      this.word1=word1;
	  this.word2=word2;
	  this.word=new char[word1.length+word2.length];
   }
  char[] getMergeArray()
   {    int j=0,k=0;
	   for(int i=0;i<(word1.length+word2.length);i++)
	   {
		   if(i%2==0 && j<word1.length)
		   {
			   word[i]=word1[j];
			   j++;
		   }
		   else if(k<word2.length){
			   word[i]=word2[k];
			   k++;
		   }
	   }
	   return word;
	   
   }
   
}
public class AltMergeApp{
 public static void main(String x[])
  { 
     char word1[]={'a','b','c'};
	 char word2[]={'p','q','r'};
	 AltMerge a=new AltMerge(word1,word2);
	  char array[];
	  array=a.getMergeArray();
	   for(int i=0;i<array.length;i++)
	   {
	 	  System.out.printf("%c",array[i]);
	  }
  }
}