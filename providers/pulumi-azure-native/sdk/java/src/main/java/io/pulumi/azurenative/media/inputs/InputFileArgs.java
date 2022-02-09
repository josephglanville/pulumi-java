// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InputFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputFileArgs Empty = new InputFileArgs();

    @InputImport(name="filename")
    private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    @InputImport(name="includedTracks")
    private final @Nullable Input<List<Object>> includedTracks;

    public Input<List<Object>> getIncludedTracks() {
        return this.includedTracks == null ? Input.empty() : this.includedTracks;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public InputFileArgs(
        @Nullable Input<String> filename,
        @Nullable Input<List<Object>> includedTracks,
        Input<String> odataType) {
        this.filename = filename;
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private InputFileArgs() {
        this.filename = Input.empty();
        this.includedTracks = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> filename;
        private @Nullable Input<List<Object>> includedTracks;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(InputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filename = defaults.filename;
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setFilename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public Builder setIncludedTracks(@Nullable Input<List<Object>> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = Input.ofNullable(includedTracks);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public InputFileArgs build() {
            return new InputFileArgs(filename, includedTracks, odataType);
        }
    }
}
