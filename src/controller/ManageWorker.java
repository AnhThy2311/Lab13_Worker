/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Worker;
import repository.IWorkerRepository;
import repository.WorkerRepository;
import view.Menu;

/**
 *
 * @author HP
 */
public class ManageWorker extends Menu<String>{
    
    private IWorkerRepository iw=  new WorkerRepository();
    private ArrayList<Worker> workers= new ArrayList<>();
    
    public ManageWorker(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                iw.addWorker(workers);
                break;
            case 2:
                iw.changeSalary(workers, "UP");
                break;
            case 3:
                iw.changeSalary(workers, "DOWN");
                break;
            case 4:
                iw.display(workers);
                break;
            case 5:
                System.exit(0);
        }
    }
    
    
}
