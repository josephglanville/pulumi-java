// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that define the retention policy for flow log.
 * 
 */
public final class RetentionPolicyParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyParametersArgs Empty = new RetentionPolicyParametersArgs();

    /**
     * Number of days to retain flow log records.
     * 
     */
    @InputImport(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    /**
     * Flag to enable/disable retention.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public RetentionPolicyParametersArgs(
        @Nullable Output<Integer> days,
        @Nullable Output<Boolean> enabled) {
        this.days = days == null ? Output.ofNullable(0) : days;
        this.enabled = enabled == null ? Output.ofNullable(false) : enabled;
    }

    private RetentionPolicyParametersArgs() {
        this.days = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Output.ofNullable(days);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public RetentionPolicyParametersArgs build() {
            return new RetentionPolicyParametersArgs(days, enabled);
        }
    }
}
