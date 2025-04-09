package com.lk.kp.mentalhospital.dao;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return daoFactory==null?daoFactory=new DaoFactory():daoFactory;
    }

    public enum DAOTypes{
        PATIENT,
        PAYMENT,
        PROGRAM,
        REGISTRATION,
        THERAPIST,
        THERAPYSESSION,
        USER

    }


    public SuperDAO getDao(DAOTypes daoTypes){
        switch (daoTypes){

            case PATIENT:
//                return new PatientDaoImpl();
            case PAYMENT:
//                return new PaymentDaoImpl();
            case PROGRAM:
//                return new ProgramDaoImpl();
            case REGISTRATION:
//                return new RegistrationDaoImpl();
            case THERAPIST:
//                return new TherapistDaoImpl();
            case THERAPYSESSION:
//                return new TherapySessionDaoImpl();
            case USER:
//                return new UserDaoImpl();
            default:
                return null;
        }
    }
}
