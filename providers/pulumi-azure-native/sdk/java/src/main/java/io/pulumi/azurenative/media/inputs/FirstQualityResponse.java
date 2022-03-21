// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Filter First Quality
 * 
 */
public final class FirstQualityResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirstQualityResponse Empty = new FirstQualityResponse();

    /**
     * The first quality bitrate.
     * 
     */
    @Import(name="bitrate", required=true)
      private final Integer bitrate;

    public Integer getBitrate() {
        return this.bitrate;
    }

    public FirstQualityResponse(Integer bitrate) {
        this.bitrate = Objects.requireNonNull(bitrate, "expected parameter 'bitrate' to be non-null");
    }

    private FirstQualityResponse() {
        this.bitrate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirstQualityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrate;

        public Builder() {
    	      // Empty
        }

        public Builder(FirstQualityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
        }

        public Builder bitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }        public FirstQualityResponse build() {
            return new FirstQualityResponse(bitrate);
        }
    }
}
