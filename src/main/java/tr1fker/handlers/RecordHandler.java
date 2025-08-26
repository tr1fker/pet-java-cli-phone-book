package tr1fker.handlers;

import tr1fker.model.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordHandler {
    private List<Record> records;

    private GsonHandler gsonHandler;

    private int count;

    public RecordHandler(GsonHandler gsonHandler){
        this.records = new ArrayList<>();

        this.gsonHandler = gsonHandler;

        this.count = 0;
    }

    public List<Record> getRecords(){
        return this.records;
    }

    public void addRecord(String name, String phone){
        this.records.add(new Record(name, phone, ++this.count));
    }

    public void removeRecord(String name){
        for (Record record : this.records) {
            if (record.getName().equals(name)){
                this.records.remove(record);
                break;
            }
        }
    }

    public Record searchRecordByName(String name){
        for (Record record : this.records){
            if (record.getName().equals(name)){
                return record;
            }
        }
        return null;
    }

    public void setPhoneByName(String name, String phone){
        for (Record record : this.records){
            if (record.getName().equals(name)){
                record.setPhone(phone);
                break;
            }
        }
    }

    public void loadRecords(){
        this.records = this.gsonHandler.loadRecords();
        for (Record record : this.records) {
            record.setId(++this.count);
        }
    }

    public void saveRecords(){
        this.gsonHandler.saveRecords(this.records);
    }

}
