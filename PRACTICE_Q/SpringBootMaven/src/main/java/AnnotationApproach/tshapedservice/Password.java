package AnnotationApproach.tshapedservice;

public class Password {
    String algo;
    public Password(String algo)
    {
        this.algo = algo;
        System.out.println("password Bean");
    }
    public String getAlgo(){
        return this.algo;
    }
    public void aboutAlgo()
    {
        System.out.println("Algo used is");
//        return "sdnjksd";
    }
}
