// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.RouterNatLogConfigFilter;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of logging on a NAT.
 * 
 */
public final class RouterNatLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatLogConfigArgs Empty = new RouterNatLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<RouterNatLogConfigFilter> filter;

    public Output<RouterNatLogConfigFilter> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    public RouterNatLogConfigArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<RouterNatLogConfigFilter> filter) {
        this.enable = enable;
        this.filter = filter;
    }

    private RouterNatLogConfigArgs() {
        this.enable = Output.empty();
        this.filter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<RouterNatLogConfigFilter> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }
        public Builder filter(@Nullable Output<RouterNatLogConfigFilter> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable RouterNatLogConfigFilter filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }        public RouterNatLogConfigArgs build() {
            return new RouterNatLogConfigArgs(enable, filter);
        }
    }
}
