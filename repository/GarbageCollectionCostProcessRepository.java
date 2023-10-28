/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.GarbageCollectionCostDAO;
import java.util.List;


public class GarbageCollectionCostProcessRepository implements IGarbageCollectionCostProcessRepository{

     @Override
    public void display(List<Integer> lt) {
        GarbageCollectionCostDAO.Instance().display(lt);
    }   
}