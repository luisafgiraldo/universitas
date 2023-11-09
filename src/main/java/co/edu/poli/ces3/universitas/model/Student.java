package co.edu.poli.ces3.universitas.model;

public class Student {
    public int id;
    ;
    protected String document;
    private String name;

    public Student(int id,String document, String name){
        this.id = id;
        this.document = document;
        this.name = name;
    }

    public Student(){

    }
    public Student(String document){
        this.document = document;
    }

    public int getId() {
        return this.id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "El estudiante se llama: " + this.name +
                " su documento es: " + this.document;
    }
}
