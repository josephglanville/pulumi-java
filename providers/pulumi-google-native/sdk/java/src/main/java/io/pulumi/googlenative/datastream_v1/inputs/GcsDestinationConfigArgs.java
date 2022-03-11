// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.AvroFileFormatArgs;
import io.pulumi.googlenative.datastream_v1.inputs.JsonFileFormatArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Google Cloud Storage destination configuration
 * 
 */
public final class GcsDestinationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcsDestinationConfigArgs Empty = new GcsDestinationConfigArgs();

    /**
     * AVRO file format configuration.
     * 
     */
    @InputImport(name="avroFileFormat")
      private final @Nullable Output<AvroFileFormatArgs> avroFileFormat;

    public Output<AvroFileFormatArgs> getAvroFileFormat() {
        return this.avroFileFormat == null ? Output.empty() : this.avroFileFormat;
    }

    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    @InputImport(name="fileRotationInterval")
      private final @Nullable Output<String> fileRotationInterval;

    public Output<String> getFileRotationInterval() {
        return this.fileRotationInterval == null ? Output.empty() : this.fileRotationInterval;
    }

    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    @InputImport(name="fileRotationMb")
      private final @Nullable Output<Integer> fileRotationMb;

    public Output<Integer> getFileRotationMb() {
        return this.fileRotationMb == null ? Output.empty() : this.fileRotationMb;
    }

    /**
     * JSON file format configuration.
     * 
     */
    @InputImport(name="jsonFileFormat")
      private final @Nullable Output<JsonFileFormatArgs> jsonFileFormat;

    public Output<JsonFileFormatArgs> getJsonFileFormat() {
        return this.jsonFileFormat == null ? Output.empty() : this.jsonFileFormat;
    }

    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    public GcsDestinationConfigArgs(
        @Nullable Output<AvroFileFormatArgs> avroFileFormat,
        @Nullable Output<String> fileRotationInterval,
        @Nullable Output<Integer> fileRotationMb,
        @Nullable Output<JsonFileFormatArgs> jsonFileFormat,
        @Nullable Output<String> path) {
        this.avroFileFormat = avroFileFormat;
        this.fileRotationInterval = fileRotationInterval;
        this.fileRotationMb = fileRotationMb;
        this.jsonFileFormat = jsonFileFormat;
        this.path = path;
    }

    private GcsDestinationConfigArgs() {
        this.avroFileFormat = Output.empty();
        this.fileRotationInterval = Output.empty();
        this.fileRotationMb = Output.empty();
        this.jsonFileFormat = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AvroFileFormatArgs> avroFileFormat;
        private @Nullable Output<String> fileRotationInterval;
        private @Nullable Output<Integer> fileRotationMb;
        private @Nullable Output<JsonFileFormatArgs> jsonFileFormat;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroFileFormat = defaults.avroFileFormat;
    	      this.fileRotationInterval = defaults.fileRotationInterval;
    	      this.fileRotationMb = defaults.fileRotationMb;
    	      this.jsonFileFormat = defaults.jsonFileFormat;
    	      this.path = defaults.path;
        }

        public Builder avroFileFormat(@Nullable Output<AvroFileFormatArgs> avroFileFormat) {
            this.avroFileFormat = avroFileFormat;
            return this;
        }

        public Builder avroFileFormat(@Nullable AvroFileFormatArgs avroFileFormat) {
            this.avroFileFormat = Output.ofNullable(avroFileFormat);
            return this;
        }

        public Builder fileRotationInterval(@Nullable Output<String> fileRotationInterval) {
            this.fileRotationInterval = fileRotationInterval;
            return this;
        }

        public Builder fileRotationInterval(@Nullable String fileRotationInterval) {
            this.fileRotationInterval = Output.ofNullable(fileRotationInterval);
            return this;
        }

        public Builder fileRotationMb(@Nullable Output<Integer> fileRotationMb) {
            this.fileRotationMb = fileRotationMb;
            return this;
        }

        public Builder fileRotationMb(@Nullable Integer fileRotationMb) {
            this.fileRotationMb = Output.ofNullable(fileRotationMb);
            return this;
        }

        public Builder jsonFileFormat(@Nullable Output<JsonFileFormatArgs> jsonFileFormat) {
            this.jsonFileFormat = jsonFileFormat;
            return this;
        }

        public Builder jsonFileFormat(@Nullable JsonFileFormatArgs jsonFileFormat) {
            this.jsonFileFormat = Output.ofNullable(jsonFileFormat);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public GcsDestinationConfigArgs build() {
            return new GcsDestinationConfigArgs(avroFileFormat, fileRotationInterval, fileRotationMb, jsonFileFormat, path);
        }
    }
}
