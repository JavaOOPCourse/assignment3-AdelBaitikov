public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean isPremium;
    // TODO: constructor
    public StreamingService(String name, int id){
        super(name,id);
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if(getIsActive()){
            if(isPremium) {
                System.out.println("Streaming premium content");
            }
            else{
                System.out.println("Streaming standard content");
            }
        }
        else{
            System.out.println("Service inactive");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        isPremium = true;
        System.out.println("It on now!");

    }
}