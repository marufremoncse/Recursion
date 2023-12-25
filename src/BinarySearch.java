
public class BinarySearch {
	public static int binarySearch(int[] data, int start, int end, int target) {
		if(start<=end) {
			int mid = start + (end-start)/2;
			if(data[mid]==target) {
				return mid;
			}
			else if(data[mid]>target) {
				return binarySearch(data, 0, mid-1, target);
			} else {
				return binarySearch(data, mid+1, end, target);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ara = {53,57,67,89,99,123,128,135,159,244,586};
		System.out.println(binarySearch(ara, 0, ara.length-1, 586));
	}

}
