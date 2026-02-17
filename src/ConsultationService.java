public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String name, int id){
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (getIsActive()){
            System.out.println("It's active now");
        }
        else{
            System.out.println("It's not active now");
        }

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating bill... siuuuuuuuuuuu");

    }
}