// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class VideoFlagsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoFlagsResponse Empty = new VideoFlagsResponse();

    @InputImport(name="canStream", required=true)
    private final Boolean canStream;

    public Boolean getCanStream() {
        return this.canStream;
    }

    @InputImport(name="hasData", required=true)
    private final Boolean hasData;

    public Boolean getHasData() {
        return this.hasData;
    }

    @InputImport(name="isRecording", required=true)
    private final Boolean isRecording;

    public Boolean getIsRecording() {
        return this.isRecording;
    }

    public VideoFlagsResponse(
        Boolean canStream,
        Boolean hasData,
        Boolean isRecording) {
        this.canStream = Objects.requireNonNull(canStream, "expected parameter 'canStream' to be non-null");
        this.hasData = Objects.requireNonNull(hasData, "expected parameter 'hasData' to be non-null");
        this.isRecording = Objects.requireNonNull(isRecording, "expected parameter 'isRecording' to be non-null");
    }

    private VideoFlagsResponse() {
        this.canStream = null;
        this.hasData = null;
        this.isRecording = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canStream;
        private Boolean hasData;
        private Boolean isRecording;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoFlagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canStream = defaults.canStream;
    	      this.hasData = defaults.hasData;
    	      this.isRecording = defaults.isRecording;
        }

        public Builder setCanStream(Boolean canStream) {
            this.canStream = Objects.requireNonNull(canStream);
            return this;
        }

        public Builder setHasData(Boolean hasData) {
            this.hasData = Objects.requireNonNull(hasData);
            return this;
        }

        public Builder setIsRecording(Boolean isRecording) {
            this.isRecording = Objects.requireNonNull(isRecording);
            return this;
        }

        public VideoFlagsResponse build() {
            return new VideoFlagsResponse(canStream, hasData, isRecording);
        }
    }
}
