class nrml{
    public static void main(String[] args){
        String name = "ababa";
        String name1 = "";
        for(int i=name.length()-1; i>=0; i--){
            name1 += name.charAt(i);
        }
        if(name.equals(name1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}