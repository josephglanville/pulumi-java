// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2OneWayAgreementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The integration account AS2 agreement content.
 * 
 */
public final class AS2AgreementContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2AgreementContentArgs Empty = new AS2AgreementContentArgs();

    /**
     * The AS2 one-way receive agreement.
     * 
     */
    @InputImport(name="receiveAgreement", required=true)
      private final Input<AS2OneWayAgreementArgs> receiveAgreement;

    public Input<AS2OneWayAgreementArgs> getReceiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The AS2 one-way send agreement.
     * 
     */
    @InputImport(name="sendAgreement", required=true)
      private final Input<AS2OneWayAgreementArgs> sendAgreement;

    public Input<AS2OneWayAgreementArgs> getSendAgreement() {
        return this.sendAgreement;
    }

    public AS2AgreementContentArgs(
        Input<AS2OneWayAgreementArgs> receiveAgreement,
        Input<AS2OneWayAgreementArgs> sendAgreement) {
        this.receiveAgreement = Objects.requireNonNull(receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
        this.sendAgreement = Objects.requireNonNull(sendAgreement, "expected parameter 'sendAgreement' to be non-null");
    }

    private AS2AgreementContentArgs() {
        this.receiveAgreement = Input.empty();
        this.sendAgreement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2AgreementContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AS2OneWayAgreementArgs> receiveAgreement;
        private Input<AS2OneWayAgreementArgs> sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2AgreementContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder setReceiveAgreement(Input<AS2OneWayAgreementArgs> receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }

        public Builder setReceiveAgreement(AS2OneWayAgreementArgs receiveAgreement) {
            this.receiveAgreement = Input.of(Objects.requireNonNull(receiveAgreement));
            return this;
        }

        public Builder setSendAgreement(Input<AS2OneWayAgreementArgs> sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }

        public Builder setSendAgreement(AS2OneWayAgreementArgs sendAgreement) {
            this.sendAgreement = Input.of(Objects.requireNonNull(sendAgreement));
            return this;
        }
        public AS2AgreementContentArgs build() {
            return new AS2AgreementContentArgs(receiveAgreement, sendAgreement);
        }
    }
}
