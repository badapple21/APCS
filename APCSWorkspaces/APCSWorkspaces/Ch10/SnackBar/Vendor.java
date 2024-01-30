/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor {
  // Fields:
  private static double totalSales = 0;
  private int price;
  private int stock;
  public int depositedAmount = 0;
  public int change = 0;

  /**
   * Constructs a Vendor
   * 
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int price, int stock) {
    this.stock = stock;
    this.price = price;
  }

  public int getTotalSales() {
    return totalSales;
  }

  /**
   * Sets the quantity of items in stock.
   * 
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty) {
    this.stock = qty;
  }

  /**
   * Returns the number of items currently in stock.
   * 
   * @return number of items currently in stock (int)
   */
  public int getStock() {
    return this.stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * 
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int number) {
    depositedAmount += number;
  }

  /**
   * 
   * Returns the currently deposited amount (in cents).
   * 
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()

  {
    return depositedAmount;
  }

  /**
   * Implements a sale. If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * 
   * @return true for a successful sale, false otherwise (boolean)
   */
  public Boolean makeSale() {
    if (stock >= 1 && depositedAmount >= price) {
      stock--;
      change = depositedAmount - price;
      depositedAmount = 0;
      totalSales++;
      return true;
    }
    change = depositedAmount;
    return false;
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * 
   * @return number of cents in the current change (int)
   */
  public int getChange()

  {
    int rtn = change;
    change = 0;
    return rtn;
  }
}
