// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.databrew.enums.DatasetFormat;
import io.pulumi.awsnative.databrew.inputs.DatasetFormatOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetInputArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetPathOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * Dataset format
     * 
     */
    @Import(name="format")
      private final @Nullable Output<DatasetFormat> format;

    public Output<DatasetFormat> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * Format options for dataset
     * 
     */
    @Import(name="formatOptions")
      private final @Nullable Output<DatasetFormatOptionsArgs> formatOptions;

    public Output<DatasetFormatOptionsArgs> getFormatOptions() {
        return this.formatOptions == null ? Output.empty() : this.formatOptions;
    }

    /**
     * Input
     * 
     */
    @Import(name="input", required=true)
      private final Output<DatasetInputArgs> input;

    public Output<DatasetInputArgs> getInput() {
        return this.input;
    }

    /**
     * Dataset name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * PathOptions
     * 
     */
    @Import(name="pathOptions")
      private final @Nullable Output<DatasetPathOptionsArgs> pathOptions;

    public Output<DatasetPathOptionsArgs> getPathOptions() {
        return this.pathOptions == null ? Output.empty() : this.pathOptions;
    }

    @Import(name="tags")
      private final @Nullable Output<List<DatasetTagArgs>> tags;

    public Output<List<DatasetTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DatasetArgs(
        @Nullable Output<DatasetFormat> format,
        @Nullable Output<DatasetFormatOptionsArgs> formatOptions,
        Output<DatasetInputArgs> input,
        @Nullable Output<String> name,
        @Nullable Output<DatasetPathOptionsArgs> pathOptions,
        @Nullable Output<List<DatasetTagArgs>> tags) {
        this.format = format;
        this.formatOptions = formatOptions;
        this.input = Objects.requireNonNull(input, "expected parameter 'input' to be non-null");
        this.name = name;
        this.pathOptions = pathOptions;
        this.tags = tags;
    }

    private DatasetArgs() {
        this.format = Output.empty();
        this.formatOptions = Output.empty();
        this.input = Output.empty();
        this.name = Output.empty();
        this.pathOptions = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetFormat> format;
        private @Nullable Output<DatasetFormatOptionsArgs> formatOptions;
        private Output<DatasetInputArgs> input;
        private @Nullable Output<String> name;
        private @Nullable Output<DatasetPathOptionsArgs> pathOptions;
        private @Nullable Output<List<DatasetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.formatOptions = defaults.formatOptions;
    	      this.input = defaults.input;
    	      this.name = defaults.name;
    	      this.pathOptions = defaults.pathOptions;
    	      this.tags = defaults.tags;
        }

        public Builder format(@Nullable Output<DatasetFormat> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable DatasetFormat format) {
            this.format = Output.ofNullable(format);
            return this;
        }
        public Builder formatOptions(@Nullable Output<DatasetFormatOptionsArgs> formatOptions) {
            this.formatOptions = formatOptions;
            return this;
        }
        public Builder formatOptions(@Nullable DatasetFormatOptionsArgs formatOptions) {
            this.formatOptions = Output.ofNullable(formatOptions);
            return this;
        }
        public Builder input(Output<DatasetInputArgs> input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }
        public Builder input(DatasetInputArgs input) {
            this.input = Output.of(Objects.requireNonNull(input));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder pathOptions(@Nullable Output<DatasetPathOptionsArgs> pathOptions) {
            this.pathOptions = pathOptions;
            return this;
        }
        public Builder pathOptions(@Nullable DatasetPathOptionsArgs pathOptions) {
            this.pathOptions = Output.ofNullable(pathOptions);
            return this;
        }
        public Builder tags(@Nullable Output<List<DatasetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DatasetTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(DatasetTagArgs... tags) {
            return tags(List.of(tags));
        }        public DatasetArgs build() {
            return new DatasetArgs(format, formatOptions, input, name, pathOptions, tags);
        }
    }
}
