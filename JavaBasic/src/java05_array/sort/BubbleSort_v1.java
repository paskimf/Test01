package java05_array.sort;

public class BubbleSort_v1 {

    public static void main(String[] args) {

        // 버블 정렬
        int[] arr = { 3, 2, 5, 4, 1 };

        // 원본 출력
        System.out.println("=== 정렬 전 ===");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 버블 정렬 수행
        for (int i = 0; i < arr.length - 1; i++) {
        	
            for (int j = 0; j < arr.length - i - 1; j++) {
            	
                if (arr[j] > arr[j + 1]) {
                    // 두 요소를 서로 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 결과 출력
        System.out.println("=== 정렬 후 ===");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
    }
}
