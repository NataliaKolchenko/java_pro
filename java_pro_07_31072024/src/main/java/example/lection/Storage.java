package example.lection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Классы и Интерфейсы с Generics:
//
//Создайте универсальный класс Storage<T>, который будет представлять собой контейнер для хранения объектов типа T.
//Реализуйте методы добавления, удаления и получения объектов из контейнера.
//Добавьте ограничения на тип T, чтобы он должен был быть наследником класса Number.
public class Storage <T extends Number> {
    private List<T> storageList;

    public Storage() {
        this.storageList = new ArrayList<>();
    }

    public void addItems (T item) {
        storageList.add(item);
    }

    public void removeItems (T index) {
        storageList.remove(index);
    }

    public T getItem (int index) throws EmptyStorageException, IndexOutOfBoundsException, IllegalArgumentException{
        if (storageList.isEmpty()) {
            throw new EmptyStorageException("Storage is empty");
        }

        if (index >= storageList.size() ) {
            throw new IndexOutOfBoundsException("Index out of range");

        }

        if (index < 0) {
            throw new IllegalArgumentException("Index less than 0");
        }

        return storageList.get(index);
    }

    //метод для подсчета суммы всех чисел в контейнере
    public double getSumNumbers () {
        double sum = 0.0;
        for (T item: storageList) {
            sum += item.doubleValue();
        }
        
        return sum;
    }

    public void addAll (List<? extends  Number> numbs) {
        for (Number num : numbs) {
            storageList.add((T) num);
        }
    }

    public void sendToList (List<? super Number> numbs) {
        numbs.addAll(storageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T tt : storageList) {
            sb.append(tt);
            sb.append(" ");
        }
        return "[" + sb.toString().trim() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage<?> storage = (Storage<?>) o;
        return Objects.equals(storageList, storage.storageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageList);
    }
}
