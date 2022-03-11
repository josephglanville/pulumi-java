// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Archive;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LayerVersionState extends io.pulumi.resources.ResourceArgs {

    public static final LayerVersionState Empty = new LayerVersionState();

    /**
     * ARN of the Lambda Layer with version.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
     * 
     */
    @InputImport(name="code")
      private final @Nullable Output<Archive> code;

    public Output<Archive> getCode() {
        return this.code == null ? Output.empty() : this.code;
    }

    /**
     * List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
     * 
     */
    @InputImport(name="compatibleArchitectures")
      private final @Nullable Output<List<String>> compatibleArchitectures;

    public Output<List<String>> getCompatibleArchitectures() {
        return this.compatibleArchitectures == null ? Output.empty() : this.compatibleArchitectures;
    }

    /**
     * List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
     * 
     */
    @InputImport(name="compatibleRuntimes")
      private final @Nullable Output<List<String>> compatibleRuntimes;

    public Output<List<String>> getCompatibleRuntimes() {
        return this.compatibleRuntimes == null ? Output.empty() : this.compatibleRuntimes;
    }

    /**
     * Date this resource was created.
     * 
     */
    @InputImport(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate == null ? Output.empty() : this.createdDate;
    }

    /**
     * Description of what your Lambda Layer does.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * ARN of the Lambda Layer without version.
     * 
     */
    @InputImport(name="layerArn")
      private final @Nullable Output<String> layerArn;

    public Output<String> getLayerArn() {
        return this.layerArn == null ? Output.empty() : this.layerArn;
    }

    /**
     * Unique name for your Lambda Layer
     * 
     */
    @InputImport(name="layerName")
      private final @Nullable Output<String> layerName;

    public Output<String> getLayerName() {
        return this.layerName == null ? Output.empty() : this.layerName;
    }

    /**
     * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
     * 
     */
    @InputImport(name="licenseInfo")
      private final @Nullable Output<String> licenseInfo;

    public Output<String> getLicenseInfo() {
        return this.licenseInfo == null ? Output.empty() : this.licenseInfo;
    }

    /**
     * S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @InputImport(name="s3Bucket")
      private final @Nullable Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket == null ? Output.empty() : this.s3Bucket;
    }

    /**
     * S3 key of an object containing the function's deployment package. Conflicts with `filename`.
     * 
     */
    @InputImport(name="s3Key")
      private final @Nullable Output<String> s3Key;

    public Output<String> getS3Key() {
        return this.s3Key == null ? Output.empty() : this.s3Key;
    }

    /**
     * Object version containing the function's deployment package. Conflicts with `filename`.
     * 
     */
    @InputImport(name="s3ObjectVersion")
      private final @Nullable Output<String> s3ObjectVersion;

    public Output<String> getS3ObjectVersion() {
        return this.s3ObjectVersion == null ? Output.empty() : this.s3ObjectVersion;
    }

    /**
     * ARN of a signing job.
     * 
     */
    @InputImport(name="signingJobArn")
      private final @Nullable Output<String> signingJobArn;

    public Output<String> getSigningJobArn() {
        return this.signingJobArn == null ? Output.empty() : this.signingJobArn;
    }

    /**
     * ARN for a signing profile version.
     * 
     */
    @InputImport(name="signingProfileVersionArn")
      private final @Nullable Output<String> signingProfileVersionArn;

    public Output<String> getSigningProfileVersionArn() {
        return this.signingProfileVersionArn == null ? Output.empty() : this.signingProfileVersionArn;
    }

    /**
     * Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    @InputImport(name="skipDestroy")
      private final @Nullable Output<Boolean> skipDestroy;

    public Output<Boolean> getSkipDestroy() {
        return this.skipDestroy == null ? Output.empty() : this.skipDestroy;
    }

    @InputImport(name="sourceCodeHash")
      private final @Nullable Output<String> sourceCodeHash;

    public Output<String> getSourceCodeHash() {
        return this.sourceCodeHash == null ? Output.empty() : this.sourceCodeHash;
    }

    /**
     * Size in bytes of the function .zip file.
     * 
     */
    @InputImport(name="sourceCodeSize")
      private final @Nullable Output<Integer> sourceCodeSize;

    public Output<Integer> getSourceCodeSize() {
        return this.sourceCodeSize == null ? Output.empty() : this.sourceCodeSize;
    }

    /**
     * Lambda Layer version.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public LayerVersionState(
        @Nullable Output<String> arn,
        @Nullable Output<Archive> code,
        @Nullable Output<List<String>> compatibleArchitectures,
        @Nullable Output<List<String>> compatibleRuntimes,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> description,
        @Nullable Output<String> layerArn,
        @Nullable Output<String> layerName,
        @Nullable Output<String> licenseInfo,
        @Nullable Output<String> s3Bucket,
        @Nullable Output<String> s3Key,
        @Nullable Output<String> s3ObjectVersion,
        @Nullable Output<String> signingJobArn,
        @Nullable Output<String> signingProfileVersionArn,
        @Nullable Output<Boolean> skipDestroy,
        @Nullable Output<String> sourceCodeHash,
        @Nullable Output<Integer> sourceCodeSize,
        @Nullable Output<String> version) {
        this.arn = arn;
        this.code = code;
        this.compatibleArchitectures = compatibleArchitectures;
        this.compatibleRuntimes = compatibleRuntimes;
        this.createdDate = createdDate;
        this.description = description;
        this.layerArn = layerArn;
        this.layerName = layerName;
        this.licenseInfo = licenseInfo;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.signingJobArn = signingJobArn;
        this.signingProfileVersionArn = signingProfileVersionArn;
        this.skipDestroy = skipDestroy;
        this.sourceCodeHash = sourceCodeHash;
        this.sourceCodeSize = sourceCodeSize;
        this.version = version;
    }

    private LayerVersionState() {
        this.arn = Output.empty();
        this.code = Output.empty();
        this.compatibleArchitectures = Output.empty();
        this.compatibleRuntimes = Output.empty();
        this.createdDate = Output.empty();
        this.description = Output.empty();
        this.layerArn = Output.empty();
        this.layerName = Output.empty();
        this.licenseInfo = Output.empty();
        this.s3Bucket = Output.empty();
        this.s3Key = Output.empty();
        this.s3ObjectVersion = Output.empty();
        this.signingJobArn = Output.empty();
        this.signingProfileVersionArn = Output.empty();
        this.skipDestroy = Output.empty();
        this.sourceCodeHash = Output.empty();
        this.sourceCodeSize = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Archive> code;
        private @Nullable Output<List<String>> compatibleArchitectures;
        private @Nullable Output<List<String>> compatibleRuntimes;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> description;
        private @Nullable Output<String> layerArn;
        private @Nullable Output<String> layerName;
        private @Nullable Output<String> licenseInfo;
        private @Nullable Output<String> s3Bucket;
        private @Nullable Output<String> s3Key;
        private @Nullable Output<String> s3ObjectVersion;
        private @Nullable Output<String> signingJobArn;
        private @Nullable Output<String> signingProfileVersionArn;
        private @Nullable Output<Boolean> skipDestroy;
        private @Nullable Output<String> sourceCodeHash;
        private @Nullable Output<Integer> sourceCodeSize;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.compatibleArchitectures = defaults.compatibleArchitectures;
    	      this.compatibleRuntimes = defaults.compatibleRuntimes;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.layerArn = defaults.layerArn;
    	      this.layerName = defaults.layerName;
    	      this.licenseInfo = defaults.licenseInfo;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.signingJobArn = defaults.signingJobArn;
    	      this.signingProfileVersionArn = defaults.signingProfileVersionArn;
    	      this.skipDestroy = defaults.skipDestroy;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
    	      this.sourceCodeSize = defaults.sourceCodeSize;
    	      this.version = defaults.version;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder code(@Nullable Output<Archive> code) {
            this.code = code;
            return this;
        }

        public Builder code(@Nullable Archive code) {
            this.code = Output.ofNullable(code);
            return this;
        }

        public Builder compatibleArchitectures(@Nullable Output<List<String>> compatibleArchitectures) {
            this.compatibleArchitectures = compatibleArchitectures;
            return this;
        }

        public Builder compatibleArchitectures(@Nullable List<String> compatibleArchitectures) {
            this.compatibleArchitectures = Output.ofNullable(compatibleArchitectures);
            return this;
        }

        public Builder compatibleRuntimes(@Nullable Output<List<String>> compatibleRuntimes) {
            this.compatibleRuntimes = compatibleRuntimes;
            return this;
        }

        public Builder compatibleRuntimes(@Nullable List<String> compatibleRuntimes) {
            this.compatibleRuntimes = Output.ofNullable(compatibleRuntimes);
            return this;
        }

        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Output.ofNullable(createdDate);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder layerArn(@Nullable Output<String> layerArn) {
            this.layerArn = layerArn;
            return this;
        }

        public Builder layerArn(@Nullable String layerArn) {
            this.layerArn = Output.ofNullable(layerArn);
            return this;
        }

        public Builder layerName(@Nullable Output<String> layerName) {
            this.layerName = layerName;
            return this;
        }

        public Builder layerName(@Nullable String layerName) {
            this.layerName = Output.ofNullable(layerName);
            return this;
        }

        public Builder licenseInfo(@Nullable Output<String> licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        public Builder licenseInfo(@Nullable String licenseInfo) {
            this.licenseInfo = Output.ofNullable(licenseInfo);
            return this;
        }

        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Output.ofNullable(s3Bucket);
            return this;
        }

        public Builder s3Key(@Nullable Output<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        public Builder s3Key(@Nullable String s3Key) {
            this.s3Key = Output.ofNullable(s3Key);
            return this;
        }

        public Builder s3ObjectVersion(@Nullable Output<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder s3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Output.ofNullable(s3ObjectVersion);
            return this;
        }

        public Builder signingJobArn(@Nullable Output<String> signingJobArn) {
            this.signingJobArn = signingJobArn;
            return this;
        }

        public Builder signingJobArn(@Nullable String signingJobArn) {
            this.signingJobArn = Output.ofNullable(signingJobArn);
            return this;
        }

        public Builder signingProfileVersionArn(@Nullable Output<String> signingProfileVersionArn) {
            this.signingProfileVersionArn = signingProfileVersionArn;
            return this;
        }

        public Builder signingProfileVersionArn(@Nullable String signingProfileVersionArn) {
            this.signingProfileVersionArn = Output.ofNullable(signingProfileVersionArn);
            return this;
        }

        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }

        public Builder skipDestroy(@Nullable Boolean skipDestroy) {
            this.skipDestroy = Output.ofNullable(skipDestroy);
            return this;
        }

        public Builder sourceCodeHash(@Nullable Output<String> sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }

        public Builder sourceCodeHash(@Nullable String sourceCodeHash) {
            this.sourceCodeHash = Output.ofNullable(sourceCodeHash);
            return this;
        }

        public Builder sourceCodeSize(@Nullable Output<Integer> sourceCodeSize) {
            this.sourceCodeSize = sourceCodeSize;
            return this;
        }

        public Builder sourceCodeSize(@Nullable Integer sourceCodeSize) {
            this.sourceCodeSize = Output.ofNullable(sourceCodeSize);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public LayerVersionState build() {
            return new LayerVersionState(arn, code, compatibleArchitectures, compatibleRuntimes, createdDate, description, layerArn, layerName, licenseInfo, s3Bucket, s3Key, s3ObjectVersion, signingJobArn, signingProfileVersionArn, skipDestroy, sourceCodeHash, sourceCodeSize, version);
        }
    }
}
