/**
 * 
 */
package TestArray;

/**
 * 
 */
public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[50];
		for (int i =0; i<array.length; i++ ) {
			array[i] = (int)(Math.random()*100) -50;			//получаем рандомное число в диапазоне от -50 до 50
		}
		array[25] =0; //Для проверки подсчёта нулей 
		
		System.out.println("Element array:");
		for (var el : array) {
			System.out.printf("[%d]", el);
			
		}
		System.out.println();
		System.out.printf("Amount negative Elements: %d\n", AmountNegativeElements(array));
		AmountPositiveElements(array);
		AmountZero(array);
		Average(array);

	}
	// количество отрицательных элементов
	static int  AmountNegativeElements(int[]array) {
		int counter=0;
		int sum=0;
		System.out.println ("Negative element:"); 
		for (int el : array) {
			if (el<0) {
				System.out.printf("[%d]", el);
				sum +=el;
				counter++;
			}	
		}
		System.out.println("\nSumma negative elements:"+sum);
		return counter;
	}
	
	//Количество положительных элементов
	static void  AmountPositiveElements(int[]array) {
		int counter=0;
		int sum=0;
		System.out.println ("Positive element:"); 
		for (int el : array) {
			if (el>0) {
				System.out.printf("[%d]", el);
				sum +=el;
				counter +=1;
			}
		} 
		System.out.printf("\nAmount positive elements: %d\n", counter);
		System.out.println("Summa positive elements:"+sum);
	}
	
	//количество нулей
	static void AmountZero(int[] array) {
		int counter=0;
		for (int el : array) if (el==0) counter +=1;
		System.out.println("Amount zero:" + counter);
	}
	
	//среднее значение по массиву
	static void Average(int[] array) {
		int sum=0;
		for (int el : array) sum +=el;
		System.out.printf("Average by array: %f\n", (double)sum/array.length);
	}
}
