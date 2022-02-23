// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.EnforceCertificateNameCheckEnabledState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings that apply to all backend pools.
 * 
 */
public final class BackendPoolsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendPoolsSettingsArgs Empty = new BackendPoolsSettingsArgs();

    /**
     * Whether to enforce certificate name check on HTTPS requests to all backend pools. No effect on non-HTTPS requests.
     * 
     */
    @InputImport(name="enforceCertificateNameCheck")
      private final @Nullable Input<Either<String,EnforceCertificateNameCheckEnabledState>> enforceCertificateNameCheck;

    public Input<Either<String,EnforceCertificateNameCheckEnabledState>> getEnforceCertificateNameCheck() {
        return this.enforceCertificateNameCheck == null ? Input.empty() : this.enforceCertificateNameCheck;
    }

    /**
     * Send and receive timeout on forwarding request to the backend. When timeout is reached, the request fails and returns.
     * 
     */
    @InputImport(name="sendRecvTimeoutSeconds")
      private final @Nullable Input<Integer> sendRecvTimeoutSeconds;

    public Input<Integer> getSendRecvTimeoutSeconds() {
        return this.sendRecvTimeoutSeconds == null ? Input.empty() : this.sendRecvTimeoutSeconds;
    }

    public BackendPoolsSettingsArgs(
        @Nullable Input<Either<String,EnforceCertificateNameCheckEnabledState>> enforceCertificateNameCheck,
        @Nullable Input<Integer> sendRecvTimeoutSeconds) {
        this.enforceCertificateNameCheck = enforceCertificateNameCheck == null ? Input.ofLeft("Enabled") : enforceCertificateNameCheck;
        this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
    }

    private BackendPoolsSettingsArgs() {
        this.enforceCertificateNameCheck = Input.empty();
        this.sendRecvTimeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPoolsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,EnforceCertificateNameCheckEnabledState>> enforceCertificateNameCheck;
        private @Nullable Input<Integer> sendRecvTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPoolsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceCertificateNameCheck = defaults.enforceCertificateNameCheck;
    	      this.sendRecvTimeoutSeconds = defaults.sendRecvTimeoutSeconds;
        }

        public Builder setEnforceCertificateNameCheck(@Nullable Input<Either<String,EnforceCertificateNameCheckEnabledState>> enforceCertificateNameCheck) {
            this.enforceCertificateNameCheck = enforceCertificateNameCheck;
            return this;
        }

        public Builder setEnforceCertificateNameCheck(@Nullable Either<String,EnforceCertificateNameCheckEnabledState> enforceCertificateNameCheck) {
            this.enforceCertificateNameCheck = Input.ofNullable(enforceCertificateNameCheck);
            return this;
        }

        public Builder setSendRecvTimeoutSeconds(@Nullable Input<Integer> sendRecvTimeoutSeconds) {
            this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
            return this;
        }

        public Builder setSendRecvTimeoutSeconds(@Nullable Integer sendRecvTimeoutSeconds) {
            this.sendRecvTimeoutSeconds = Input.ofNullable(sendRecvTimeoutSeconds);
            return this;
        }
        public BackendPoolsSettingsArgs build() {
            return new BackendPoolsSettingsArgs(enforceCertificateNameCheck, sendRecvTimeoutSeconds);
        }
    }
}
