public class RelativeSortArray{
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
   	 int[] res=new int[arr1.length];
   	 int index=0;
   	 int[] times=new int [1001];  //因为数范围在0-1000
   	 for(int num:arr1)times[num]++;  //遍历arr1
   		 for(int num:arr2){          //遍历arr2
       	 while(times[num]>0){
            res[index++]=num;
            times[num]--;
      	  }
    	}
    	for(int i=0;i<times.length;i++){
        while(times[i]>0){
            res[index++]=i;
            times[i]--;
        }
   	  }
      return res;
  }
}
