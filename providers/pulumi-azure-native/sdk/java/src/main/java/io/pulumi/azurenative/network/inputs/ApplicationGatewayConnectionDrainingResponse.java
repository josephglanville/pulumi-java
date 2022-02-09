// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class ApplicationGatewayConnectionDrainingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayConnectionDrainingResponse Empty = new ApplicationGatewayConnectionDrainingResponse();

    @InputImport(name="drainTimeoutInSec", required=true)
    private final Integer drainTimeoutInSec;

    public Integer getDrainTimeoutInSec() {
        return this.drainTimeoutInSec;
    }

    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ApplicationGatewayConnectionDrainingResponse(
        Integer drainTimeoutInSec,
        Boolean enabled) {
        this.drainTimeoutInSec = Objects.requireNonNull(drainTimeoutInSec, "expected parameter 'drainTimeoutInSec' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ApplicationGatewayConnectionDrainingResponse() {
        this.drainTimeoutInSec = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayConnectionDrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer drainTimeoutInSec;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayConnectionDrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainTimeoutInSec = defaults.drainTimeoutInSec;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDrainTimeoutInSec(Integer drainTimeoutInSec) {
            this.drainTimeoutInSec = Objects.requireNonNull(drainTimeoutInSec);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public ApplicationGatewayConnectionDrainingResponse build() {
            return new ApplicationGatewayConnectionDrainingResponse(drainTimeoutInSec, enabled);
        }
    }
}
