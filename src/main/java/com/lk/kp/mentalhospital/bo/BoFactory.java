package com.lk.kp.mentalhospital.bo;

public class BoFactory {
    private static BoFactory boFactory;
    private BoFactory(){}

    public static BoFactory getInstance() {
        return boFactory == null ? boFactory = new BoFactory() : boFactory;
    }

//    public <T extends SuperBO> T getBO(BoTypes boTypes){
//
//        // prevent compiler warning about unchecked type casting
//        return switch (boTypes) {
//            case PATIENT -> (T) new PatientBoImpl();
//            case PAYMENT -> (T) new PaymentBoImpl();
//            case PROGRAM -> (T) new ProgramBoImpl();
//            case REGISTRATION -> (T) new RegistrationBoImpl();
//            case THERAPIST -> (T) new TherapistBoImpl();
//            case THERAPYSESSION -> (T) new TherapySessionBoImpl();
//            case USER -> (T) new UserBoImpl();
//        };
//    }
}


