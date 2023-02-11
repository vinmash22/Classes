package Classes;

public class Library {
    public static void main(String[] args) {
        //создаем объект Автор, выводим в консоль
        Author herbertShildt = new Author("Herbert", "Shildt");
        System.out.println();
        System.out.println(herbertShildt);
        //выводим в консоль хеш-код
        System.out.println(herbertShildt.hashCode());

        //создаем второй объект Автор, выводим в консоль
        Author bertBates = new Author("Bert", "Bates");
        System.out.println();
        System.out.println(bertBates);
        //выводим в консоль хеш-код
        System.out.println(bertBates.hashCode());

        //сравниваем авторов, выводим в консоль
        System.out.println();
        System.out.println(bertBates.equals(herbertShildt));

        //создаем объект Книга, выводим в консоль
        Book headFirstJava = new Book("Head First Java", bertBates, 2012);
        System.out.println();
        System.out.println(headFirstJava);
        //меняем у объекта Книга свойство год, выводим в консоль
        headFirstJava.setYear(2022);
        System.out.println(headFirstJava.getYear());
        //выводим в консоль хеш-код
        System.out.println(headFirstJava.hashCode());

        //создаем второй объект Книга, выводим в консоль
        Book theCompleteReference = new Book("The Complete Reference Java", herbertShildt, 2018);
        System.out.println();
        System.out.println(theCompleteReference);
        //меняем у второго объекта Книга свойство год, выводим в консоль
        theCompleteReference.setYear(2020);
        System.out.println(theCompleteReference.getYear());
        //выводим в консоль хеш-код
        System.out.println(theCompleteReference.hashCode());
        //сравниваем две книги ,выводим в консоль
        System.out.println();
        System.out.println(headFirstJava.equals(theCompleteReference));
    }
}