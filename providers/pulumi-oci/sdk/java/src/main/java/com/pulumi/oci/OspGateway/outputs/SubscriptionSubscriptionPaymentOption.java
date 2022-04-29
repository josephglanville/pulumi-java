// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionSubscriptionPaymentOption {
    /**
     * @return (Updatable) Credit card type.
     * 
     */
    private final @Nullable String creditCardType;
    /**
     * @return (Updatable) The email address of the paypal user.
     * 
     */
    private final @Nullable String emailAddress;
    /**
     * @return (Updatable) Agreement id for the paypal account.
     * 
     */
    private final @Nullable String extBillingAgreementId;
    /**
     * @return (Updatable) First name of the paypal user.
     * 
     */
    private final @Nullable String firstName;
    /**
     * @return (Updatable) Last four digits of the card.
     * 
     */
    private final @Nullable String lastDigits;
    /**
     * @return (Updatable) Last name of the paypal user.
     * 
     */
    private final @Nullable String lastName;
    /**
     * @return (Updatable) Name on the credit card.
     * 
     */
    private final @Nullable String nameOnCard;
    /**
     * @return (Updatable) Payment method
     * 
     */
    private final String paymentMethod;
    /**
     * @return (Updatable) Expired date of the credit card.
     * 
     */
    private final @Nullable String timeExpiration;
    /**
     * @return (Updatable) Wallet instrument internal id.
     * 
     */
    private final @Nullable String walletInstrumentId;
    /**
     * @return (Updatable) Wallet transaction id.
     * 
     */
    private final @Nullable String walletTransactionId;

    @CustomType.Constructor
    private SubscriptionSubscriptionPaymentOption(
        @CustomType.Parameter("creditCardType") @Nullable String creditCardType,
        @CustomType.Parameter("emailAddress") @Nullable String emailAddress,
        @CustomType.Parameter("extBillingAgreementId") @Nullable String extBillingAgreementId,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("lastDigits") @Nullable String lastDigits,
        @CustomType.Parameter("lastName") @Nullable String lastName,
        @CustomType.Parameter("nameOnCard") @Nullable String nameOnCard,
        @CustomType.Parameter("paymentMethod") String paymentMethod,
        @CustomType.Parameter("timeExpiration") @Nullable String timeExpiration,
        @CustomType.Parameter("walletInstrumentId") @Nullable String walletInstrumentId,
        @CustomType.Parameter("walletTransactionId") @Nullable String walletTransactionId) {
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
     * @return (Updatable) Credit card type.
     * 
     */
    public Optional<String> creditCardType() {
        return Optional.ofNullable(this.creditCardType);
    }
    /**
     * @return (Updatable) The email address of the paypal user.
     * 
     */
    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }
    /**
     * @return (Updatable) Agreement id for the paypal account.
     * 
     */
    public Optional<String> extBillingAgreementId() {
        return Optional.ofNullable(this.extBillingAgreementId);
    }
    /**
     * @return (Updatable) First name of the paypal user.
     * 
     */
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * @return (Updatable) Last four digits of the card.
     * 
     */
    public Optional<String> lastDigits() {
        return Optional.ofNullable(this.lastDigits);
    }
    /**
     * @return (Updatable) Last name of the paypal user.
     * 
     */
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    /**
     * @return (Updatable) Name on the credit card.
     * 
     */
    public Optional<String> nameOnCard() {
        return Optional.ofNullable(this.nameOnCard);
    }
    /**
     * @return (Updatable) Payment method
     * 
     */
    public String paymentMethod() {
        return this.paymentMethod;
    }
    /**
     * @return (Updatable) Expired date of the credit card.
     * 
     */
    public Optional<String> timeExpiration() {
        return Optional.ofNullable(this.timeExpiration);
    }
    /**
     * @return (Updatable) Wallet instrument internal id.
     * 
     */
    public Optional<String> walletInstrumentId() {
        return Optional.ofNullable(this.walletInstrumentId);
    }
    /**
     * @return (Updatable) Wallet transaction id.
     * 
     */
    public Optional<String> walletTransactionId() {
        return Optional.ofNullable(this.walletTransactionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionSubscriptionPaymentOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creditCardType;
        private @Nullable String emailAddress;
        private @Nullable String extBillingAgreementId;
        private @Nullable String firstName;
        private @Nullable String lastDigits;
        private @Nullable String lastName;
        private @Nullable String nameOnCard;
        private String paymentMethod;
        private @Nullable String timeExpiration;
        private @Nullable String walletInstrumentId;
        private @Nullable String walletTransactionId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionSubscriptionPaymentOption defaults) {
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

        public Builder creditCardType(@Nullable String creditCardType) {
            this.creditCardType = creditCardType;
            return this;
        }
        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder extBillingAgreementId(@Nullable String extBillingAgreementId) {
            this.extBillingAgreementId = extBillingAgreementId;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastDigits(@Nullable String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder nameOnCard(@Nullable String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = Objects.requireNonNull(paymentMethod);
            return this;
        }
        public Builder timeExpiration(@Nullable String timeExpiration) {
            this.timeExpiration = timeExpiration;
            return this;
        }
        public Builder walletInstrumentId(@Nullable String walletInstrumentId) {
            this.walletInstrumentId = walletInstrumentId;
            return this;
        }
        public Builder walletTransactionId(@Nullable String walletTransactionId) {
            this.walletTransactionId = walletTransactionId;
            return this;
        }        public SubscriptionSubscriptionPaymentOption build() {
            return new SubscriptionSubscriptionPaymentOption(creditCardType, emailAddress, extBillingAgreementId, firstName, lastDigits, lastName, nameOnCard, paymentMethod, timeExpiration, walletInstrumentId, walletTransactionId);
        }
    }
}
