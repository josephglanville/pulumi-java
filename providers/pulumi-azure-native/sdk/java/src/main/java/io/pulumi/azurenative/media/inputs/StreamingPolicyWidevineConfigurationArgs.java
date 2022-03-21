// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of Widevine in Streaming Policy
 * 
 */
public final class StreamingPolicyWidevineConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyWidevineConfigurationArgs Empty = new StreamingPolicyWidevineConfigurationArgs();

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
      private final @Nullable Output<String> customLicenseAcquisitionUrlTemplate;

    public Output<String> getCustomLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate == null ? Output.empty() : this.customLicenseAcquisitionUrlTemplate;
    }

    public StreamingPolicyWidevineConfigurationArgs(@Nullable Output<String> customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
    }

    private StreamingPolicyWidevineConfigurationArgs() {
        this.customLicenseAcquisitionUrlTemplate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyWidevineConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customLicenseAcquisitionUrlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyWidevineConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
        }

        public Builder customLicenseAcquisitionUrlTemplate(@Nullable Output<String> customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = Output.ofNullable(customLicenseAcquisitionUrlTemplate);
            return this;
        }        public StreamingPolicyWidevineConfigurationArgs build() {
            return new StreamingPolicyWidevineConfigurationArgs(customLicenseAcquisitionUrlTemplate);
        }
    }
}
