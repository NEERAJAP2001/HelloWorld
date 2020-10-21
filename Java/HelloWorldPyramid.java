public class HelloWorldPyramid {
    public static void main(String[] args) {
        char[] arr = {'H','E','L','L','O',' ','W','O','R','L','D'};
        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
