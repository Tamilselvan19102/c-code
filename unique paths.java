import java.util.*;
class sample
{
    public static void paths(int start,int end,int a,int b,String c,ArrayList<String>list)
    {
        if(start==a-1 && end==b-1)
        {
            
             list.add(c);
             return;
        }
        if(start>a-1 || end>b-1)
        {
            return;
        }
       
         paths(start+1,end,a,b,c+"H",list);
       
         paths(start,end+1,a,b,c+"V",list);
      
        
        
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        String c="";
        paths(0,0,a,b,"",list);
         for (String path : list) {
            System.out.println(path);
        }
    }
}
