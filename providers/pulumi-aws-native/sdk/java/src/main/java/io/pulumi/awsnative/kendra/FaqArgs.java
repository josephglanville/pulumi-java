// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.kendra.enums.FaqFileFormat;
import io.pulumi.awsnative.kendra.inputs.FaqS3PathArgs;
import io.pulumi.awsnative.kendra.inputs.FaqTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FaqArgs extends io.pulumi.resources.ResourceArgs {

    public static final FaqArgs Empty = new FaqArgs();

    /**
     * FAQ description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * FAQ file format
     * 
     */
    @InputImport(name="fileFormat")
      private final @Nullable Output<FaqFileFormat> fileFormat;

    public Output<FaqFileFormat> getFileFormat() {
        return this.fileFormat == null ? Output.empty() : this.fileFormat;
    }

    /**
     * Index ID
     * 
     */
    @InputImport(name="indexId", required=true)
      private final Output<String> indexId;

    public Output<String> getIndexId() {
        return this.indexId;
    }

    /**
     * FAQ name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * FAQ role ARN
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * FAQ S3 path
     * 
     */
    @InputImport(name="s3Path", required=true)
      private final Output<FaqS3PathArgs> s3Path;

    public Output<FaqS3PathArgs> getS3Path() {
        return this.s3Path;
    }

    /**
     * Tags for labeling the FAQ
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<FaqTagArgs>> tags;

    public Output<List<FaqTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FaqArgs(
        @Nullable Output<String> description,
        @Nullable Output<FaqFileFormat> fileFormat,
        Output<String> indexId,
        @Nullable Output<String> name,
        Output<String> roleArn,
        Output<FaqS3PathArgs> s3Path,
        @Nullable Output<List<FaqTagArgs>> tags) {
        this.description = description;
        this.fileFormat = fileFormat;
        this.indexId = Objects.requireNonNull(indexId, "expected parameter 'indexId' to be non-null");
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.s3Path = Objects.requireNonNull(s3Path, "expected parameter 's3Path' to be non-null");
        this.tags = tags;
    }

    private FaqArgs() {
        this.description = Output.empty();
        this.fileFormat = Output.empty();
        this.indexId = Output.empty();
        this.name = Output.empty();
        this.roleArn = Output.empty();
        this.s3Path = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FaqArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<FaqFileFormat> fileFormat;
        private Output<String> indexId;
        private @Nullable Output<String> name;
        private Output<String> roleArn;
        private Output<FaqS3PathArgs> s3Path;
        private @Nullable Output<List<FaqTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FaqArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fileFormat = defaults.fileFormat;
    	      this.indexId = defaults.indexId;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.s3Path = defaults.s3Path;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder fileFormat(@Nullable Output<FaqFileFormat> fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        public Builder fileFormat(@Nullable FaqFileFormat fileFormat) {
            this.fileFormat = Output.ofNullable(fileFormat);
            return this;
        }

        public Builder indexId(Output<String> indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }

        public Builder indexId(String indexId) {
            this.indexId = Output.of(Objects.requireNonNull(indexId));
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

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder s3Path(Output<FaqS3PathArgs> s3Path) {
            this.s3Path = Objects.requireNonNull(s3Path);
            return this;
        }

        public Builder s3Path(FaqS3PathArgs s3Path) {
            this.s3Path = Output.of(Objects.requireNonNull(s3Path));
            return this;
        }

        public Builder tags(@Nullable Output<List<FaqTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FaqTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public FaqArgs build() {
            return new FaqArgs(description, fileFormat, indexId, name, roleArn, s3Path, tags);
        }
    }
}
