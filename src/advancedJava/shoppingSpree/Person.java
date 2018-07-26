package advancedJava.shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

private static String EMPTY_NAME="Name cannot be empty";
private static String INVALID_MONEY="Money cannot be negative";

    private String namePerson;
    private int moneyPerson;
    private List<Product> product;

    public Person(String namePerson, int moneyPerson) {
        this.setNamePerson(namePerson);
        this.setMoneyPerson(moneyPerson);
        this.product = new ArrayList<>();
    }

    public String getNamePerson() {
        return namePerson;
    }

    private void setNamePerson(String namePerson) throws IllegalArgumentException {
        if((namePerson.equalsIgnoreCase(""))
                ||(namePerson.equalsIgnoreCase(" "))
                ||(namePerson.contains(" "))||namePerson.isEmpty()
                ||namePerson==null)
        {
            throw new IllegalArgumentException(EMPTY_NAME);
        }
        this.namePerson = namePerson;
    }

    public int getMoneyPerson() {
        return moneyPerson;
    }

    private void setMoneyPerson(int moneyPerson) throws IllegalArgumentException {
        if(moneyPerson<0)
        {
            throw new IllegalArgumentException(INVALID_MONEY);

        }
        this.moneyPerson = moneyPerson;
    }

    public void buy(Product product)
    {
        int cost =product.getCostProduct();
        if(cost>this.moneyPerson)
        {
            throw new IllegalArgumentException(String.format("%s can't afford %s"
                    ,this.namePerson,product.getNameProduct()));
        }
        this.product.add(product);
        this.moneyPerson-=cost;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        if(this.product.isEmpty())
        {
            return String.format("%s – Nothing bought",this.namePerson);
        }
        else
        return String.format("%s - %s",this.namePerson
                ,this.product.stream().map(Product::getNameProduct)
                        .collect(Collectors.joining(", ")));
    }
}
