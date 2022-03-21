// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverGroupReadOnlyEndpointResponse {
    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    private final @Nullable String failoverPolicy;

    @CustomType.Constructor
    private FailoverGroupReadOnlyEndpointResponse(@CustomType.Parameter("failoverPolicy") @Nullable String failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
    }

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
    */
    public Optional<String> getFailoverPolicy() {
        return Optional.ofNullable(this.failoverPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReadOnlyEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String failoverPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupReadOnlyEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
        }

        public Builder failoverPolicy(@Nullable String failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }        public FailoverGroupReadOnlyEndpointResponse build() {
            return new FailoverGroupReadOnlyEndpointResponse(failoverPolicy);
        }
    }
}
