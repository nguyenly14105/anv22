/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.DoctorDTO;
import model.Doctor;
import java.util.*;
import view.DoctorView;

/**
 *
 * @author Dell
 */
public class DoctorController {

    private ArrayList<Doctor> doctorList = new ArrayList<>();
    private DoctorDTO dto = new DoctorDTO();
    private DoctorView view = new DoctorView();
    private int ID = 1;

    //set dto
    public void setDTO(DoctorDTO dto) {
        this.dto = dto;
    }

    //add doctor
    public void addDoctor() {
        doctorList.add(new Doctor("D" + String.format("%02d", ID++), dto.getName(), dto.getSpecialization(), dto.getAvailability()));
    }

    //tim kiem theo id
    public Doctor findById(String id) {
        return doctorList.stream().filter(doctor -> doctor.getCode().equalsIgnoreCase(id)).findAny().orElse(null);
    }

    //delete doctor
    public void delete(String id) {
        doctorList.remove(findById(id));
    }

    //update doctor
    public void update(String id, String name, String specialization, int availability) {
        findById(id).setName(name);
        findById(id).setSpecialization(specialization);
        findById(id).setAvailability(availability);
    }

    //display doctor
    public void displayDoctor() {
        StringBuilder result = new StringBuilder();
        doctorList.forEach(doctor -> result.append(doctor.toString()).append("\n"));
        view.setData(result.toString().trim());
        view.display();
    }
}
