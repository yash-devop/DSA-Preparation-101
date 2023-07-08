public class prints {
    public static void main(String[] args) {
        // System.out.println(printnum1(5));
        printnum3(5);
    }    
    static int printnum1(int n){ 
        //Q1. print n to 1  => 10 9 8 7 6 5 ... 1
        if(n == 1){              
            return n;            
        }                        
        System.out.println(n);   
        return printnum1(n - 1);  
    }                            
    static void printnum2(int n){
        //Q2. print 1 to n  => 1 2 3...10
        if(n == 0){              
            return;            
        }                        
        printnum2(n - 1); 
        System.out.println(n);   
    }
    static void printnum3(int n){
        // 5 4 3 2 1 1 2 3 4 5
        if(n == 0){              
            return;            
        }                        
        System.out.println(n);   
        printnum3(n - 1); 
        System.out.println(n);   
    }

}
