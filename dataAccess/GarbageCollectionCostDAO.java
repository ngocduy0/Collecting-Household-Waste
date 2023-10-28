/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Library;
import java.util.List;


public class GarbageCollectionCostDAO {

    private static GarbageCollectionCostDAO instance = null;
    Library l;

    public GarbageCollectionCostDAO() {
        l = new Library();
    }

    public static GarbageCollectionCostDAO Instance() {
        if (instance == null) {
            synchronized (GarbageCollectionCostDAO.class) {
                if (instance == null) {
                    instance = new GarbageCollectionCostDAO();
                }
            }
        }
        return instance;
    }

    public void getGarbage(List<Integer> lt) {
        int n = l.getIntNoLimit("How many location you want to input: ");
        int i = 0;
        while (i < n) {
            int input = l.getIntNoLimit("Enter the amount of garbage at each station(in kg): ");
            lt.add(input);
            i++;
        }

    }

    public float calculator(List<Integer> lt) {
        //Tinh tong luong rac tung tram
        int totalGarbage = 0;
        int time = 0;
        int count = 1;
        for (int i = 0; i < lt.size(); i++) {
            time += 8;
            //thoi gian trung binh nap rac tai 1 diem la 8 phut
            if ((totalGarbage + lt.get(i)) >= 10000) {
                //thoi gian di va ve bai rac trung binh la 30 phut
                time += 30;
                totalGarbage = 0;
                count++;
            }
            //cong luong rac o tram i vao tong luong rac 
            totalGarbage += lt.get(i);

        }
        if (totalGarbage > 0) {
            time += 30;
        }
        float time1 = (float) time / 60;
        //120000/1h va 57000/xe
        float totalCost = (time1 * 120000) + (57000 * count);
        return totalCost;
    }

    public void display(List<Integer> lt) {
        while (true) {
            getGarbage(lt); //du lieu luong rac tung tram
            float a = calculator(lt); //tong tien dua tren luong rac
            System.out.println("The total cost: " + a + "VND");
            lt.clear();
            if (!l.checkInputYN("Do you want to continue(Y/N)?: ")) {
                return;
            }
        }
    }
}