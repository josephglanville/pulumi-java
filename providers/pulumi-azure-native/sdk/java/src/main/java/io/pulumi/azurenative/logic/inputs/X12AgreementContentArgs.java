// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.X12OneWayAgreementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The X12 agreement content.
 * 
 */
public final class X12AgreementContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12AgreementContentArgs Empty = new X12AgreementContentArgs();

    /**
     * The X12 one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
      private final Output<X12OneWayAgreementArgs> receiveAgreement;

    public Output<X12OneWayAgreementArgs> getReceiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The X12 one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
      private final Output<X12OneWayAgreementArgs> sendAgreement;

    public Output<X12OneWayAgreementArgs> getSendAgreement() {
        return this.sendAgreement;
    }

    public X12AgreementContentArgs(
        Output<X12OneWayAgreementArgs> receiveAgreement,
        Output<X12OneWayAgreementArgs> sendAgreement) {
        this.receiveAgreement = Objects.requireNonNull(receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
        this.sendAgreement = Objects.requireNonNull(sendAgreement, "expected parameter 'sendAgreement' to be non-null");
    }

    private X12AgreementContentArgs() {
        this.receiveAgreement = Output.empty();
        this.sendAgreement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12AgreementContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<X12OneWayAgreementArgs> receiveAgreement;
        private Output<X12OneWayAgreementArgs> sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(X12AgreementContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder receiveAgreement(Output<X12OneWayAgreementArgs> receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }
        public Builder receiveAgreement(X12OneWayAgreementArgs receiveAgreement) {
            this.receiveAgreement = Output.of(Objects.requireNonNull(receiveAgreement));
            return this;
        }
        public Builder sendAgreement(Output<X12OneWayAgreementArgs> sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }
        public Builder sendAgreement(X12OneWayAgreementArgs sendAgreement) {
            this.sendAgreement = Output.of(Objects.requireNonNull(sendAgreement));
            return this;
        }        public X12AgreementContentArgs build() {
            return new X12AgreementContentArgs(receiveAgreement, sendAgreement);
        }
    }
}
