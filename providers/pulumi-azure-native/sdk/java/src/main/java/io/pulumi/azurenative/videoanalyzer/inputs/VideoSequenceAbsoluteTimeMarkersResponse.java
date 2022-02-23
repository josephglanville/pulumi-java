// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A sequence of absolute datetime ranges as a string. The datetime values should follow IS08601, and the sum of the ranges should add up to 24 hours or less. Currently, there can be only one range specified in the sequence.
 * 
 */
public final class VideoSequenceAbsoluteTimeMarkersResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoSequenceAbsoluteTimeMarkersResponse Empty = new VideoSequenceAbsoluteTimeMarkersResponse();

    /**
     * The sequence of datetime ranges. Example: '[["2021-10-05T03:30:00Z", "2021-10-05T03:40:00Z"]]'.
     * 
     */
    @InputImport(name="ranges", required=true)
      private final String ranges;

    public String getRanges() {
        return this.ranges;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public VideoSequenceAbsoluteTimeMarkersResponse(
        String ranges,
        String type) {
        this.ranges = Objects.requireNonNull(ranges, "expected parameter 'ranges' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VideoSequenceAbsoluteTimeMarkersResponse() {
        this.ranges = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSequenceAbsoluteTimeMarkersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ranges;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSequenceAbsoluteTimeMarkersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.type = defaults.type;
        }

        public Builder setRanges(String ranges) {
            this.ranges = Objects.requireNonNull(ranges);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VideoSequenceAbsoluteTimeMarkersResponse build() {
            return new VideoSequenceAbsoluteTimeMarkersResponse(ranges, type);
        }
    }
}
