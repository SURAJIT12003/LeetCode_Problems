class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int count =0;
        int index =1;
        int R = red;
        int B = blue;
        while(true){
            if(index%2==0){
                if(index>red){
                    break;
                }
                red = red - index;
            }
            else{
                if(index>blue){
                    break;
                }
                blue = blue-index;
            }
            
            count++;
            index++;
            //System.out.println(red+" "+blue+" "+index);
           
        }

        int c1 =0;
        index =1;
        while(true){
            if(index%2!=0){
                if(index>R){
                    break;
                }
                R = R - index;
            }
            else{
                if(index>B){
                    break;
                }
                B = B-index;
            }
            c1++;
            index++;
            
            
        }

        return Math.max(c1,count);


    }
}