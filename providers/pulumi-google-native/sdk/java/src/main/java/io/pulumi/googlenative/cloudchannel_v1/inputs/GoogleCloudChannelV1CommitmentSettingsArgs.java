// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1RenewalSettingsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Commitment settings for commitment-based offers.
 * 
 */
public final class GoogleCloudChannelV1CommitmentSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1CommitmentSettingsArgs Empty = new GoogleCloudChannelV1CommitmentSettingsArgs();

    /**
     * Optional. Renewal settings applicable for a commitment-based Offer.
     * 
     */
    @Import(name="renewalSettings")
      private final @Nullable Output<GoogleCloudChannelV1RenewalSettingsArgs> renewalSettings;

    public Output<GoogleCloudChannelV1RenewalSettingsArgs> getRenewalSettings() {
        return this.renewalSettings == null ? Codegen.empty() : this.renewalSettings;
    }

    public GoogleCloudChannelV1CommitmentSettingsArgs(@Nullable Output<GoogleCloudChannelV1RenewalSettingsArgs> renewalSettings) {
        this.renewalSettings = renewalSettings;
    }

    private GoogleCloudChannelV1CommitmentSettingsArgs() {
        this.renewalSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1CommitmentSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudChannelV1RenewalSettingsArgs> renewalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1CommitmentSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.renewalSettings = defaults.renewalSettings;
        }

        public Builder renewalSettings(@Nullable Output<GoogleCloudChannelV1RenewalSettingsArgs> renewalSettings) {
            this.renewalSettings = renewalSettings;
            return this;
        }
        public Builder renewalSettings(@Nullable GoogleCloudChannelV1RenewalSettingsArgs renewalSettings) {
            this.renewalSettings = Codegen.ofNullable(renewalSettings);
            return this;
        }        public GoogleCloudChannelV1CommitmentSettingsArgs build() {
            return new GoogleCloudChannelV1CommitmentSettingsArgs(renewalSettings);
        }
    }
}
