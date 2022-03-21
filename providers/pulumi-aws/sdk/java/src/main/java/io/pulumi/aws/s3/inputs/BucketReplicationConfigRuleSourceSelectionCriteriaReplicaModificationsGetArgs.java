// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs();

    /**
     * Whether the existing objects should be replicated. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs(Output<String> status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs() {
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs build() {
            return new BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs(status);
        }
    }
}
