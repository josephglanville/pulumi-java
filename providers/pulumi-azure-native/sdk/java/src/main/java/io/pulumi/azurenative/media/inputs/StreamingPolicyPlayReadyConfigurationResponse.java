// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of PlayReady in Streaming Policy
 * 
 */
public final class StreamingPolicyPlayReadyConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyPlayReadyConfigurationResponse Empty = new StreamingPolicyPlayReadyConfigurationResponse();

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @InputImport(name="customLicenseAcquisitionUrlTemplate")
      private final @Nullable String customLicenseAcquisitionUrlTemplate;

    public Optional<String> getCustomLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate == null ? Optional.empty() : Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    /**
     * Custom attributes for PlayReady
     * 
     */
    @InputImport(name="playReadyCustomAttributes")
      private final @Nullable String playReadyCustomAttributes;

    public Optional<String> getPlayReadyCustomAttributes() {
        return this.playReadyCustomAttributes == null ? Optional.empty() : Optional.ofNullable(this.playReadyCustomAttributes);
    }

    public StreamingPolicyPlayReadyConfigurationResponse(
        @Nullable String customLicenseAcquisitionUrlTemplate,
        @Nullable String playReadyCustomAttributes) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        this.playReadyCustomAttributes = playReadyCustomAttributes;
    }

    private StreamingPolicyPlayReadyConfigurationResponse() {
        this.customLicenseAcquisitionUrlTemplate = null;
        this.playReadyCustomAttributes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customLicenseAcquisitionUrlTemplate;
        private @Nullable String playReadyCustomAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
    	      this.playReadyCustomAttributes = defaults.playReadyCustomAttributes;
        }

        public Builder setCustomLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        public Builder setPlayReadyCustomAttributes(@Nullable String playReadyCustomAttributes) {
            this.playReadyCustomAttributes = playReadyCustomAttributes;
            return this;
        }
        public StreamingPolicyPlayReadyConfigurationResponse build() {
            return new StreamingPolicyPlayReadyConfigurationResponse(customLicenseAcquisitionUrlTemplate, playReadyCustomAttributes);
        }
    }
}
