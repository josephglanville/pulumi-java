// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingPathResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingPathResponse Empty = new StreamingPathResponse();

    @InputImport(name="encryptionScheme", required=true)
    private final String encryptionScheme;

    public String getEncryptionScheme() {
        return this.encryptionScheme;
    }

    @InputImport(name="paths")
    private final @Nullable List<String> paths;

    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }

    @InputImport(name="streamingProtocol", required=true)
    private final String streamingProtocol;

    public String getStreamingProtocol() {
        return this.streamingProtocol;
    }

    public StreamingPathResponse(
        String encryptionScheme,
        @Nullable List<String> paths,
        String streamingProtocol) {
        this.encryptionScheme = Objects.requireNonNull(encryptionScheme, "expected parameter 'encryptionScheme' to be non-null");
        this.paths = paths;
        this.streamingProtocol = Objects.requireNonNull(streamingProtocol, "expected parameter 'streamingProtocol' to be non-null");
    }

    private StreamingPathResponse() {
        this.encryptionScheme = null;
        this.paths = List.of();
        this.streamingProtocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionScheme;
        private @Nullable List<String> paths;
        private String streamingProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionScheme = defaults.encryptionScheme;
    	      this.paths = defaults.paths;
    	      this.streamingProtocol = defaults.streamingProtocol;
        }

        public Builder setEncryptionScheme(String encryptionScheme) {
            this.encryptionScheme = Objects.requireNonNull(encryptionScheme);
            return this;
        }

        public Builder setPaths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setStreamingProtocol(String streamingProtocol) {
            this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
            return this;
        }

        public StreamingPathResponse build() {
            return new StreamingPathResponse(encryptionScheme, paths, streamingProtocol);
        }
    }
}
