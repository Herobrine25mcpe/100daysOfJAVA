

class GfG
{
	public static int palinArray(int[] a, int n)
	
           {
             for(int i = 0; i<a.length; i++){
                 
                 int x = a[i];
                 int b=x;
                 int temp = 0;
                 
                 while(b!=0){
                      
                      
                      temp = temp*10 + (b%10);
                       b = b/10;
                     
                 }
                 

         
                 
                 if(temp!=x){
                     
                         return 0;
                     }

             }
             
             return 1;
           }
}
