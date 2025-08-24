package tr1fker.model;

public class Record {
    private int id;
    private String name;
    private String phone;

    public Record(String name, String phone, int id){
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public int getId(){
        return this.id;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setId(int id){
        this.id = id;
    }
}
