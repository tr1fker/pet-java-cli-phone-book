package tr1fker.view;

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
}
