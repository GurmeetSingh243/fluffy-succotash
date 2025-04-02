public class App {
  
    public static void main(String[] args) {
        System.out.println("hello world");
        int count = 0;
        int[] arr = new int[]{1,1,0,1,0,1,0,1};
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0 ){
                arr[count] = arr[i];
                count++;

            }
            while(count < arr.length){
                arr[count] = 0;
                count++;

            }
           

        }
      
    }
  }