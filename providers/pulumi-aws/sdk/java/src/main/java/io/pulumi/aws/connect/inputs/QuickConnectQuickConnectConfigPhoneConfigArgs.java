// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QuickConnectQuickConnectConfigPhoneConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigPhoneConfigArgs Empty = new QuickConnectQuickConnectConfigPhoneConfigArgs();

    /**
     * Specifies the phone number in in E.164 format.
     * 
     */
    @Import(name="phoneNumber", required=true)
      private final Output<String> phoneNumber;

    public Output<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuickConnectQuickConnectConfigPhoneConfigArgs(Output<String> phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private QuickConnectQuickConnectConfigPhoneConfigArgs() {
        this.phoneNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigPhoneConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigPhoneConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(Output<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Output.of(Objects.requireNonNull(phoneNumber));
            return this;
        }        public QuickConnectQuickConnectConfigPhoneConfigArgs build() {
            return new QuickConnectQuickConnectConfigPhoneConfigArgs(phoneNumber);
        }
    }
}