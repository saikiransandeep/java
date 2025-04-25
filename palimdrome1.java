class Main {
    public static void main(String[] args) {
        boolean palindrome=true;
        String name = "sas";
        int len = name.length();
        for(int i=0;i<len/2;i++){
            if(name.charAt(i)!=name.charAt(len-i-1)){
             palindrome=false;
        }
        }
        if(palindrome){
        System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}