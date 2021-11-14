package facades;

import javax.persistence.EntityManagerFactory;

import dtos.FitnessCenterDTO;
import dtos.MemberDTO;
import utils.EMF_Creator;

public class Populator {

    public static void populate() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        MemberFacade memberFacade = MemberFacade.getMemberFacade(emf);

        FitnessCenterFacade fitnessCenterFacade = FitnessCenterFacade.getFitnessCenterFacade(emf);

        //fitnessCenterFacade.addFitnessCenter(new FitnessCenterDTO("Sats"));
       // memberFacade.submitMember(new MemberDTO())

    }

    public static void main(String[] args) {
        populate();
    }
}
