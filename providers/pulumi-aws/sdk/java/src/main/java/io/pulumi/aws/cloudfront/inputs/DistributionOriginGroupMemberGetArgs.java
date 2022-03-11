// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupMemberGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupMemberGetArgs Empty = new DistributionOriginGroupMemberGetArgs();

    /**
     * The unique identifier of the member origin
     * 
     */
    @InputImport(name="originId", required=true)
      private final Output<String> originId;

    public Output<String> getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupMemberGetArgs(Output<String> originId) {
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupMemberGetArgs() {
        this.originId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMemberGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMemberGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originId = defaults.originId;
        }

        public Builder originId(Output<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder originId(String originId) {
            this.originId = Output.of(Objects.requireNonNull(originId));
            return this;
        }
        public DistributionOriginGroupMemberGetArgs build() {
            return new DistributionOriginGroupMemberGetArgs(originId);
        }
    }
}
