public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from Java Docker container!");
        System.out.println("Java version: " + System.getProperty("java.version"));
        
        // Демонстрация работы
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Container is running successfully! ✅");
    }
}