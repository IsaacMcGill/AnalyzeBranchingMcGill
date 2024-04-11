public class main{
        public static void main(String[] args){
        branchAnalysis first = new branchAnalysis(0.1);
        System.out.println(first.getOdds());
        //first.printArray();
        System.out.println(first.singlePredictor());
        System.out.println(first.doublePredictor());
        branchAnalysis second = new branchAnalysis(0.3);
        System.out.println(second.getOdds());
        System.out.println(second.singlePredictor());
        System.out.println(second.doublePredictor());
        branchAnalysis third = new branchAnalysis(0.5);
        System.out.println(third.getOdds());
        System.out.println(third.singlePredictor());
        System.out.println(third.doublePredictor());
        branchAnalysis fourth = new branchAnalysis(0.7);
        System.out.println(fourth.getOdds());
        System.out.println(fourth.singlePredictor());
        System.out.println(fourth.doublePredictor()); 
        branchAnalysis fifth = new branchAnalysis(0.9);
        System.out.println(fifth.getOdds());
        System.out.println(fifth.singlePredictor());
        System.out.println(fifth.doublePredictor());      
    }
}
