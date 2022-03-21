// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterNatLogConfig {
    /**
     * Indicates whether or not to export logs.
     * 
     */
    private final Boolean enable;
    /**
     * Specifies the desired filtering of logs on this NAT.
     * Possible values are `ERRORS_ONLY`, `TRANSLATIONS_ONLY`, and `ALL`.
     * 
     */
    private final String filter;

    @CustomType.Constructor
    private RouterNatLogConfig(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("filter") String filter) {
        this.enable = enable;
        this.filter = filter;
    }

    /**
     * Indicates whether or not to export logs.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * Specifies the desired filtering of logs on this NAT.
     * Possible values are `ERRORS_ONLY`, `TRANSLATIONS_ONLY`, and `ALL`.
     * 
    */
    public String getFilter() {
        return this.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }        public RouterNatLogConfig build() {
            return new RouterNatLogConfig(enable, filter);
        }
    }
}
