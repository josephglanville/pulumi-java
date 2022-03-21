// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.KnownExtensionDataSourceStreams;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of which data will be collected from a separate VM extension that integrates with the Azure Monitor Agent.
 * Collected from either Windows and Linux machines, depending on which extension is defined.
 * 
 */
public final class ExtensionDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionDataSourceArgs Empty = new ExtensionDataSourceArgs();

    /**
     * The name of the VM extension.
     * 
     */
    @Import(name="extensionName", required=true)
      private final Output<String> extensionName;

    public Output<String> getExtensionName() {
        return this.extensionName;
    }

    /**
     * The extension settings. The format is specific for particular extension.
     * 
     */
    @Import(name="extensionSettings")
      private final @Nullable Output<Object> extensionSettings;

    public Output<Object> getExtensionSettings() {
        return this.extensionSettings == null ? Output.empty() : this.extensionSettings;
    }

    /**
     * The list of data sources this extension needs data from.
     * 
     */
    @Import(name="inputDataSources")
      private final @Nullable Output<List<String>> inputDataSources;

    public Output<List<String>> getInputDataSources() {
        return this.inputDataSources == null ? Output.empty() : this.inputDataSources;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @Import(name="streams")
      private final @Nullable Output<List<Either<String,KnownExtensionDataSourceStreams>>> streams;

    public Output<List<Either<String,KnownExtensionDataSourceStreams>>> getStreams() {
        return this.streams == null ? Output.empty() : this.streams;
    }

    public ExtensionDataSourceArgs(
        Output<String> extensionName,
        @Nullable Output<Object> extensionSettings,
        @Nullable Output<List<String>> inputDataSources,
        @Nullable Output<String> name,
        @Nullable Output<List<Either<String,KnownExtensionDataSourceStreams>>> streams) {
        this.extensionName = Objects.requireNonNull(extensionName, "expected parameter 'extensionName' to be non-null");
        this.extensionSettings = extensionSettings;
        this.inputDataSources = inputDataSources;
        this.name = name;
        this.streams = streams;
    }

    private ExtensionDataSourceArgs() {
        this.extensionName = Output.empty();
        this.extensionSettings = Output.empty();
        this.inputDataSources = Output.empty();
        this.name = Output.empty();
        this.streams = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> extensionName;
        private @Nullable Output<Object> extensionSettings;
        private @Nullable Output<List<String>> inputDataSources;
        private @Nullable Output<String> name;
        private @Nullable Output<List<Either<String,KnownExtensionDataSourceStreams>>> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionName = defaults.extensionName;
    	      this.extensionSettings = defaults.extensionSettings;
    	      this.inputDataSources = defaults.inputDataSources;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder extensionName(Output<String> extensionName) {
            this.extensionName = Objects.requireNonNull(extensionName);
            return this;
        }
        public Builder extensionName(String extensionName) {
            this.extensionName = Output.of(Objects.requireNonNull(extensionName));
            return this;
        }
        public Builder extensionSettings(@Nullable Output<Object> extensionSettings) {
            this.extensionSettings = extensionSettings;
            return this;
        }
        public Builder extensionSettings(@Nullable Object extensionSettings) {
            this.extensionSettings = Output.ofNullable(extensionSettings);
            return this;
        }
        public Builder inputDataSources(@Nullable Output<List<String>> inputDataSources) {
            this.inputDataSources = inputDataSources;
            return this;
        }
        public Builder inputDataSources(@Nullable List<String> inputDataSources) {
            this.inputDataSources = Output.ofNullable(inputDataSources);
            return this;
        }
        public Builder inputDataSources(String... inputDataSources) {
            return inputDataSources(List.of(inputDataSources));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder streams(@Nullable Output<List<Either<String,KnownExtensionDataSourceStreams>>> streams) {
            this.streams = streams;
            return this;
        }
        public Builder streams(@Nullable List<Either<String,KnownExtensionDataSourceStreams>> streams) {
            this.streams = Output.ofNullable(streams);
            return this;
        }
        public Builder streams(Either<String,KnownExtensionDataSourceStreams>... streams) {
            return streams(List.of(streams));
        }        public ExtensionDataSourceArgs build() {
            return new ExtensionDataSourceArgs(extensionName, extensionSettings, inputDataSources, name, streams);
        }
    }
}
