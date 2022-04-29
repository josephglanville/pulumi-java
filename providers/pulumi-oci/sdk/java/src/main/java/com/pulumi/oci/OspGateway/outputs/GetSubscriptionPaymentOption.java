// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionPaymentOption {
    /**
     * @return Credit card type.
     * 
     */
    private final String creditCardType;
    /**
     * @return The email address of the paypal user.
     * 
     */
    private final String emailAddress;
    /**
     * @return Agreement id for the paypal account.
     * 
     */
    private final String extBillingAgreementId;
    /**
     * @return First name of the paypal user.
     * 
     */
    private final String firstName;
    /**
     * @return Last four digits of the card.
     * 
     */
    private final String lastDigits;
    /**
     * @return Last name of the paypal user.
     * 
     */
    private final String lastName;
    /**
     * @return Name on the credit card.
     * 
     */
    private final String nameOnCard;
    /**
     * @return Payment method
     * 
     */
    private final String paymentMethod;
    /**
     * @return Expired date of the credit card.
     * 
     */
    private final String timeExpiration;
    /**
     * @return Wallet instrument internal id.
     * 
     */
    private final String walletInstrumentId;
    /**
     * @return Wallet transaction id.
     * 
     */
    private final String walletTransactionId;

    @CustomType.Constructor
    private GetSubscriptionPaymentOption(
        @CustomType.Parameter("creditCardType") String creditCardType,
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("extBillingAgreementId") String extBillingAgreementId,
        @CustomType.Parameter("firstName") String firstName,
        @CustomType.Parameter("lastDigits") String lastDigits,
        @CustomType.Parameter("lastName") String lastName,
        @CustomType.Parameter("nameOnCard") String nameOnCard,
        @CustomType.Parameter("paymentMethod") String paymentMethod,
        @CustomType.Parameter("timeExpiration") String timeExpiration,
        @CustomType.Parameter("walletInstrumentId") String walletInstrumentId,
        @CustomType.Parameter("walletTransactionId") String walletTransactionId) {
        this.creditCardType = creditCardType;
        this.emailAddress = emailAddress;
        this.extBillingAgreementId = extBillingAgreementId;
        this.firstName = firstName;
        this.lastDigits = lastDigits;
        this.lastName = lastName;
        this.nameOnCard = nameOnCard;
        this.paymentMethod = paymentMethod;
        this.timeExpiration = timeExpiration;
        this.walletInstrumentId = walletInstrumentId;
        this.walletTransactionId = walletTransactionId;
    }

    /**
     * @return Credit card type.
     * 
     */
    public String creditCardType() {
        return this.creditCardType;
    }
    /**
     * @return The email address of the paypal user.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return Agreement id for the paypal account.
     * 
     */
    public String extBillingAgreementId() {
        return this.extBillingAgreementId;
    }
    /**
     * @return First name of the paypal user.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return Last four digits of the card.
     * 
     */
    public String lastDigits() {
        return this.lastDigits;
    }
    /**
     * @return Last name of the paypal user.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return Name on the credit card.
     * 
     */
    public String nameOnCard() {
        return this.nameOnCard;
    }
    /**
     * @return Payment method
     * 
     */
    public String paymentMethod() {
        return this.paymentMethod;
    }
    /**
     * @return Expired date of the credit card.
     * 
     */
    public String timeExpiration() {
        return this.timeExpiration;
    }
    /**
     * @return Wallet instrument internal id.
     * 
     */
    public String walletInstrumentId() {
        return this.walletInstrumentId;
    }
    /**
     * @return Wallet transaction id.
     * 
     */
    public String walletTransactionId() {
        return this.walletTransactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionPaymentOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creditCardType;
        private String emailAddress;
        private String extBillingAgreementId;
        private String firstName;
        private String lastDigits;
        private String lastName;
        private String nameOnCard;
        private String paymentMethod;
        private String timeExpiration;
        private String walletInstrumentId;
        private String walletTransactionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionPaymentOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creditCardType = defaults.creditCardType;
    	      this.emailAddress = defaults.emailAddress;
    	      this.extBillingAgreementId = defaults.extBillingAgreementId;
    	      this.firstName = defaults.firstName;
    	      this.lastDigits = defaults.lastDigits;
    	      this.lastName = defaults.lastName;
    	      this.nameOnCard = defaults.nameOnCard;
    	      this.paymentMethod = defaults.paymentMethod;
    	      this.timeExpiration = defaults.timeExpiration;
    	      this.walletInstrumentId = defaults.walletInstrumentId;
    	      this.walletTransactionId = defaults.walletTransactionId;
        }

        public Builder creditCardType(String creditCardType) {
            this.creditCardType = Objects.requireNonNull(creditCardType);
            return this;
        }
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder extBillingAgreementId(String extBillingAgreementId) {
            this.extBillingAgreementId = Objects.requireNonNull(extBillingAgreementId);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = Objects.requireNonNull(lastDigits);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = Objects.requireNonNull(nameOnCard);
            return this;
        }
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = Objects.requireNonNull(paymentMethod);
            return this;
        }
        public Builder timeExpiration(String timeExpiration) {
            this.timeExpiration = Objects.requireNonNull(timeExpiration);
            return this;
        }
        public Builder walletInstrumentId(String walletInstrumentId) {
            this.walletInstrumentId = Objects.requireNonNull(walletInstrumentId);
            return this;
        }
        public Builder walletTransactionId(String walletTransactionId) {
            this.walletTransactionId = Objects.requireNonNull(walletTransactionId);
            return this;
        }        public GetSubscriptionPaymentOption build() {
            return new GetSubscriptionPaymentOption(creditCardType, emailAddress, extBillingAgreementId, firstName, lastDigits, lastName, nameOnCard, paymentMethod, timeExpiration, walletInstrumentId, walletTransactionId);
        }
    }
}
