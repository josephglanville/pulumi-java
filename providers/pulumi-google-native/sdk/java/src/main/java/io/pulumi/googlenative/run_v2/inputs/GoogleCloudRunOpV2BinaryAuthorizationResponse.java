// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Settings for Binary Authorization feature.
 * 
 */
public final class GoogleCloudRunOpV2BinaryAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2BinaryAuthorizationResponse Empty = new GoogleCloudRunOpV2BinaryAuthorizationResponse();

    /**
     * If present, indicates to use Breakglass using this justification. If use_default is False, then it must be empty. For more information on breakglass, see https://cloud.google.com/binary-authorization/docs/using-breakglass
     * 
     */
    @Import(name="breakglassJustification", required=true)
      private final String breakglassJustification;

    public String getBreakglassJustification() {
        return this.breakglassJustification;
    }

    /**
     * If True, indicates to use the default project's binary authorization policy. If False, binary authorization will be disabled.
     * 
     */
    @Import(name="useDefault", required=true)
      private final Boolean useDefault;

    public Boolean getUseDefault() {
        return this.useDefault;
    }

    public GoogleCloudRunOpV2BinaryAuthorizationResponse(
        String breakglassJustification,
        Boolean useDefault) {
        this.breakglassJustification = Objects.requireNonNull(breakglassJustification, "expected parameter 'breakglassJustification' to be non-null");
        this.useDefault = Objects.requireNonNull(useDefault, "expected parameter 'useDefault' to be non-null");
    }

    private GoogleCloudRunOpV2BinaryAuthorizationResponse() {
        this.breakglassJustification = null;
        this.useDefault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String breakglassJustification;
        private Boolean useDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2BinaryAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.breakglassJustification = defaults.breakglassJustification;
    	      this.useDefault = defaults.useDefault;
        }

        public Builder breakglassJustification(String breakglassJustification) {
            this.breakglassJustification = Objects.requireNonNull(breakglassJustification);
            return this;
        }
        public Builder useDefault(Boolean useDefault) {
            this.useDefault = Objects.requireNonNull(useDefault);
            return this;
        }        public GoogleCloudRunOpV2BinaryAuthorizationResponse build() {
            return new GoogleCloudRunOpV2BinaryAuthorizationResponse(breakglassJustification, useDefault);
        }
    }
}
