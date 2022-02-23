// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtSubscriptionArgs Empty = new GetRemediationAtSubscriptionArgs();

    /**
     * The name of the remediation.
     * 
     */
    @InputImport(name="remediationName", required=true)
      private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    public GetRemediationAtSubscriptionArgs(String remediationName) {
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
    }

    private GetRemediationAtSubscriptionArgs() {
        this.remediationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemediationAtSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String remediationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemediationAtSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remediationName = defaults.remediationName;
        }

        public Builder setRemediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }
        public GetRemediationAtSubscriptionArgs build() {
            return new GetRemediationAtSubscriptionArgs(remediationName);
        }
    }
}
