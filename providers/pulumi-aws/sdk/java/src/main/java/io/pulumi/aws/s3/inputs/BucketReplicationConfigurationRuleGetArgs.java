// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleGetArgs Empty = new BucketReplicationConfigurationRuleGetArgs();

    /**
     * Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    @Import(name="deleteMarkerReplicationStatus")
      private final @Nullable Output<String> deleteMarkerReplicationStatus;

    public Output<String> getDeleteMarkerReplicationStatus() {
        return this.deleteMarkerReplicationStatus == null ? Output.empty() : this.deleteMarkerReplicationStatus;
    }

    /**
     * Specifies the destination for the rule (documented below).
     * 
     */
    @Import(name="destination", required=true)
      private final Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination;

    public Output<BucketReplicationConfigurationRuleDestinationGetArgs> getDestination() {
        return this.destination;
    }

    /**
     * Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter;

    public Output<BucketReplicationConfigurationRuleFilterGetArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * Specifies special object selection criteria (documented below).
     * 
     */
    @Import(name="sourceSelectionCriteria")
      private final @Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;

    public Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria == null ? Output.empty() : this.sourceSelectionCriteria;
    }

    /**
     * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public BucketReplicationConfigurationRuleGetArgs(
        @Nullable Output<String> deleteMarkerReplicationStatus,
        Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination,
        @Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter,
        @Nullable Output<String> id,
        @Nullable Output<String> prefix,
        @Nullable Output<Integer> priority,
        @Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria,
        Output<String> status) {
        this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigurationRuleGetArgs() {
        this.deleteMarkerReplicationStatus = Output.empty();
        this.destination = Output.empty();
        this.filter = Output.empty();
        this.id = Output.empty();
        this.prefix = Output.empty();
        this.priority = Output.empty();
        this.sourceSelectionCriteria = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deleteMarkerReplicationStatus;
        private Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination;
        private @Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter;
        private @Nullable Output<String> id;
        private @Nullable Output<String> prefix;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplicationStatus = defaults.deleteMarkerReplicationStatus;
    	      this.destination = defaults.destination;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplicationStatus(@Nullable Output<String> deleteMarkerReplicationStatus) {
            this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
            return this;
        }
        public Builder deleteMarkerReplicationStatus(@Nullable String deleteMarkerReplicationStatus) {
            this.deleteMarkerReplicationStatus = Output.ofNullable(deleteMarkerReplicationStatus);
            return this;
        }
        public Builder destination(Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(BucketReplicationConfigurationRuleDestinationGetArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder filter(@Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketReplicationConfigurationRuleFilterGetArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs sourceSelectionCriteria) {
            this.sourceSelectionCriteria = Output.ofNullable(sourceSelectionCriteria);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public BucketReplicationConfigurationRuleGetArgs build() {
            return new BucketReplicationConfigurationRuleGetArgs(deleteMarkerReplicationStatus, destination, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
