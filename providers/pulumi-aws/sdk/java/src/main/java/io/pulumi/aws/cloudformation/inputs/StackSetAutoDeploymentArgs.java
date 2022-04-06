// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackSetAutoDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetAutoDeploymentArgs Empty = new StackSetAutoDeploymentArgs();

    /**
     * Whether or not auto-deployment is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Whether or not to retain stacks when the account is removed.
     * 
     */
    @Import(name="retainStacksOnAccountRemoval")
      private final @Nullable Output<Boolean> retainStacksOnAccountRemoval;

    public Output<Boolean> getRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval == null ? Output.empty() : this.retainStacksOnAccountRemoval;
    }

    public StackSetAutoDeploymentArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Boolean> retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    private StackSetAutoDeploymentArgs() {
        this.enabled = Output.empty();
        this.retainStacksOnAccountRemoval = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Boolean> retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder retainStacksOnAccountRemoval(@Nullable Output<Boolean> retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Builder retainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = Output.ofNullable(retainStacksOnAccountRemoval);
            return this;
        }        public StackSetAutoDeploymentArgs build() {
            return new StackSetAutoDeploymentArgs(enabled, retainStacksOnAccountRemoval);
        }
    }
}