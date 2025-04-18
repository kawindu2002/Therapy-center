package com.lk.kp.mentalhospital.bo;

//import com.lk.kp.mentalhospital.custom.impl.*;


public class BoFactory {
    private static BoFactory boFactory;
    private BoFactory(){}

    public static BoFactory getInstance() {
        return boFactory==null?boFactory=new BoFactory():boFactory;
    }

    public enum BOTypes{
        PATIENT,
        PAYMENT,
        PROGRAM,
        REGISTRATION,
        THERAPIST,
        THERAPYSESSION,
        USER

    }

    public SuperBO getBo(BoFactory.BOTypes boTypes){
        switch (boTypes){

            case PATIENT:
//                return new PatientBoImpl();
            case PAYMENT:
//                return new PaymentBoImpl();
            case PROGRAM:
//                return new ProgramBoImpl();
            case REGISTRATION:
//                return new RegistrationBoImpl();
            case THERAPIST:
//                return new TherapistBoImpl();
            case THERAPYSESSION:
//                return new TherapySessionBoImpl();
            case USER:
//                return new UserBoImpl();
            default:
                return null;
        }
    }
}
