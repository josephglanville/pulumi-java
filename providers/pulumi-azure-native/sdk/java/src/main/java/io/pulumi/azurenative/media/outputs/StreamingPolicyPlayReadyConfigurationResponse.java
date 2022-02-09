// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamingPolicyPlayReadyConfigurationResponse {
    private final @Nullable String customLicenseAcquisitionUrlTemplate;
    private final @Nullable String playReadyCustomAttributes;

    @OutputCustomType.Constructor({"customLicenseAcquisitionUrlTemplate","playReadyCustomAttributes"})
    private StreamingPolicyPlayReadyConfigurationResponse(
        @Nullable String customLicenseAcquisitionUrlTemplate,
        @Nullable String playReadyCustomAttributes) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        this.playReadyCustomAttributes = playReadyCustomAttributes;
    }

    public Optional<String> getCustomLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }
    public Optional<String> getPlayReadyCustomAttributes() {
        return Optional.ofNullable(this.playReadyCustomAttributes);
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
