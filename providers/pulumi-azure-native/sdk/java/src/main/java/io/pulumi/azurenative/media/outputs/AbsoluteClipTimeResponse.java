// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AbsoluteClipTimeResponse {
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AbsoluteClipTime'.
     * 
     */
    private final String odataType;
    /**
     * The time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private AbsoluteClipTimeResponse(
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("time") String time) {
        this.odataType = odataType;
        this.time = time;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AbsoluteClipTime'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     * 
    */
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteClipTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteClipTimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public AbsoluteClipTimeResponse build() {
            return new AbsoluteClipTimeResponse(odataType, time);
        }
    }
}
