import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int callCounter = 0;
    
    @Override
    public void log(String msg) {
        callCounter++;
        LocalDateTime now = LocalDateTime.now();
        
        String level = "INFO";
        if (msg.toLowerCase().contains("error")) {
            level = "ERROR";
        }
        
        System.out.println(level + "#" + callCounter + " [" + now + "] " + msg);
    }
} 