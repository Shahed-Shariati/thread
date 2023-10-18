package org.example.thread.p01thread.stream.p03lambdaExpression;

public class ProgrammerFactory3 {


    //Factory
    public static Programmer getProgrammer(String type)
    {
        Programmer programmer;
        switch (type){
            case "java":
                programmer=() ->{
                    System.out.println("java");
                };
                break;
            case "php":
                programmer=()-> {};
                break;

            default:
                programmer=() ->{};
        }
        return programmer;
    }
}
