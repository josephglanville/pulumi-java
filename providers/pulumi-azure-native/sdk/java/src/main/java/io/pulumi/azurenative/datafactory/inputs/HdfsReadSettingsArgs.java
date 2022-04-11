// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DistcpSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HDFS read settings.
 * 
 */
public final class HdfsReadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HdfsReadSettingsArgs Empty = new HdfsReadSettingsArgs();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
      private final @Nullable Output<Object> deleteFilesAfterCompletion;

    public Output<Object> getDeleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion == null ? Codegen.empty() : this.deleteFilesAfterCompletion;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * Specifies Distcp-related settings.
     * 
     */
    @Import(name="distcpSettings")
      private final @Nullable Output<DistcpSettingsArgs> distcpSettings;

    public Output<DistcpSettingsArgs> getDistcpSettings() {
        return this.distcpSettings == null ? Codegen.empty() : this.distcpSettings;
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
      private final @Nullable Output<Boolean> enablePartitionDiscovery;

    public Output<Boolean> getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery == null ? Codegen.empty() : this.enablePartitionDiscovery;
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
      private final @Nullable Output<Object> fileListPath;

    public Output<Object> getFileListPath() {
        return this.fileListPath == null ? Codegen.empty() : this.fileListPath;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
      private final @Nullable Output<Object> modifiedDatetimeEnd;

    public Output<Object> getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Codegen.empty() : this.modifiedDatetimeEnd;
    }

    /**
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
      private final @Nullable Output<Object> modifiedDatetimeStart;

    public Output<Object> getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Codegen.empty() : this.modifiedDatetimeStart;
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
      private final @Nullable Output<Object> partitionRootPath;

    public Output<Object> getPartitionRootPath() {
        return this.partitionRootPath == null ? Codegen.empty() : this.partitionRootPath;
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
      private final @Nullable Output<Object> recursive;

    public Output<Object> getRecursive() {
        return this.recursive == null ? Codegen.empty() : this.recursive;
    }

    /**
     * The read setting type.
     * Expected value is 'HdfsReadSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * HDFS wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
      private final @Nullable Output<Object> wildcardFileName;

    public Output<Object> getWildcardFileName() {
        return this.wildcardFileName == null ? Codegen.empty() : this.wildcardFileName;
    }

    /**
     * HDFS wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
      private final @Nullable Output<Object> wildcardFolderPath;

    public Output<Object> getWildcardFolderPath() {
        return this.wildcardFolderPath == null ? Codegen.empty() : this.wildcardFolderPath;
    }

    public HdfsReadSettingsArgs(
        @Nullable Output<Object> deleteFilesAfterCompletion,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<DistcpSettingsArgs> distcpSettings,
        @Nullable Output<Boolean> enablePartitionDiscovery,
        @Nullable Output<Object> fileListPath,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> modifiedDatetimeEnd,
        @Nullable Output<Object> modifiedDatetimeStart,
        @Nullable Output<Object> partitionRootPath,
        @Nullable Output<Object> recursive,
        Output<String> type,
        @Nullable Output<Object> wildcardFileName,
        @Nullable Output<Object> wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.distcpSettings = distcpSettings;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.recursive = recursive;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    private HdfsReadSettingsArgs() {
        this.deleteFilesAfterCompletion = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.distcpSettings = Codegen.empty();
        this.enablePartitionDiscovery = Codegen.empty();
        this.fileListPath = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.modifiedDatetimeEnd = Codegen.empty();
        this.modifiedDatetimeStart = Codegen.empty();
        this.partitionRootPath = Codegen.empty();
        this.recursive = Codegen.empty();
        this.type = Codegen.empty();
        this.wildcardFileName = Codegen.empty();
        this.wildcardFolderPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HdfsReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> deleteFilesAfterCompletion;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<DistcpSettingsArgs> distcpSettings;
        private @Nullable Output<Boolean> enablePartitionDiscovery;
        private @Nullable Output<Object> fileListPath;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> modifiedDatetimeEnd;
        private @Nullable Output<Object> modifiedDatetimeStart;
        private @Nullable Output<Object> partitionRootPath;
        private @Nullable Output<Object> recursive;
        private Output<String> type;
        private @Nullable Output<Object> wildcardFileName;
        private @Nullable Output<Object> wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(HdfsReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.distcpSettings = defaults.distcpSettings;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder deleteFilesAfterCompletion(@Nullable Output<Object> deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }
        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = Codegen.ofNullable(deleteFilesAfterCompletion);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder distcpSettings(@Nullable Output<DistcpSettingsArgs> distcpSettings) {
            this.distcpSettings = distcpSettings;
            return this;
        }
        public Builder distcpSettings(@Nullable DistcpSettingsArgs distcpSettings) {
            this.distcpSettings = Codegen.ofNullable(distcpSettings);
            return this;
        }
        public Builder enablePartitionDiscovery(@Nullable Output<Boolean> enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }
        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = Codegen.ofNullable(enablePartitionDiscovery);
            return this;
        }
        public Builder fileListPath(@Nullable Output<Object> fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }
        public Builder fileListPath(@Nullable Object fileListPath) {
            this.fileListPath = Codegen.ofNullable(fileListPath);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = Codegen.ofNullable(modifiedDatetimeEnd);
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = Codegen.ofNullable(modifiedDatetimeStart);
            return this;
        }
        public Builder partitionRootPath(@Nullable Output<Object> partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }
        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = Codegen.ofNullable(partitionRootPath);
            return this;
        }
        public Builder recursive(@Nullable Output<Object> recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder recursive(@Nullable Object recursive) {
            this.recursive = Codegen.ofNullable(recursive);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder wildcardFileName(@Nullable Output<Object> wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }
        public Builder wildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = Codegen.ofNullable(wildcardFileName);
            return this;
        }
        public Builder wildcardFolderPath(@Nullable Output<Object> wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }
        public Builder wildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = Codegen.ofNullable(wildcardFolderPath);
            return this;
        }        public HdfsReadSettingsArgs build() {
            return new HdfsReadSettingsArgs(deleteFilesAfterCompletion, disableMetricsCollection, distcpSettings, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
