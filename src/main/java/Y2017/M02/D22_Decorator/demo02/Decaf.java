package Y2017.M02.D22_Decorator.demo02;

/**
 * Created by Bob on 2017/2/23.
 */
public class Decaf extends Coffee {
  public double cost() {
    double price = super.cost();
    price += 2.0;
    return price;
  }
}
