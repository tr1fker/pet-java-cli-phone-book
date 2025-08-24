package tr1fker.handlers;

import tr1fker.model.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordHandler {
    private List<Record> records;

    private int count;

    public RecordHandler(){
        this.records = new ArrayList<>();

        this.count = 0;
    }

    public List<Record> getRecords(){
        return this.records;
    }

    public void addRecord(String name, String phone){
        this.records.add(new Record(name, phone, ++this.count));
    }

}
