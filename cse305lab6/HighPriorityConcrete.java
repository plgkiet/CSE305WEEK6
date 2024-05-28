import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expire;

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contract you immediately !");
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now();        
    }

    @Override
    public void setPriority() {
        this.priority = "Emergency";        
    }

    @Override
    public void setStatus() {
        this.status = "Accept";        
    }
    
}
