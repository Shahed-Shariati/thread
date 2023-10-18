package org.example.thread.p01thread.stream.p03lambdaExpression;

public class ProgrammerFactory {
    //Factory
    public static Programmer getProgrammer(String type)
    {
        Programmer programmer;
        switch (type){
            case "java":
                programmer=new JavaProgrammer();
                break;
            case "php":
                programmer=new PhpProgrammer();
                break;

            default:
                programmer=new JavaProgrammer();
        }
        return programmer;
    }
}
