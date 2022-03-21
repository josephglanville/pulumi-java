// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Endpoint config for this cluster
 * 
 */
public final class EndpointConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigArgs Empty = new EndpointConfigArgs();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @Import(name="enableHttpPortAccess")
      private final @Nullable Output<Boolean> enableHttpPortAccess;

    public Output<Boolean> getEnableHttpPortAccess() {
        return this.enableHttpPortAccess == null ? Output.empty() : this.enableHttpPortAccess;
    }

    public EndpointConfigArgs(@Nullable Output<Boolean> enableHttpPortAccess) {
        this.enableHttpPortAccess = enableHttpPortAccess;
    }

    private EndpointConfigArgs() {
        this.enableHttpPortAccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableHttpPortAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
        }

        public Builder enableHttpPortAccess(@Nullable Output<Boolean> enableHttpPortAccess) {
            this.enableHttpPortAccess = enableHttpPortAccess;
            return this;
        }
        public Builder enableHttpPortAccess(@Nullable Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Output.ofNullable(enableHttpPortAccess);
            return this;
        }        public EndpointConfigArgs build() {
            return new EndpointConfigArgs(enableHttpPortAccess);
        }
    }
}
