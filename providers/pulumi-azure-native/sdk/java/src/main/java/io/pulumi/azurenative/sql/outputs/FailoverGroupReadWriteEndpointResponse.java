// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FailoverGroupReadWriteEndpointResponse {
    private final String failoverPolicy;
    private final @Nullable Integer failoverWithDataLossGracePeriodMinutes;

    @OutputCustomType.Constructor({"failoverPolicy","failoverWithDataLossGracePeriodMinutes"})
    private FailoverGroupReadWriteEndpointResponse(
        String failoverPolicy,
        @Nullable Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
    }

    public String getFailoverPolicy() {
        return this.failoverPolicy;
    }
    public Optional<Integer> getFailoverWithDataLossGracePeriodMinutes() {
        return Optional.ofNullable(this.failoverWithDataLossGracePeriodMinutes);
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
