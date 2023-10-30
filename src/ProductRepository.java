public class ProductRepository implements Repository<Product> {
    @Override
    public void add(Product item) {
        System.out.println("Added: " + item);
    }

    @Override
    public Product read(int id) {
        System.out.println("Read: Product with ID " + id);
        return new Product(id, "Sample Product");
    }

    @Override
    public void update(Product item) {
        System.out.println("Updated: " + item);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleted: Product with ID " + id);
    }
}