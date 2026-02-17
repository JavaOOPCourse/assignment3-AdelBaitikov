public abstract class Service {

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive
    private String serviceName;
    private int serviceId;
    private boolean isActive;


    // TODO: constructor

    public Service(String name, int id){
        this.serviceName = name;
        this.serviceId = id;
        this.isActive = false;
    }
    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        isActive = true;
        System.out.println("service was activated successfully!");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService(){
        isActive = false;
        System.out.println("service was deactivated successfully!");
    }


    // TODO: getter for serviceName

    public String getServiceName(){
        return this.serviceName;
    }

    // TODO: getter for isActive
    public boolean getIsActive(){
        return this.isActive;
    }

    // TODO: abstract method performService()
    public abstract void performService();
}