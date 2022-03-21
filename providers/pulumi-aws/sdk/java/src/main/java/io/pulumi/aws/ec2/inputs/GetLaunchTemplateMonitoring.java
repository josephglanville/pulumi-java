// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetLaunchTemplateMonitoring extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateMonitoring Empty = new GetLaunchTemplateMonitoring();

    /**
     * Whether Nitro Enclaves are enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetLaunchTemplateMonitoring(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetLaunchTemplateMonitoring() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateMonitoring defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetLaunchTemplateMonitoring build() {
            return new GetLaunchTemplateMonitoring(enabled);
        }
    }
}
