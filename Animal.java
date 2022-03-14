class Animal{

    public static String defaultGreeting(){
        return "Hello!";
    }

    public static String birdGreeting(){
        return "Tweet!";
    }
    public static String catGreeting(){
        return "Meow!";
    }

    public static void main(String[] args){
        String firstArgument=args[0];
        String output="";
        if(firstArgument.equalsIgnoreCase("bird"))
            output=birdGreeting();
        else if(firstArgument.equalsIgnoreCase("cat"))
            output=catGreeting();
        else
            output=defaultGreeting();

        System.out.println(output);
    }
}