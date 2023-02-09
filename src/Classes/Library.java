package Classes;

public class Library {
    public static void main(String[] args) {
        //создаем объект Автор, выводим в консоль его свойства
        Author herbertShildt = new Author("Herbert", "Shildt");
        System.out.println();
        System.out.println(herbertShildt.getName());
        System.out.println(herbertShildt.getSurname());

        //создаем второй объект Автор, выводим в консоль его свойства
        Author bertBates = new Author("Bert", "Bates");
        System.out.println();
        System.out.println(bertBates.getName());
        System.out.println(bertBates.getSurname());

        //создаем объект Книга, выводим в консоль его свойства
        Book headFirstJava = new Book("Head First Java", bertBates, 2012);
        System.out.println();
        System.out.println(headFirstJava.getTitle());
        System.out.println(headFirstJava.getAuthor());
        System.out.println(headFirstJava.getYear());
        //меняем у объекта Книга свойство год, выводим в консоль
        headFirstJava.setYear(2022);
        System.out.println(headFirstJava.getYear());

        //создаем второй объект Книга, выводим в консоль его свойства
        Book theCompleteReference = new Book("The Complete Reference Java", herbertShildt, 2018);
        System.out.println();
        System.out.println(theCompleteReference.getTitle());
        System.out.println(theCompleteReference.getAuthor());
        System.out.println(theCompleteReference.getYear());
        //меняем у второго объекта Книга свойство год, выводим в консоль
        theCompleteReference.setYear(2020);
        System.out.println(theCompleteReference.getYear());
    }
}