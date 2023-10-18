package org.example.thread.p01thread.stream.p03lambdaExpression;

public class ProgrammerFactory2 {


    //Factory
    public static Programmer getProgrammer(String type)
    {
        Programmer programmer;
        switch (type){
            case "java":
                programmer=new Programmer() {
                    @Override
                    public void code() {

                    }

                    @Override
                    public void test() {

                    }
                };
                break;
            case "php":
                programmer=new Programmer() {
                    @Override
                    public void code() {

                    }

                    @Override
                    public void test() {

                    }
                };
                break;

            default:
                programmer=new Programmer() {
                    @Override
                    public void code() {

                    }

                    @Override
                    public void test() {

                    }
                };
        }
        return programmer;
    }
}
