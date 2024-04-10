import java.util.Random;
public class branchAnalysis{
    private double takenOdds;
    private int[] resultArray;
    public branchAnalysis(double odds){
        takenOdds=odds;
        resultArray= new int[12];
        fillArray();
    }
    public double getOdds(){
        return takenOdds;
    }
    public void fillArray(){
        Random rand = new Random();
        int curr;
        for(int i =0; i<resultArray.length; i++){
            curr=rand.nextInt(10);
            if(curr*0.1<takenOdds){
                resultArray[i]=1;
            } else{
                resultArray[i]=0;
            }
        }
    }
    public void printArray(){
        for(int i=0; i<resultArray.length; i++){
            System.out.print(resultArray[i]);
        }
        System.out.println();
    }
    public int singlePredictor(){
        int correct=0;
        int prediction=1;
        for(int i=0;i<resultArray.length;i++){
            if(prediction==resultArray[i]){
                correct++;
            } else{
                if (prediction==1){
                    prediction=0;
                } else{
                    prediction=1;
                }
            }
        }
        return correct;
    }
    public int doublePredictor(){
        int correct=0;
        int prediction=1;
        int strength = 1;
        for(int i=0;i<resultArray.length;i++){
            if(prediction==resultArray[i]){
                correct++;
                if(strength==0){
                    strength=1;
                }
            } else{
                if(strength==1){
                    strength=0;
                } else{
                    strength=1;
                    if (prediction==0){
                        prediction=1;
                    } else{
                        prediction=0;
                    }
                }
            }
        }
        return correct;       
    }
}