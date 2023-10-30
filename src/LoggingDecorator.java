public class LoggingDecorator<T> implements Repository<T> {
    private Repository<T> repository;

    public LoggingDecorator(Repository<T> repository) {
        this.repository = repository;
    }

    @Override
    public void add(T item) {
        System.out.println("Adding item...");
        repository.add(item);
        System.out.println("Added item.");
    }

    @Override
    public T read(int id) {
        System.out.println("Reading item...");
        T result = repository.read(id);
        System.out.println("Read item.");
        return result;
    }

    @Override
    public void update(T item) {
        System.out.println("Updating item...");
        repository.update(item);
        System.out.println("Updated item.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting item...");
        repository.delete(id);
        System.out.println("Deleted item.");
    }
}