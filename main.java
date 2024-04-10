public class main{
        public static void main(String[] args){
        System.out.println("Hello, World!");
        branchAnalysis first = new branchAnalysis(0.3);
        System.out.println(first.getOdds());
        first.printArray();
        System.out.println(first.singlePredictor());
        System.out.println(first.doublePredictor());
    }
}
