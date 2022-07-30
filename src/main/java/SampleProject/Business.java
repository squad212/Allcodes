package SampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class Business {
    @Autowired
    public Services services;

    public Business(Services services) {
        this.services = services;
    }
//declaration
    public List<String> getInformationToRegister(String userName) {
        /**
         *created new instance of list "register"
         * populating the service infor in detail obj
         * returning details of customer
         */

        List<String> register = new ArrayList<String>();
        List<String> details = services.getInformation(userName);

        for(String customerDetails: details){
            if (customerDetails.contains("Same12@")){
                register.add(customerDetails);
            }
        }
        return details;
    }

}