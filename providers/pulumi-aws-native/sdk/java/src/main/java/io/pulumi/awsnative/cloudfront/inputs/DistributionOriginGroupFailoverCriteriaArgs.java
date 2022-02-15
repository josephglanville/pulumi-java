// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionStatusCodesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class DistributionOriginGroupFailoverCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupFailoverCriteriaArgs Empty = new DistributionOriginGroupFailoverCriteriaArgs();

    @InputImport(name="statusCodes", required=true)
    private final Input<DistributionStatusCodesArgs> statusCodes;

    public Input<DistributionStatusCodesArgs> getStatusCodes() {
        return this.statusCodes;
    }

    public DistributionOriginGroupFailoverCriteriaArgs(Input<DistributionStatusCodesArgs> statusCodes) {
        this.statusCodes = Objects.requireNonNull(statusCodes, "expected parameter 'statusCodes' to be non-null");
    }

    private DistributionOriginGroupFailoverCriteriaArgs() {
        this.statusCodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DistributionStatusCodesArgs> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder setStatusCodes(Input<DistributionStatusCodesArgs> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }

        public Builder setStatusCodes(DistributionStatusCodesArgs statusCodes) {
            this.statusCodes = Input.of(Objects.requireNonNull(statusCodes));
            return this;
        }

        public DistributionOriginGroupFailoverCriteriaArgs build() {
            return new DistributionOriginGroupFailoverCriteriaArgs(statusCodes);
        }
    }
}