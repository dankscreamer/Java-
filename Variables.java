class Variables{
    static int grade=5;//this is a global varaible this is available everywhere in the same class
    // and to use it in the main method we declare it as static because the static method can only work with static variables 
    public static void main(String[]args){
        int age; //Variable declaration
        age=27;//Varaible initialization.  
        int age1=27; // we declare and initalize the variable like this
    // any variable declared inside the method are called the local variables 
        System.out.print("Im "+age+" Years old I m in "+ grade);
        
    }

}
