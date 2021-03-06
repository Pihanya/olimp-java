// Объявляем публичный класс Multiplier (Умножитель)
// Наш класс будет заниматься умножением двух целых чисел
public class Multiplier {
    // === Блок свойств класса ===

    // В нашем случае, у нашего класса Умножитель два свойства - множители
    // Пусть оба множителя по-умолчанию будут иметь значение 0
    private int firstNumber = 0; // Первый множитель
    private int secondNumber = 0; // Второй множитель


    // Пустой конструктор класса Multiplier
    public Multiplier() {
    }

    // === БЛОК МЕТОДОВ КЛАССА ===

    // Сеттер для первого множителя.
    // В нем мы присваиваем свойству firstNumber значение аргумента number
    public void setFirstNumber(int number) {
        firstNumber = number;
    }


    // Сеттер для второго множителя.
    // В нем мы присваиваем свойству secondNumber значение аргумента number
    public void setSecondNumber(int number) {
        secondNumber = number;
    }

    // Метод, который вернет результат умножения чисел
    public int multiply() {
        /*
         Как мы помним, return - это ключевое слово,
         которое позволяет нам возвращать значения из методов.
         В даном случае из метода мы возвращаем произведение наших чисел
         */
        return firstNumber * secondNumber;
    }
}
