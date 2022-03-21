// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQuickConnectQuickConnectConfigPhoneConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetQuickConnectQuickConnectConfigPhoneConfig Empty = new GetQuickConnectQuickConnectConfigPhoneConfig();

    /**
     * Specifies the phone number in in E.164 format.
     * 
     */
    @Import(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetQuickConnectQuickConnectConfigPhoneConfig(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private GetQuickConnectQuickConnectConfigPhoneConfig() {
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfigPhoneConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectQuickConnectConfigPhoneConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }        public GetQuickConnectQuickConnectConfigPhoneConfig build() {
            return new GetQuickConnectQuickConnectConfigPhoneConfig(phoneNumber);
        }
    }
}
