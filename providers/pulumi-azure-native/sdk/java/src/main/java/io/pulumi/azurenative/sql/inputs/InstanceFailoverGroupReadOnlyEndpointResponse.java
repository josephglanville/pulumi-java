// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-only endpoint of the failover group instance.
 * 
 */
public final class InstanceFailoverGroupReadOnlyEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceFailoverGroupReadOnlyEndpointResponse Empty = new InstanceFailoverGroupReadOnlyEndpointResponse();

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    @InputImport(name="failoverPolicy")
      private final @Nullable String failoverPolicy;

    public Optional<String> getFailoverPolicy() {
        return this.failoverPolicy == null ? Optional.empty() : Optional.ofNullable(this.failoverPolicy);
    }

    public InstanceFailoverGroupReadOnlyEndpointResponse(@Nullable String failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
    }

    private InstanceFailoverGroupReadOnlyEndpointResponse() {
        this.failoverPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverGroupReadOnlyEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String failoverPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverGroupReadOnlyEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
        }

        public Builder setFailoverPolicy(@Nullable String failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }
        public InstanceFailoverGroupReadOnlyEndpointResponse build() {
            return new InstanceFailoverGroupReadOnlyEndpointResponse(failoverPolicy);
        }
    }
}
