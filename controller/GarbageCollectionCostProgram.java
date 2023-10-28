/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import repository.GarbageCollectionCostProcessRepository;
import java.util.ArrayList;
import java.util.List;


public class GarbageCollectionCostProgram {

    List<Integer> lt;
    GarbageCollectionCostProcessRepository program;

    public GarbageCollectionCostProgram() {
        lt = new ArrayList<Integer>();
        program = new GarbageCollectionCostProcessRepository();
    }

    public void run() {
        System.out.println("\t----- Garbage Collection -----");

        program.display(lt);
    }
}