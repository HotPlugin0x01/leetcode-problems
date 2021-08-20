class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++){
            image[row] = flip(image[row]);
            
            for(int col = 0; col < image[row].length; col++){
                    image[row][col]^=1;
            }
        }
        return image;
    }
    
    public int[] flip(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}