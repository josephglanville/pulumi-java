// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyFrameOptions extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyFrameOptions Empty = new ResponseHeadersPolicyFrameOptions();

    @InputImport(name="frameOption", required=true)
      private final String frameOption;

    public String getFrameOption() {
        return this.frameOption;
    }

    @InputImport(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    public ResponseHeadersPolicyFrameOptions(
        String frameOption,
        Boolean override) {
        this.frameOption = Objects.requireNonNull(frameOption, "expected parameter 'frameOption' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicyFrameOptions() {
        this.frameOption = null;
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyFrameOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frameOption;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyFrameOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameOption = defaults.frameOption;
    	      this.override = defaults.override;
        }

        public Builder setFrameOption(String frameOption) {
            this.frameOption = Objects.requireNonNull(frameOption);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public ResponseHeadersPolicyFrameOptions build() {
            return new ResponseHeadersPolicyFrameOptions(frameOption, override);
        }
    }
}
