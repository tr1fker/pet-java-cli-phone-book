package tr1fker.model;

public class Record {
    private String name;
    private String phone;

    public Record(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
