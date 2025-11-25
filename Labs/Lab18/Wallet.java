package Lab18;

public class Wallet {
  private MoneyList walletContents = new MoneyList();

  public Wallet() {

  }

  public void addToWallet(Money m) {
    walletContents.append(m);
  }

  public void print() {
    // traverse linked list and print all values
    MoneyList curr = walletContents;
   System.out.println(curr);
  }

  public String getValue() {
    return "$ " + walletContents.sum();
    }

  }

/*
 * walletContents = linked list of all our money
 * addToWallet = create a new node and add it to the linkedlist
 * .append
 * 
 */