public interface Repository<T> {
    void add(T item);
    T read(int id);
    void update(T item);
    void delete(int id);
}
