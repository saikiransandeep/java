class pp {
    public static void main(String[] args) {
        int n=8 , r=5 , c=20;
        // Square pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //Empty square pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        //Empty rectangle pattern
        System.out.println("");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1 || j==0 || j==c-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(j!=c-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        //Right to left slide pattern
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
        for(int k=0;k<n;k++){
             System.out.print("*");
        }
        System.out.println("");
      }
      System.out.println("");
        //Left to right slide pattern
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
        for(int k=0;k<n;k++){
             System.out.print("*");
        }
        System.out.println("");
    }
    System.out.println("");
    //Hollow rectangle pattern  
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            System.out.print("*");
        }
        System.out.println("");
}
    //Right half pyramid pattern
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");

    }
    System.out.println("");
    //Left half pyramid pattern 
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    }
}