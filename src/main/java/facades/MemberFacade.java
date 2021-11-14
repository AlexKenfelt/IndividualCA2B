package facades;

import dtos.MemberDTO;
import entities.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MemberFacade {


    private static EntityManagerFactory emf;
    private static MemberFacade instance;

    private MemberFacade (){

    }

    public static MemberFacade getMemberFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new MemberFacade();
        }
        return instance;
    }

    public MemberDTO submitMember (MemberDTO memberDTO){
        EntityManager em = emf.createEntityManager();
        Member member = new Member(memberDTO.getId(), memberDTO.getName(), memberDTO.getEmail(), memberDTO.getMemberNr(), memberDTO.isMemberActive());
    try{
        em.getTransaction().begin();
        em.persist(member);
        em.getTransaction().commit();
        return new MemberDTO(member);
    }finally {
        em.close();
    }
    }



}
