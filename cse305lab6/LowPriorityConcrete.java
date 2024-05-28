import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expire;

    @Override
    public void processRequest() {
        System.out.println("Request Denied");        
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now();
    }

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";        
    }
    
}
