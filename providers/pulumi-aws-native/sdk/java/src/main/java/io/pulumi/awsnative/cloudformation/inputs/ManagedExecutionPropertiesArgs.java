// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
 * 
 */
public final class ManagedExecutionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedExecutionPropertiesArgs Empty = new ManagedExecutionPropertiesArgs();

    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    public ManagedExecutionPropertiesArgs(@Nullable Output<Boolean> active) {
        this.active = active;
    }

    private ManagedExecutionPropertiesArgs() {
        this.active = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedExecutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedExecutionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }
        public Builder active(@Nullable Boolean active) {
            this.active = Output.ofNullable(active);
            return this;
        }        public ManagedExecutionPropertiesArgs build() {
            return new ManagedExecutionPropertiesArgs(active);
        }
    }
}
