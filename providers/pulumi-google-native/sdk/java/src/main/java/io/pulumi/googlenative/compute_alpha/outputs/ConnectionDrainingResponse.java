// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ConnectionDrainingResponse {
    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    private final Integer drainingTimeoutSec;

    @CustomType.Constructor
    private ConnectionDrainingResponse(@CustomType.Parameter("drainingTimeoutSec") Integer drainingTimeoutSec) {
        this.drainingTimeoutSec = drainingTimeoutSec;
    }

    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
    */
    public Integer getDrainingTimeoutSec() {
        return this.drainingTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionDrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer drainingTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionDrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainingTimeoutSec = defaults.drainingTimeoutSec;
        }

        public Builder drainingTimeoutSec(Integer drainingTimeoutSec) {
            this.drainingTimeoutSec = Objects.requireNonNull(drainingTimeoutSec);
            return this;
        }        public ConnectionDrainingResponse build() {
            return new ConnectionDrainingResponse(drainingTimeoutSec);
        }
    }
}
