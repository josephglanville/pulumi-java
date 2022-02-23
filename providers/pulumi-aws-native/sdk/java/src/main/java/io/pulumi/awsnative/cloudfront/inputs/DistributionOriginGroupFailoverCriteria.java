// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionStatusCodes;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class DistributionOriginGroupFailoverCriteria extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroupFailoverCriteria Empty = new DistributionOriginGroupFailoverCriteria();

    @InputImport(name="statusCodes", required=true)
      private final DistributionStatusCodes statusCodes;

    public DistributionStatusCodes getStatusCodes() {
        return this.statusCodes;
    }

    public DistributionOriginGroupFailoverCriteria(DistributionStatusCodes statusCodes) {
        this.statusCodes = Objects.requireNonNull(statusCodes, "expected parameter 'statusCodes' to be non-null");
    }

    private DistributionOriginGroupFailoverCriteria() {
        this.statusCodes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionStatusCodes statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder setStatusCodes(DistributionStatusCodes statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public DistributionOriginGroupFailoverCriteria build() {
            return new DistributionOriginGroupFailoverCriteria(statusCodes);
        }
    }
}
