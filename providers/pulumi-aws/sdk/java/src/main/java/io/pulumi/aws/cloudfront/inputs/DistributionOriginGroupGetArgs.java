// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginGroupMemberGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupGetArgs Empty = new DistributionOriginGroupGetArgs();

    /**
     * The failover criteria for when to failover to the secondary origin
     * 
     */
    @InputImport(name="failoverCriteria", required=true)
      private final Output<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria;

    public Output<DistributionOriginGroupFailoverCriteriaGetArgs> getFailoverCriteria() {
        return this.failoverCriteria;
    }

    /**
     * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    @InputImport(name="members", required=true)
      private final Output<List<DistributionOriginGroupMemberGetArgs>> members;

    public Output<List<DistributionOriginGroupMemberGetArgs>> getMembers() {
        return this.members;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @InputImport(name="originId", required=true)
      private final Output<String> originId;

    public Output<String> getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupGetArgs(
        Output<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria,
        Output<List<DistributionOriginGroupMemberGetArgs>> members,
        Output<String> originId) {
        this.failoverCriteria = Objects.requireNonNull(failoverCriteria, "expected parameter 'failoverCriteria' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupGetArgs() {
        this.failoverCriteria = Output.empty();
        this.members = Output.empty();
        this.originId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria;
        private Output<List<DistributionOriginGroupMemberGetArgs>> members;
        private Output<String> originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.members = defaults.members;
    	      this.originId = defaults.originId;
        }

        public Builder failoverCriteria(Output<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder failoverCriteria(DistributionOriginGroupFailoverCriteriaGetArgs failoverCriteria) {
            this.failoverCriteria = Output.of(Objects.requireNonNull(failoverCriteria));
            return this;
        }

        public Builder members(Output<List<DistributionOriginGroupMemberGetArgs>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<DistributionOriginGroupMemberGetArgs> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder originId(Output<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder originId(String originId) {
            this.originId = Output.of(Objects.requireNonNull(originId));
            return this;
        }
        public DistributionOriginGroupGetArgs build() {
            return new DistributionOriginGroupGetArgs(failoverCriteria, members, originId);
        }
    }
}
