class Solution {
    public void rotate(int[] nums, int k) {
        //System.out.println("enter range ");
//int r = sc.nextInt();
   int n = nums .length;
   k%=n;
   int ans[] = new int [n];
//    for (int i=n-k;i<=n-1;i++){
//        ans[i-(n-k)]=nums[i];
//    }

//    for (int i=0;i<n-k;i++){
//        ans[i+k] = nums[i];
//    }
//    for (int i=0;i<n;i++){
//        nums[i]  = ans [i];
//    }

   int y= n-k;
   int j =0;
   int p =0;
   for (int i=y;i<n;i++){
       ans[p] = nums[i];
        //System.out.println(nums[i]);
        j++;
        p++;
   }

   for (int i=0;i<y;i++){
       ans[j] = nums[i];
       j++;
   }
for (int i=0;i<n;i++){
       nums[i]  = ans [i];
       //System.out.println(ans[i]);
   }


   



    }
}