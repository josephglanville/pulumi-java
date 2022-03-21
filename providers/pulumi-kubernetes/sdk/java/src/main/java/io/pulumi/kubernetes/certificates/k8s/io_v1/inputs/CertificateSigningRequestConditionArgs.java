// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
 * 
 */
public final class CertificateSigningRequestConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestConditionArgs Empty = new CertificateSigningRequestConditionArgs();

    /**
     * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
     * 
     */
    @Import(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Output.empty() : this.lastTransitionTime;
    }

    /**
     * lastUpdateTime is the time of the last update to this condition
     * 
     */
    @Import(name="lastUpdateTime")
      private final @Nullable Output<String> lastUpdateTime;

    public Output<String> getLastUpdateTime() {
        return this.lastUpdateTime == null ? Output.empty() : this.lastUpdateTime;
    }

    /**
     * message contains a human readable message with details about the request state
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * reason indicates a brief reason for the request state
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> getReason() {
        return this.reason == null ? Output.empty() : this.reason;
    }

    /**
     * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    /**
     * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
     * 
     * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * 
     * Possible enum values:
     *  - `"Approved"` Approved indicates the request was approved and should be issued by the signer.
     *  - `"Denied"` Denied indicates the request was denied and should not be issued by the signer.
     *  - `"Failed"` Failed indicates the signer failed to issue the certificate.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CertificateSigningRequestConditionArgs(
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> lastUpdateTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        Output<String> status,
        Output<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CertificateSigningRequestConditionArgs() {
        this.lastTransitionTime = Output.empty();
        this.lastUpdateTime = Output.empty();
        this.message = Output.empty();
        this.reason = Output.empty();
        this.status = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> lastUpdateTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private Output<String> status;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Output.ofNullable(lastTransitionTime);
            return this;
        }
        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Builder lastUpdateTime(@Nullable String lastUpdateTime) {
            this.lastUpdateTime = Output.ofNullable(lastUpdateTime);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Output.ofNullable(reason);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CertificateSigningRequestConditionArgs build() {
            return new CertificateSigningRequestConditionArgs(lastTransitionTime, lastUpdateTime, message, reason, status, type);
        }
    }
}
