// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionHealthCheckLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckLogConfigArgs Empty = new RegionHealthCheckLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    public RegionHealthCheckLogConfigArgs(@Nullable Output<Boolean> enable) {
        this.enable = enable;
    }

    private RegionHealthCheckLogConfigArgs() {
        this.enable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }        public RegionHealthCheckLogConfigArgs build() {
            return new RegionHealthCheckLogConfigArgs(enable);
        }
    }
}
