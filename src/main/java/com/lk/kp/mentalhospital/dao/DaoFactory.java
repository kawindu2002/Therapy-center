package com.lk.kp.mentalhospital.dao;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return daoFactory==null?daoFactory=new DaoFactory():daoFactory;
    }


    public <T extends SuperDAO> T getDAO(DaoTypes daoTypes){
        // prevent compiler warning about unchecked type casting

        return switch (daoTypes) {
//            case PATIENT -> (T) new PatientDaoImpl();
//            case PAYMENT -> (T) new PaymentDaoImpl();
//            case PROGRAM -> (T) new ProgramDaoImpl();
//            case REGISTRATION -> (T) new RegistrationDaoImpl();
//            case THERAPIST -> (T) new TherapistDaoImpl();
//            case THERAPYSESSION -> (T) new TherapySessionDaoImpl();
//            case USER -> (T) new UserDaoImpl();
            default -> null;
        };
    }
}

