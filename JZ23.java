public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null)
            return true;
        else if(sequence.length == 0)
            return false;
        else if(sequence.length==1 || sequence.length==2)
            return true;
        
        int sign = -1;
        int root = sequence[sequence.length-1];
        for(int i=0; i<sequence.length; i++)
            if(sequence[i] > root){
                sign = i;
                break;
            }
        
         if(sign == -1)
            return true;

        int [] subLeftSequence = subLeftSequence(sequence, sign);
        int [] subRightSequence = subRightSequence(sequence, sign);

        if(subLeftSequence != null)
            for(int i=0; i<subLeftSequence.length; i++){
                if(subLeftSequence[i] > root)
                    return false;
            }

        if(subRightSequence != null)
            for(int i=0; i<subRightSequence.length; i++){
                if(subRightSequence[i] < root)
                    return false;
            }

        boolean is = VerifySquenceOfBST(subLeftSequence) && VerifySquenceOfBST(subRightSequence);
        return is;
    }
    
    public int[] subLeftSequence(int [] sequence, int sign){
        if(sign == 0)
            return null;
        
        int [] leftSequence = new int[sign];
        for(int i=0; i<sign; i++){
            leftSequence[i] = sequence[i];
        }
        
        return leftSequence;
    }
    
    public int[] subRightSequence(int [] sequence, int sign){
        int length = sequence.length - 1 - sign;
        if(length == 0)
            return null;
        
        int [] rightSequence = new int[length];
        for(int i=0; i<length; i++){
            rightSequence[i] = sequence[sign + i];
        }
        return rightSequence;
    }
}