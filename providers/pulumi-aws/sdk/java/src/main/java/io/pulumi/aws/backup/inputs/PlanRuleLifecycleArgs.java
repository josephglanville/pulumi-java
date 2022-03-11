// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanRuleLifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanRuleLifecycleArgs Empty = new PlanRuleLifecycleArgs();

    /**
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    @InputImport(name="coldStorageAfter")
      private final @Nullable Output<Integer> coldStorageAfter;

    public Output<Integer> getColdStorageAfter() {
        return this.coldStorageAfter == null ? Output.empty() : this.coldStorageAfter;
    }

    /**
     * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    @InputImport(name="deleteAfter")
      private final @Nullable Output<Integer> deleteAfter;

    public Output<Integer> getDeleteAfter() {
        return this.deleteAfter == null ? Output.empty() : this.deleteAfter;
    }

    public PlanRuleLifecycleArgs(
        @Nullable Output<Integer> coldStorageAfter,
        @Nullable Output<Integer> deleteAfter) {
        this.coldStorageAfter = coldStorageAfter;
        this.deleteAfter = deleteAfter;
    }

    private PlanRuleLifecycleArgs() {
        this.coldStorageAfter = Output.empty();
        this.deleteAfter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanRuleLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> coldStorageAfter;
        private @Nullable Output<Integer> deleteAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanRuleLifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageAfter = defaults.coldStorageAfter;
    	      this.deleteAfter = defaults.deleteAfter;
        }

        public Builder coldStorageAfter(@Nullable Output<Integer> coldStorageAfter) {
            this.coldStorageAfter = coldStorageAfter;
            return this;
        }

        public Builder coldStorageAfter(@Nullable Integer coldStorageAfter) {
            this.coldStorageAfter = Output.ofNullable(coldStorageAfter);
            return this;
        }

        public Builder deleteAfter(@Nullable Output<Integer> deleteAfter) {
            this.deleteAfter = deleteAfter;
            return this;
        }

        public Builder deleteAfter(@Nullable Integer deleteAfter) {
            this.deleteAfter = Output.ofNullable(deleteAfter);
            return this;
        }
        public PlanRuleLifecycleArgs build() {
            return new PlanRuleLifecycleArgs(coldStorageAfter, deleteAfter);
        }
    }
}
