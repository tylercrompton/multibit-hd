package org.multibit.hd.ui.i18n;

/**
 * <p>Enum to provide the following to application:</p>
 * <ul>
 * <li>Message keys to use for internationalisation</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public enum MessageKey {

  // Verbs
  APPLY,
  UNDO,
  CANCEL,
  EXIT,
  SEND,
  RECEIVE,
  REFRESH,
  FINISH,
  CLOSE,
  SHOW,
  HIDE,

  // Nouns
  YES,
  NO,
  NEXT,
  PREVIOUS,

  // Field labels
  RECIPIENT,
  TRANSACTION_LABEL,
  NOTES,
  ENTER_PASSWORD,
  CONFIRM_PASSWORD,
  AMOUNT,
  TRANSACTION_FEE,
  DEVELOPER_FEE,

  // Sidebar
  CONTACTS,
  TRANSACTIONS,
  HISTORY,
  PREFERENCES,
  TOOLS,

  // Placeholders
  APPROXIMATELY,
  PARANTHESES,

  // Panels

  NETWORK_CONFIGURATION_ERROR,
  DISPLAY_LANGUAGE,
  HELP,
  SETTINGS,
  CREATE_WALLET,
  RESTORE_WALLET,
  SWITCH_WALLET,
  USE_HARDWARE_WALLET,

  // Titles
  APPLICATION_TITLE,
  SEND_BITCOIN_TITLE,
  RECEIVE_BITCOIN_TITLE,
  CONFIRM_SEND_TITLE,
  SEND_PROGRESS_TITLE,
  EXIT_TITLE,
  WELCOME_TITLE,
  SELECT_WALLET_TITLE,
  CREATE_WALLET_SEED_PHRASE_TITLE,
  CONFIRM_WALLET_SEED_PHRASE_TITLE,
  CREATE_WALLET_PASSWORD_TITLE,
  SELECT_BACKUP_LOCATION_TITLE,
  CREATE_WALLET_REPORT_TITLE,
  RESTORE_WALLET_TITLE,

  // Labels
  CONFIRM_SEND_MESSAGE,
  EXCHANGE_RATE_PROVIDER,

  // Tool buttons
  SHOW_WELCOME_WIZARD,

  // Statuses
  BROADCAST_STATUS,
  RELAY_STATUS,
  CONFIRMATION_STATUS,
  VERIFICATION_STATUS,
  EXCHANGE_RATE_STATUS_OK,
  EXCHANGE_RATE_STATUS_WARN,

  SEED_PHRASE_CREATED_STATUS,
  WALLET_PASSWORD_CREATED_STATUS,
  BACKUP_LOCATION_STATUS,
  WALLET_CREATED_STATUS,


  ALERT_REMAINING,
  EXCHANGE_FIAT_RATE,
  SELECT_LANGUAGE,
  SEED_SIZE,
  TIMESTAMP,

  // Notes (can contain HTML)
  WELCOME_NOTE_1,
  WELCOME_NOTE_2,
  WELCOME_NOTE_3,
  WELCOME_NOTE_4,

  SELECT_BACKUP_LOCATION_NOTE_1,
  SELECT_BACKUP_LOCATION_NOTE_2,
  SELECT_BACKUP_LOCATION_NOTE_3,
  SELECT_BACKUP_LOCATION_NOTE_4,

  SEED_WARNING_NOTE_1,
  SEED_WARNING_NOTE_2,
  SEED_WARNING_NOTE_3,
  SEED_WARNING_NOTE_4,

  CONFIRM_SEED_PHRASE_NOTE_1,
  CONFIRM_SEED_PHRASE_NOTE_2,
  CONFIRM_SEED_PHRASE_NOTE_3,
  CONFIRM_SEED_PHRASE_NOTE_4,

  WALLET_PASSWORD_NOTE_1,
  WALLET_PASSWORD_NOTE_2,
  WALLET_PASSWORD_NOTE_3,

  RECIPIENT_SUMMARY,
  AMOUNT_SUMMARY,

  // End of enum
  ;

  /**
   * @return The key for use with the resource bundles
   */
  public String getKey() {
      return name().toLowerCase();
  }
}
