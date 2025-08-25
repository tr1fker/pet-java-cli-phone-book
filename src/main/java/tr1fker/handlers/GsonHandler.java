package tr1fker.handlers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tr1fker.model.Record;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class GsonHandler {
    private Gson gson;
    private String filePathRecords;

    public GsonHandler(String filePathRecords){
        this.filePathRecords = filePathRecords;
        this.gson = new Gson();
    }

    public void saveRecords(List<Record> notes){
        try (Writer writer = new FileWriter(this.filePathRecords)) {
            gson.toJson(notes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Record> loadRecords(){
        try (Reader reader = new FileReader(filePathRecords)) {
            Type listType = new TypeToken<List<Record>>() {}.getType();
            List<Record> records = gson.fromJson(reader, listType);
            return records;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
