package advancedJava.shoppingSpree;

public class Product {

    private static String EMPTY_NAME="Name cannot be empty";
    private static String INVALID_MONEY="Money cannot be negative";

    private String nameProduct;
    private int costProduct;

    public Product(String nameProduct, int costProduct) {
        this.setNameProduct(nameProduct);
        this.setCostProduct(costProduct);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    private void setNameProduct(String nameProduct) throws IllegalArgumentException {
        if((nameProduct.equalsIgnoreCase(""))
                ||(nameProduct.equalsIgnoreCase(" "))
                ||(nameProduct.contains(" "))||nameProduct.isEmpty()||nameProduct==null)
        {
            throw new IllegalArgumentException(EMPTY_NAME);
        }
        this.nameProduct = nameProduct;
    }

    public int getCostProduct() {
        return costProduct;
    }

    private void setCostProduct(int costProduct) throws IllegalArgumentException{
        if(costProduct<0)
        {
            throw new IllegalArgumentException(INVALID_MONEY);
        }
        this.costProduct = costProduct;
    }
}
