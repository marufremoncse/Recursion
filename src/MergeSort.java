
public class MergeSort {
	public static void mergeSort(int[] data, int start, int end) {
		if(start<end) {
			int mid = start + (end-start)/2;
			mergeSort(data, start, mid);
			mergeSort(data, mid+1, end);
			merge(data, start,mid,end);
		}
	}
	public static void merge(int[] data, int start, int mid, int end) {
		int i=start, j=mid+1;
		int[] temp = new int[end-start+1];
		int k = 0;
		while(i<=mid && j<=end) {
			if(data[i]<=data[j]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[j++];
			}
		}
		while(i<=mid) {
			temp[k++] = data[i++];
		}
		while(j<=end) {
			temp[k++] = data[j++];
		}
		for(int p=0;p<k;p++) {
			data[start++] = temp[p];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,1,3,5,23,9,799,59,97,91,5,4,5};
		mergeSort(data,0,data.length-1);
	}
}
