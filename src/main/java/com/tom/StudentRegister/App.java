package com.tom.studentregister;

import com.tom.studentregister.controller.Controller;
import com.tom.studentregister.dao.AuditDao;
import com.tom.studentregister.dao.AuditDaoFileImpl;
import com.tom.studentregister.dao.Dao;
import com.tom.studentregister.dao.DaoFileImpl;
import com.tom.studentregister.service.ServiceLayer;
import com.tom.studentregister.service.ServiceLayerImpl;
import com.tom.studentregister.ui.View;
import com.tom.studentregister.ui.UserIO;
import com.tom.studentregister.ui.UserIOConsoleImpl;

public class App {
    
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        View myView = new View(myIo);
        Dao myDao = new DaoFileImpl();
        AuditDao myAuditDao = new AuditDaoFileImpl();
        ServiceLayer myService = new ServiceLayerImpl(myDao, myAuditDao);
        Controller controller = new Controller(myService, myView);
        controller.run();
    }
    
}
