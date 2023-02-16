package com.example.staff.service;

import com.example.staff.model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffService implements StaffInterface {
    static List<Staff> staffList;

    public StaffService(){
        staffList = new ArrayList<>();
        staffList.add(new Staff(1, "Vu"));
        staffList.add(new Staff(2, "Son"));
        staffList.add(new Staff(3, "Lien"));
    }

    @Override
    public List<Staff> findAll() {
        return staffList;
    }

    @Override
    public  Object save(Staff staff) {
        return  staffList.add(staff);
    }

    @Override
    public void update(int index, Staff staff) {
staffList.set(index, staff);
    }

    @Override
    public Staff findById(int id) {
        Staff staff = null;
        for (Staff e :
                staffList) {
            if (e.getId() == id) {
                staff = e;
                break;
            }
        }
        return staff;
    }


    @Override
    public void delete(Staff staff) {
staffList.remove(staff);
    }
}
