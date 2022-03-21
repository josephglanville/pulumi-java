// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDeleteMarkerReplication;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDestination;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleExistingObjectReplication;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleFilter;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleSourceSelectionCriteria;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigRule {
    /**
     * Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleDeleteMarkerReplication deleteMarkerReplication;
    /**
     * Specifies the destination for the rule documented below.
     * 
     */
    private final BucketReplicationConfigRuleDestination destination;
    /**
     * Replicate existing objects in the source bucket according to the rule configurations documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleExistingObjectReplication existingObjectReplication;
    /**
     * Filter that identifies subset of objects to which the replication rule applies documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleFilter filter;
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    private final @Nullable String id;
    /**
     * Object key name prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    private final @Nullable String prefix;
    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Specifies special object selection criteria documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleSourceSelectionCriteria sourceSelectionCriteria;
    /**
     * The status of the rule. Either `"Enabled"` or `"Disabled"`. The rule is ignored if status is not "Enabled".
     * 
     */
    private final String status;

    @CustomType.Constructor
    private BucketReplicationConfigRule(
        @CustomType.Parameter("deleteMarkerReplication") @Nullable BucketReplicationConfigRuleDeleteMarkerReplication deleteMarkerReplication,
        @CustomType.Parameter("destination") BucketReplicationConfigRuleDestination destination,
        @CustomType.Parameter("existingObjectReplication") @Nullable BucketReplicationConfigRuleExistingObjectReplication existingObjectReplication,
        @CustomType.Parameter("filter") @Nullable BucketReplicationConfigRuleFilter filter,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("sourceSelectionCriteria") @Nullable BucketReplicationConfigRuleSourceSelectionCriteria sourceSelectionCriteria,
        @CustomType.Parameter("status") String status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = destination;
        this.existingObjectReplication = existingObjectReplication;
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = status;
    }

    /**
     * Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleDeleteMarkerReplication> getDeleteMarkerReplication() {
        return Optional.ofNullable(this.deleteMarkerReplication);
    }
    /**
     * Specifies the destination for the rule documented below.
     * 
    */
    public BucketReplicationConfigRuleDestination getDestination() {
        return this.destination;
    }
    /**
     * Replicate existing objects in the source bucket according to the rule configurations documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleExistingObjectReplication> getExistingObjectReplication() {
        return Optional.ofNullable(this.existingObjectReplication);
    }
    /**
     * Filter that identifies subset of objects to which the replication rule applies documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Object key name prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Specifies special object selection criteria documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleSourceSelectionCriteria> getSourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }
    /**
     * The status of the rule. Either `"Enabled"` or `"Disabled"`. The rule is ignored if status is not "Enabled".
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigRuleDeleteMarkerReplication deleteMarkerReplication;
        private BucketReplicationConfigRuleDestination destination;
        private @Nullable BucketReplicationConfigRuleExistingObjectReplication existingObjectReplication;
        private @Nullable BucketReplicationConfigRuleFilter filter;
        private @Nullable String id;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable BucketReplicationConfigRuleSourceSelectionCriteria sourceSelectionCriteria;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.existingObjectReplication = defaults.existingObjectReplication;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplication(@Nullable BucketReplicationConfigRuleDeleteMarkerReplication deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }
        public Builder destination(BucketReplicationConfigRuleDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder existingObjectReplication(@Nullable BucketReplicationConfigRuleExistingObjectReplication existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication;
            return this;
        }
        public Builder filter(@Nullable BucketReplicationConfigRuleFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable BucketReplicationConfigRuleSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BucketReplicationConfigRule build() {
            return new BucketReplicationConfigRule(deleteMarkerReplication, destination, existingObjectReplication, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
