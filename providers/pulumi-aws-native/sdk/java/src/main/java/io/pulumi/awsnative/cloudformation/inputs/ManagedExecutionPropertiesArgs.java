// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
 * 
 */
public final class ManagedExecutionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedExecutionPropertiesArgs Empty = new ManagedExecutionPropertiesArgs();

    @InputImport(name="active")
      private final @Nullable Input<Boolean> active;

    public Input<Boolean> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    public ManagedExecutionPropertiesArgs(@Nullable Input<Boolean> active) {
        this.active = active;
    }

    private ManagedExecutionPropertiesArgs() {
        this.active = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedExecutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> active;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedExecutionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        public Builder setActive(@Nullable Input<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Boolean active) {
            this.active = Input.ofNullable(active);
            return this;
        }
        public ManagedExecutionPropertiesArgs build() {
            return new ManagedExecutionPropertiesArgs(active);
        }
    }
}
