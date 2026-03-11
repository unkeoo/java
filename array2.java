public class array2
{
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("please pass at least 2 numbers");
            System.exit(0);// 0= success, 1= failure
        }
            int sum=0;
            for(int i=0;i<args.length;i++){
                
                sum=sum+Integer.parseInt(args[i]);
            
            System.out.println("sum is "+ sum);
            }
            }
        }
    
    

