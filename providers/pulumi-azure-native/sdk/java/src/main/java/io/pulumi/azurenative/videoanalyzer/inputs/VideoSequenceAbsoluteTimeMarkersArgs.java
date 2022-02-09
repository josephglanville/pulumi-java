// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VideoSequenceAbsoluteTimeMarkersArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoSequenceAbsoluteTimeMarkersArgs Empty = new VideoSequenceAbsoluteTimeMarkersArgs();

    @InputImport(name="ranges", required=true)
    private final Input<String> ranges;

    public Input<String> getRanges() {
        return this.ranges;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public VideoSequenceAbsoluteTimeMarkersArgs(
        Input<String> ranges,
        Input<String> type) {
        this.ranges = Objects.requireNonNull(ranges, "expected parameter 'ranges' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VideoSequenceAbsoluteTimeMarkersArgs() {
        this.ranges = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ranges;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.type = defaults.type;
        }

        public Builder setRanges(Input<String> ranges) {
            this.ranges = Objects.requireNonNull(ranges);
            return this;
        }

        public Builder setRanges(String ranges) {
            this.ranges = Input.of(Objects.requireNonNull(ranges));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public VideoSequenceAbsoluteTimeMarkersArgs build() {
            return new VideoSequenceAbsoluteTimeMarkersArgs(ranges, type);
        }
    }
}
