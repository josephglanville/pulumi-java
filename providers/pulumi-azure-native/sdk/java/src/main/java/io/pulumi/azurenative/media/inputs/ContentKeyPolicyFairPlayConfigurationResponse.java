// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentKeyPolicyFairPlayConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyFairPlayConfigurationResponse Empty = new ContentKeyPolicyFairPlayConfigurationResponse();

    @InputImport(name="ask", required=true)
    private final String ask;

    public String getAsk() {
        return this.ask;
    }

    @InputImport(name="fairPlayPfx", required=true)
    private final String fairPlayPfx;

    public String getFairPlayPfx() {
        return this.fairPlayPfx;
    }

    @InputImport(name="fairPlayPfxPassword", required=true)
    private final String fairPlayPfxPassword;

    public String getFairPlayPfxPassword() {
        return this.fairPlayPfxPassword;
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="offlineRentalConfiguration")
    private final @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;

    public Optional<ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse> getOfflineRentalConfiguration() {
        return this.offlineRentalConfiguration == null ? Optional.empty() : Optional.ofNullable(this.offlineRentalConfiguration);
    }

    @InputImport(name="rentalAndLeaseKeyType", required=true)
    private final String rentalAndLeaseKeyType;

    public String getRentalAndLeaseKeyType() {
        return this.rentalAndLeaseKeyType;
    }

    @InputImport(name="rentalDuration", required=true)
    private final Double rentalDuration;

    public Double getRentalDuration() {
        return this.rentalDuration;
    }

    public ContentKeyPolicyFairPlayConfigurationResponse(
        String ask,
        String fairPlayPfx,
        String fairPlayPfxPassword,
        String odataType,
        @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration,
        String rentalAndLeaseKeyType,
        Double rentalDuration) {
        this.ask = Objects.requireNonNull(ask, "expected parameter 'ask' to be non-null");
        this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx, "expected parameter 'fairPlayPfx' to be non-null");
        this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword, "expected parameter 'fairPlayPfxPassword' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.offlineRentalConfiguration = offlineRentalConfiguration;
        this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType, "expected parameter 'rentalAndLeaseKeyType' to be non-null");
        this.rentalDuration = Objects.requireNonNull(rentalDuration, "expected parameter 'rentalDuration' to be non-null");
    }

    private ContentKeyPolicyFairPlayConfigurationResponse() {
        this.ask = null;
        this.fairPlayPfx = null;
        this.fairPlayPfxPassword = null;
        this.odataType = null;
        this.offlineRentalConfiguration = null;
        this.rentalAndLeaseKeyType = null;
        this.rentalDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ask;
        private String fairPlayPfx;
        private String fairPlayPfxPassword;
        private String odataType;
        private @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;
        private String rentalAndLeaseKeyType;
        private Double rentalDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ask = defaults.ask;
    	      this.fairPlayPfx = defaults.fairPlayPfx;
    	      this.fairPlayPfxPassword = defaults.fairPlayPfxPassword;
    	      this.odataType = defaults.odataType;
    	      this.offlineRentalConfiguration = defaults.offlineRentalConfiguration;
    	      this.rentalAndLeaseKeyType = defaults.rentalAndLeaseKeyType;
    	      this.rentalDuration = defaults.rentalDuration;
        }

        public Builder setAsk(String ask) {
            this.ask = Objects.requireNonNull(ask);
            return this;
        }

        public Builder setFairPlayPfx(String fairPlayPfx) {
            this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx);
            return this;
        }

        public Builder setFairPlayPfxPassword(String fairPlayPfxPassword) {
            this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOfflineRentalConfiguration(@Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration) {
            this.offlineRentalConfiguration = offlineRentalConfiguration;
            return this;
        }

        public Builder setRentalAndLeaseKeyType(String rentalAndLeaseKeyType) {
            this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType);
            return this;
        }

        public Builder setRentalDuration(Double rentalDuration) {
            this.rentalDuration = Objects.requireNonNull(rentalDuration);
            return this;
        }

        public ContentKeyPolicyFairPlayConfigurationResponse build() {
            return new ContentKeyPolicyFairPlayConfigurationResponse(ask, fairPlayPfx, fairPlayPfxPassword, odataType, offlineRentalConfiguration, rentalAndLeaseKeyType, rentalDuration);
        }
    }
}
