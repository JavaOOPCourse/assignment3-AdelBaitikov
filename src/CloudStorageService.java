public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
        private boolean isPremium;

    // TODO: constructor
    public CloudStorageService(String name, int id){
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (getIsActive()){
            System.out.println("It's active now");
        }
        else{
            System.out.println("It's not active now");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        isPremium = true;
        System.out.println("It was upgraded to premium yeahhhh!!!");
    }


    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("сообщение о счёте");
    }
}