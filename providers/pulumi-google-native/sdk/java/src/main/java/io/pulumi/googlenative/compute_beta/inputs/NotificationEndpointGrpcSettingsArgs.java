// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a gRPC setting that describes one gRPC notification endpoint and the retry duration attempting to send notification to this endpoint.
 * 
 */
public final class NotificationEndpointGrpcSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationEndpointGrpcSettingsArgs Empty = new NotificationEndpointGrpcSettingsArgs();

    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<String> authority;

    public Output<String> getAuthority() {
        return this.authority == null ? Output.empty() : this.authority;
    }

    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    @Import(name="payloadName")
      private final @Nullable Output<String> payloadName;

    public Output<String> getPayloadName() {
        return this.payloadName == null ? Output.empty() : this.payloadName;
    }

    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    @Import(name="resendInterval")
      private final @Nullable Output<DurationArgs> resendInterval;

    public Output<DurationArgs> getResendInterval() {
        return this.resendInterval == null ? Output.empty() : this.resendInterval;
    }

    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    @Import(name="retryDurationSec")
      private final @Nullable Output<Integer> retryDurationSec;

    public Output<Integer> getRetryDurationSec() {
        return this.retryDurationSec == null ? Output.empty() : this.retryDurationSec;
    }

    public NotificationEndpointGrpcSettingsArgs(
        @Nullable Output<String> authority,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> payloadName,
        @Nullable Output<DurationArgs> resendInterval,
        @Nullable Output<Integer> retryDurationSec) {
        this.authority = authority;
        this.endpoint = endpoint;
        this.payloadName = payloadName;
        this.resendInterval = resendInterval;
        this.retryDurationSec = retryDurationSec;
    }

    private NotificationEndpointGrpcSettingsArgs() {
        this.authority = Output.empty();
        this.endpoint = Output.empty();
        this.payloadName = Output.empty();
        this.resendInterval = Output.empty();
        this.retryDurationSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointGrpcSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authority;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> payloadName;
        private @Nullable Output<DurationArgs> resendInterval;
        private @Nullable Output<Integer> retryDurationSec;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointGrpcSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.payloadName = defaults.payloadName;
    	      this.resendInterval = defaults.resendInterval;
    	      this.retryDurationSec = defaults.retryDurationSec;
        }

        public Builder authority(@Nullable Output<String> authority) {
            this.authority = authority;
            return this;
        }
        public Builder authority(@Nullable String authority) {
            this.authority = Output.ofNullable(authority);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder payloadName(@Nullable Output<String> payloadName) {
            this.payloadName = payloadName;
            return this;
        }
        public Builder payloadName(@Nullable String payloadName) {
            this.payloadName = Output.ofNullable(payloadName);
            return this;
        }
        public Builder resendInterval(@Nullable Output<DurationArgs> resendInterval) {
            this.resendInterval = resendInterval;
            return this;
        }
        public Builder resendInterval(@Nullable DurationArgs resendInterval) {
            this.resendInterval = Output.ofNullable(resendInterval);
            return this;
        }
        public Builder retryDurationSec(@Nullable Output<Integer> retryDurationSec) {
            this.retryDurationSec = retryDurationSec;
            return this;
        }
        public Builder retryDurationSec(@Nullable Integer retryDurationSec) {
            this.retryDurationSec = Output.ofNullable(retryDurationSec);
            return this;
        }        public NotificationEndpointGrpcSettingsArgs build() {
            return new NotificationEndpointGrpcSettingsArgs(authority, endpoint, payloadName, resendInterval, retryDurationSec);
        }
    }
}
