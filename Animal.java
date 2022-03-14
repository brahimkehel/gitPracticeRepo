class Animal{

    public static String defaultGreeting(){
        return "Hello!";
    }

    public static String birdGreeting(){
        return "Tweet!";
    }

    public static void main(String[] args){
        String firstArgument=args[0];
        String output="";
        if(firstArgument.equalsIgnoreCase("bird"))
            output=birdGreeting();
        else
            output=defaultGreeting();

        System.out.println(output);
    }
}