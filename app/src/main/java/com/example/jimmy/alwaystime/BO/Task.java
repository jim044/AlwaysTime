package com.example.jimmy.alwaystime.BO;

public class Task {

    private int id_task;
    private String nom;
    private String duree;

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getId_task() {
        return id_task;
    }

    public String getNom() {
        return nom;
    }

    public String getDuree() {
        return duree;
    }

    public Task(int id_task, String nom, String duree) {
        this.id_task = id_task;
        this.nom = nom;
        this.duree = duree;
    }


}
