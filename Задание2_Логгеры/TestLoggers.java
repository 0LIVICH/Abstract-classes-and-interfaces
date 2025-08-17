public class TestLoggers {
    public static void main(String[] args) {
        System.out.println("=== Тестирование системы логгеров ===\n");
        
        // Тестируем логгеры
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();
        
        System.out.println("--- SimpleLogger ---");
        simpleLogger.log("Первое сообщение");
        simpleLogger.log("Второе сообщение");
        simpleLogger.log("Третье сообщение");
        
        System.out.println("\n--- SmartLogger ---");
        smartLogger.log("Первое сообщение");
        smartLogger.log("Сообщение с ошибкой error");
        smartLogger.log("Третье сообщение");
        smartLogger.log("Еще одно сообщение");
        smartLogger.log("Критическая ошибка ERROR в системе");
    }
} 