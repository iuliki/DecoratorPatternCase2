public class Main {
    public static void main(String[] args) {
        // Crearea unui repository de produse
        Repository<Product> productRepository = new ProductRepository();

        // Decorarea repository-ului cu LoggingDecorator
        Repository<Product> loggingRepository = new LoggingDecorator<>(productRepository);


        Product product1 = new Product(1, "Produs 1");
        loggingRepository.add(product1);

        int productId = 2;
        Product product2 = loggingRepository.read(productId);

        Product updatedProduct = new Product(1, "Produs 1 Actualizat");
        loggingRepository.update(updatedProduct);

        loggingRepository.delete(productId);
    }
}
