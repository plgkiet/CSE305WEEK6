public class Client {
    public static void main(String[] args) {
        RequestCreator lowPriorityCreator = new LowPriorityConcreteCreator();
        lowPriorityCreator.processRequest();

        RequestCreator midPriorityCreator = new MediumPriorityConcreteCreator();
        midPriorityCreator.processRequest();

        RequestCreator hiPriorityCreator = new HighPriorityConcreteCreator();
        hiPriorityCreator.processRequest();
    }
}
