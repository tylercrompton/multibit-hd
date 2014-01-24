package org.multibit.hd.ui.events.view;

import org.joda.money.BigMoney;

/**
 * <p>Event to provide the following to View Event API:</p>
 * <ul>
 * <li>Indicates a balance change has occurred</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class BalanceChangedEvent implements ViewEvent {

  private final BigMoney plainBitcoinBalance;
  private final BigMoney localBalance;
  private final String rateProvider;

  /**
   * @param plainBitcoinBalance The current balance in BTC without symbolic multiplier
   * @param localBalance        The current balance in local currency
   * @param rateProvider        The exchange rate provider (e.g. "Bitstamp")
   */
  public BalanceChangedEvent(BigMoney plainBitcoinBalance, BigMoney localBalance, String rateProvider) {

    this.plainBitcoinBalance = plainBitcoinBalance;
    this.localBalance = localBalance;
    this.rateProvider = rateProvider;

  }

  /**
   * @return The Bitcoin balance without symbolic multiplier
   */
  public BigMoney getPlainBitcoinBalance() {
    return plainBitcoinBalance;
  }

  /**
   * @return The local currency balance
   */
  public BigMoney getLocalBalance() {
    return localBalance;
  }

  /**
   * @return The exchange rate provider
   */
  public String getRateProvider() {
    return rateProvider;
  }
}
