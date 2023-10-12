/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Worker;

/**
 *
 * @author HP
 */
public interface IWorkerRepository {
    
    public void addWorker(ArrayList<Worker> workers);
    
    public void changeSalary(ArrayList<Worker> workers, String status);
            
    public void display(ArrayList<Worker> workers);
}
