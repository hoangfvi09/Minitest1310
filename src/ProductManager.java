import java.util.Scanner;

public class ProductManager {
    private int numberOfProducts;
    private Product[] productList;
    private String currency = "USD";

    public ProductManager(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void createProductList() {
        this.productList = new Product[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter Product " + i + " information(name,category,code,price): ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            String category = scanner.nextLine();
            int code = scanner.nextInt();
            int price = scanner.nextInt();
            productList[i] = new Product(name, category, code, price);
        }

    }

    public void findProductByName(String name) {
        int foundProductsCount = 0;
        for (int i = 0; i < numberOfProducts; i++) {
            if (productList[i].getName().equals(name)) {
                System.out.println("Information of product " + name + " :" + productList[i]);
            }
        }
        if (foundProductsCount != 0) {
            System.out.println("Can't find the product " + name);
        }
    }

    public int totalCal() {
        int total = 0;
        for (int i = 0; i < productList.length; i++) {
            total += productList[i].getPrice();
        }
        return total;
    }

    public void editProductByCode(int code) {
        int foundProductsCount = 0;
        for (int i = 0; i < numberOfProducts; i++) {
            if (productList[i].getCode() == code) {
                foundProductsCount++;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new information for product " + i + " (name,category,price):");
                String name = scanner.nextLine();
                productList[i].setName(name);
                String category = scanner.nextLine();
                productList[i].setCategory(category);
                int price = scanner.nextInt();
                productList[i].setPrice(price);
            }
        }
        if (foundProductsCount == 0) {
            System.out.println("Can't find the product with code " + code);
        }
    }

    public void deleteProductByCode(int code) {
        int foundProductsCount = 0;
        Product[] newProductsList = new Product[numberOfProducts - 1];
        int newListIndex = 0;
        for (int i = 0; i < numberOfProducts; i++) {
            if (productList[i].getCode() != code) {
                newProductsList[newListIndex] = getProductList()[i];
                newListIndex++;
            } else {
                foundProductsCount++;
            }
        }
        if (foundProductsCount == 0) {
            System.out.println("Can't find the product with code " + code);
        }
        setProductList(newProductsList);

    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String getCurrency() {
        return currency;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList) {
        this.productList = productList;
    }

    public void printOutProductList() {
        System.out.println("ProductsList: ");
        for (int i = 0; i < productList.length; i++) {
            System.out.println(productList[i]);
        }
    }

}
