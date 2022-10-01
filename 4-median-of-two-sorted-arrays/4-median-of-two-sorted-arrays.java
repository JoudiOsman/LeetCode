class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1length = nums1.length;
        int nums2length = nums2.length;
        int totalLength = nums1length +nums2length;
        int iterateTo;
        int i =0;
        int j =0;
        double retval;
        boolean firstOut=false;
        boolean secondOut=false;
        int iterated =0;
        double nextNum=0;
        double currentNum =0;

        if(nums1length==0){
            firstOut=true;
        }
        if(nums2length==0){
            secondOut=true;
        }
        if(totalLength%2==0){
            iterateTo = totalLength/2; 
        }else{
            iterateTo = (totalLength/2)+1; 
        }
        while((i<nums1length ||j< nums2length)&& iterated< iterateTo){
            if(firstOut==true){
                currentNum = (double)nums2[j];
                j++; 
            }
            else if(secondOut==true){
                currentNum = (double)nums1[i];
                i++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    currentNum = (double)nums1[i];
                    i++;
                    if(i== nums1.length){
                        firstOut=true;       
                    }
                }else{
                    currentNum = (double)nums2[j];
                    j++;
                    if(j== nums2.length){
                        secondOut=true;       
                    } 
                }    
            }

            iterated++;
        }
        
        if(totalLength%2==0){
            if(firstOut==true){
                nextNum = (double)nums2[j];
            }
            else if(secondOut==true){
                nextNum = (double)nums1[i];
            }
            else{
                if(nums1[i]<nums2[j]){
                    nextNum = (double)nums1[i];
                }else{
                    nextNum = (double)nums2[j];
                }    
            }
            retval = (currentNum+nextNum)/2;
        }else{
            retval =currentNum;
        }
        System.out.println(currentNum+" "+ nextNum);
        
       return retval; 
    }
}