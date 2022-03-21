// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupFailoverCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupFailoverCriteriaGetArgs Empty = new DistributionOriginGroupFailoverCriteriaGetArgs();

    /**
     * A list of HTTP status codes for the origin group
     * 
     */
    @Import(name="statusCodes", required=true)
      private final Output<List<Integer>> statusCodes;

    public Output<List<Integer>> getStatusCodes() {
        return this.statusCodes;
    }

    public DistributionOriginGroupFailoverCriteriaGetArgs(Output<List<Integer>> statusCodes) {
        this.statusCodes = Objects.requireNonNull(statusCodes, "expected parameter 'statusCodes' to be non-null");
    }

    private DistributionOriginGroupFailoverCriteriaGetArgs() {
        this.statusCodes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Integer>> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder statusCodes(Output<List<Integer>> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public Builder statusCodes(List<Integer> statusCodes) {
            this.statusCodes = Output.of(Objects.requireNonNull(statusCodes));
            return this;
        }
        public Builder statusCodes(Integer... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }        public DistributionOriginGroupFailoverCriteriaGetArgs build() {
            return new DistributionOriginGroupFailoverCriteriaGetArgs(statusCodes);
        }
    }
}
