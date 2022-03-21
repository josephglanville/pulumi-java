// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Ad break.
 * 
 */
public final class AdBreakResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdBreakResponse Empty = new AdBreakResponse();

    /**
     * Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`.
     * 
     */
    @Import(name="startTimeOffset", required=true)
      private final String startTimeOffset;

    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    public AdBreakResponse(String startTimeOffset) {
        this.startTimeOffset = Objects.requireNonNull(startTimeOffset, "expected parameter 'startTimeOffset' to be non-null");
    }

    private AdBreakResponse() {
        this.startTimeOffset = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdBreakResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(AdBreakResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder startTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }        public AdBreakResponse build() {
            return new AdBreakResponse(startTimeOffset);
        }
    }
}
