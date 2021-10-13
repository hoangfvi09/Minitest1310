import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of products: ");
        Scanner scanner=new Scanner(System.in);
        int numberOfProducts=scanner.nextInt();
        ProductManager productManager=new ProductManager(numberOfProducts);
        productManager.createProductList();
        productManager.printOutProductList();
        System.out.println("Total price of products: "+productManager.totalCal()+ productManager.getCurrency());
        System.out.println("Enter a product name to find: ");
        scanner.nextLine();
        String name=scanner.nextLine();
        productManager.findProductByName(name);
        System.out.println("Enter a product code to edit: ");
        int codeToEdit=scanner.nextInt();
        productManager.editProductByCode(codeToEdit);
        productManager.printOutProductList();
        System.out.println("Enter a product code to delete: ");
        int codeToDelete=scanner.nextInt();
        productManager.deleteProductByCode(codeToDelete);
        productManager.printOutProductList();



    }
}
