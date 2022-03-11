// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs();

    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    @InputImport(name="bytesLimitPerFile")
      private final @Nullable Output<Integer> bytesLimitPerFile;

    public Output<Integer> getBytesLimitPerFile() {
        return this.bytesLimitPerFile == null ? Output.empty() : this.bytesLimitPerFile;
    }

    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @InputImport(name="bytesLimitPerFilePercent")
      private final @Nullable Output<Integer> bytesLimitPerFilePercent;

    public Output<Integer> getBytesLimitPerFilePercent() {
        return this.bytesLimitPerFilePercent == null ? Output.empty() : this.bytesLimitPerFilePercent;
    }

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileSet", required=true)
      private final Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet;

    public Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> getFileSet() {
        return this.fileSet;
    }

    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    @InputImport(name="fileTypes")
      private final @Nullable Output<List<String>> fileTypes;

    public Output<List<String>> getFileTypes() {
        return this.fileTypes == null ? Output.empty() : this.fileTypes;
    }

    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @InputImport(name="filesLimitPercent")
      private final @Nullable Output<Integer> filesLimitPercent;

    public Output<Integer> getFilesLimitPercent() {
        return this.filesLimitPercent == null ? Output.empty() : this.filesLimitPercent;
    }

    /**
     * How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    @InputImport(name="sampleMethod")
      private final @Nullable Output<String> sampleMethod;

    public Output<String> getSampleMethod() {
        return this.sampleMethod == null ? Output.empty() : this.sampleMethod;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs(
        @Nullable Output<Integer> bytesLimitPerFile,
        @Nullable Output<Integer> bytesLimitPerFilePercent,
        Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet,
        @Nullable Output<List<String>> fileTypes,
        @Nullable Output<Integer> filesLimitPercent,
        @Nullable Output<String> sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = Objects.requireNonNull(fileSet, "expected parameter 'fileSet' to be non-null");
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs() {
        this.bytesLimitPerFile = Output.empty();
        this.bytesLimitPerFilePercent = Output.empty();
        this.fileSet = Output.empty();
        this.fileTypes = Output.empty();
        this.filesLimitPercent = Output.empty();
        this.sampleMethod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bytesLimitPerFile;
        private @Nullable Output<Integer> bytesLimitPerFilePercent;
        private Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet;
        private @Nullable Output<List<String>> fileTypes;
        private @Nullable Output<Integer> filesLimitPercent;
        private @Nullable Output<String> sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder bytesLimitPerFile(@Nullable Output<Integer> bytesLimitPerFile) {
            this.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }

        public Builder bytesLimitPerFile(@Nullable Integer bytesLimitPerFile) {
            this.bytesLimitPerFile = Output.ofNullable(bytesLimitPerFile);
            return this;
        }

        public Builder bytesLimitPerFilePercent(@Nullable Output<Integer> bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }

        public Builder bytesLimitPerFilePercent(@Nullable Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = Output.ofNullable(bytesLimitPerFilePercent);
            return this;
        }

        public Builder fileSet(Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs> fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }

        public Builder fileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs fileSet) {
            this.fileSet = Output.of(Objects.requireNonNull(fileSet));
            return this;
        }

        public Builder fileTypes(@Nullable Output<List<String>> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }

        public Builder fileTypes(@Nullable List<String> fileTypes) {
            this.fileTypes = Output.ofNullable(fileTypes);
            return this;
        }

        public Builder filesLimitPercent(@Nullable Output<Integer> filesLimitPercent) {
            this.filesLimitPercent = filesLimitPercent;
            return this;
        }

        public Builder filesLimitPercent(@Nullable Integer filesLimitPercent) {
            this.filesLimitPercent = Output.ofNullable(filesLimitPercent);
            return this;
        }

        public Builder sampleMethod(@Nullable Output<String> sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }

        public Builder sampleMethod(@Nullable String sampleMethod) {
            this.sampleMethod = Output.ofNullable(sampleMethod);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
