// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapDefaultRouteActionFaultInjectionPolicyAbort {
    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    private final @Nullable Integer httpStatus;
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    private final @Nullable Double percentage;

    @CustomType.Constructor
    private URLMapDefaultRouteActionFaultInjectionPolicyAbort(
        @CustomType.Parameter("httpStatus") @Nullable Integer httpStatus,
        @CustomType.Parameter("percentage") @Nullable Double percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
    */
    public Optional<Integer> getHttpStatus() {
        return Optional.ofNullable(this.httpStatus);
    }
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
    */
    public Optional<Double> getPercentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyAbort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer httpStatus;
        private @Nullable Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyAbort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = percentage;
            return this;
        }        public URLMapDefaultRouteActionFaultInjectionPolicyAbort build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyAbort(httpStatus, percentage);
        }
    }
}
