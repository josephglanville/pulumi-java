// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFlowEntitlementArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowEntitlementArgs Empty = new GetFlowEntitlementArgs();

    /**
     * The ARN of the entitlement.
     * 
     */
    @InputImport(name="entitlementArn", required=true)
      private final String entitlementArn;

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    public GetFlowEntitlementArgs(String entitlementArn) {
        this.entitlementArn = Objects.requireNonNull(entitlementArn, "expected parameter 'entitlementArn' to be non-null");
    }

    private GetFlowEntitlementArgs() {
        this.entitlementArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entitlementArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowEntitlementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entitlementArn = defaults.entitlementArn;
        }

        public Builder setEntitlementArn(String entitlementArn) {
            this.entitlementArn = Objects.requireNonNull(entitlementArn);
            return this;
        }
        public GetFlowEntitlementArgs build() {
            return new GetFlowEntitlementArgs(entitlementArn);
        }
    }
}
