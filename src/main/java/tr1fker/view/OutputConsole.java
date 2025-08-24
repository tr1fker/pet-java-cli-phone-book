package tr1fker.view;

import tr1fker.model.Record;

import java.util.List;

public class OutputConsole {
    public void printCustomMenu(){
        System.out.println("""
Пользовательское меню
1. Добавить контакт
2. Просмотреть список контактов
3. Найти контакт
4. редактировать контакт
5. Удалить контакт
6. Выйти""");
    }

    public void printIOption(){
        System.out.print("Введите опцию:");
    }

    public void printSuccessExit(){
        System.out.println("Программа успешно завершена!");
    }

    public void printIName(){
        System.out.print("Введите имя:");
    }

    public void printIPhone(){
        System.out.print("Введите телефон:");
    }

    public void printRecords(List<Record> records){
        System.out.println("Список контактов:");
        for (Record record : records) {
            System.out.println("№" + record.getId() + " Имя:" + record.getName() + " Телефон:" + record.getPhone());
        }
    }
}
