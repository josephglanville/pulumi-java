// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-write endpoint of the failover group instance.
 * 
 */
public final class FailoverGroupReadWriteEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final FailoverGroupReadWriteEndpointResponse Empty = new FailoverGroupReadWriteEndpointResponse();

    /**
     * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    @InputImport(name="failoverPolicy", required=true)
      private final String failoverPolicy;

    public String getFailoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    @InputImport(name="failoverWithDataLossGracePeriodMinutes")
      private final @Nullable Integer failoverWithDataLossGracePeriodMinutes;

    public Optional<Integer> getFailoverWithDataLossGracePeriodMinutes() {
        return this.failoverWithDataLossGracePeriodMinutes == null ? Optional.empty() : Optional.ofNullable(this.failoverWithDataLossGracePeriodMinutes);
    }

    public FailoverGroupReadWriteEndpointResponse(
        String failoverPolicy,
        @Nullable Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverPolicy = Objects.requireNonNull(failoverPolicy, "expected parameter 'failoverPolicy' to be non-null");
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
    }

    private FailoverGroupReadWriteEndpointResponse() {
        this.failoverPolicy = null;
        this.failoverWithDataLossGracePeriodMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReadWriteEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failoverPolicy;
        private @Nullable Integer failoverWithDataLossGracePeriodMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupReadWriteEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.failoverWithDataLossGracePeriodMinutes = defaults.failoverWithDataLossGracePeriodMinutes;
        }

        public Builder setFailoverPolicy(String failoverPolicy) {
            this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
            return this;
        }

        public Builder setFailoverWithDataLossGracePeriodMinutes(@Nullable Integer failoverWithDataLossGracePeriodMinutes) {
            this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
            return this;
        }
        public FailoverGroupReadWriteEndpointResponse build() {
            return new FailoverGroupReadWriteEndpointResponse(failoverPolicy, failoverWithDataLossGracePeriodMinutes);
        }
    }
}
