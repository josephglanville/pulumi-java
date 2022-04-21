// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.asset.Archive;
import com.pulumi.aws.lambda.enums.Runtime;
import com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigGetArgs;
import com.pulumi.aws.lambda.inputs.FunctionEnvironmentGetArgs;
import com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigGetArgs;
import com.pulumi.aws.lambda.inputs.FunctionImageConfigGetArgs;
import com.pulumi.aws.lambda.inputs.FunctionTracingConfigGetArgs;
import com.pulumi.aws.lambda.inputs.FunctionVpcConfigGetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * Instruction set architecture for your Lambda function. Valid values are `[&#34;x86_64&#34;]` and `[&#34;arm64&#34;]`. Default is `[&#34;x86_64&#34;]`. Removing this attribute, function&#39;s architecture stay the same.
     * 
     */
    @Import(name="architectures")
    private @Nullable Output<List<String>> architectures;

    public Optional<Output<List<String>>> architectures() {
        return Optional.ofNullable(this.architectures);
    }

    /**
     * Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Path to the function&#39;s deployment package within the local filesystem. Conflicts with `image_uri`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Archive> code;

    public Optional<Output<Archive>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration. A code-signing configuration includes a set of signing profiles, which define the trusted publishers for this function.
     * 
     */
    @Import(name="codeSigningConfigArn")
    private @Nullable Output<String> codeSigningConfigArn;

    public Optional<Output<String>> codeSigningConfigArn() {
        return Optional.ofNullable(this.codeSigningConfigArn);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="deadLetterConfig")
    private @Nullable Output<FunctionDeadLetterConfigGetArgs> deadLetterConfig;

    public Optional<Output<FunctionDeadLetterConfigGetArgs>> deadLetterConfig() {
        return Optional.ofNullable(this.deadLetterConfig);
    }

    /**
     * Description of what your Lambda Function does.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<FunctionEnvironmentGetArgs> environment;

    public Optional<Output<FunctionEnvironmentGetArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="fileSystemConfig")
    private @Nullable Output<FunctionFileSystemConfigGetArgs> fileSystemConfig;

    public Optional<Output<FunctionFileSystemConfigGetArgs>> fileSystemConfig() {
        return Optional.ofNullable(this.fileSystemConfig);
    }

    /**
     * Function [entrypoint](https://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events-create-test-function.html) in your code.
     * 
     */
    @Import(name="handler")
    private @Nullable Output<String> handler;

    public Optional<Output<String>> handler() {
        return Optional.ofNullable(this.handler);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="imageConfig")
    private @Nullable Output<FunctionImageConfigGetArgs> imageConfig;

    public Optional<Output<FunctionImageConfigGetArgs>> imageConfig() {
        return Optional.ofNullable(this.imageConfig);
    }

    /**
     * ECR image URI containing the function&#39;s deployment package. Conflicts with `filename`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    /**
     * ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`&#39;s `uri`.
     * 
     */
    @Import(name="invokeArn")
    private @Nullable Output<String> invokeArn;

    public Optional<Output<String>> invokeArn() {
        return Optional.ofNullable(this.invokeArn);
    }

    /**
     * Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key that is used to encrypt environment variables. If this configuration is not provided when environment variables are in use, AWS Lambda uses a default service key. If this configuration is provided when environment variables are not in use, the AWS Lambda API does not save this configuration and the provider will show a perpetual difference of adding the key. To fix the perpetual difference, remove this configuration.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * Date this resource was last modified.
     * 
     */
    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    /**
     * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
     * 
     */
    @Import(name="layers")
    private @Nullable Output<List<String>> layers;

    public Optional<Output<List<String>>> layers() {
        return Optional.ofNullable(this.layers);
    }

    /**
     * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
     * 
     */
    @Import(name="memorySize")
    private @Nullable Output<Integer> memorySize;

    public Optional<Output<Integer>> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }

    /**
     * Unique name for your Lambda Function.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Lambda deployment package type. Valid values are `Zip` and `Image`. Defaults to `Zip`.
     * 
     */
    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    public Optional<Output<String>> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    /**
     * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
     * 
     */
    @Import(name="publish")
    private @Nullable Output<Boolean> publish;

    public Optional<Output<Boolean>> publish() {
        return Optional.ofNullable(this.publish);
    }

    /**
     * ARN identifying your Lambda Function Version (if versioning is enabled via `publish = true`).
     * 
     */
    @Import(name="qualifiedArn")
    private @Nullable Output<String> qualifiedArn;

    public Optional<Output<String>> qualifiedArn() {
        return Optional.ofNullable(this.qualifiedArn);
    }

    /**
     * Amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     * 
     */
    @Import(name="reservedConcurrentExecutions")
    private @Nullable Output<Integer> reservedConcurrentExecutions;

    public Optional<Output<Integer>> reservedConcurrentExecutions() {
        return Optional.ofNullable(this.reservedConcurrentExecutions);
    }

    /**
     * Amazon Resource Name (ARN) of the function&#39;s execution role. The role provides the function&#39;s identity and access to AWS services and resources.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Identifier of the function&#39;s runtime. See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html#SSS-CreateFunction-request-Runtime) for valid values.
     * 
     */
    @Import(name="runtime")
    private @Nullable Output<Either<String,Runtime>> runtime;

    public Optional<Output<Either<String,Runtime>>> runtime() {
        return Optional.ofNullable(this.runtime);
    }

    /**
     * S3 bucket location containing the function&#39;s deployment package. Conflicts with `filename` and `image_uri`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @Import(name="s3Bucket")
    private @Nullable Output<String> s3Bucket;

    public Optional<Output<String>> s3Bucket() {
        return Optional.ofNullable(this.s3Bucket);
    }

    /**
     * S3 key of an object containing the function&#39;s deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @Import(name="s3Key")
    private @Nullable Output<String> s3Key;

    public Optional<Output<String>> s3Key() {
        return Optional.ofNullable(this.s3Key);
    }

    /**
     * Object version containing the function&#39;s deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @Import(name="s3ObjectVersion")
    private @Nullable Output<String> s3ObjectVersion;

    public Optional<Output<String>> s3ObjectVersion() {
        return Optional.ofNullable(this.s3ObjectVersion);
    }

    /**
     * ARN of the signing job.
     * 
     */
    @Import(name="signingJobArn")
    private @Nullable Output<String> signingJobArn;

    public Optional<Output<String>> signingJobArn() {
        return Optional.ofNullable(this.signingJobArn);
    }

    /**
     * ARN of the signing profile version.
     * 
     */
    @Import(name="signingProfileVersionArn")
    private @Nullable Output<String> signingProfileVersionArn;

    public Optional<Output<String>> signingProfileVersionArn() {
        return Optional.ofNullable(this.signingProfileVersionArn);
    }

    /**
     * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `filebase64sha256(&#34;file.zip&#34;)`, where &#34;file.zip&#34; is the local filename of the lambda function source archive.
     * 
     */
    @Import(name="sourceCodeHash")
    private @Nullable Output<String> sourceCodeHash;

    public Optional<Output<String>> sourceCodeHash() {
        return Optional.ofNullable(this.sourceCodeHash);
    }

    /**
     * Size in bytes of the function .zip file.
     * 
     */
    @Import(name="sourceCodeSize")
    private @Nullable Output<Integer> sourceCodeSize;

    public Optional<Output<Integer>> sourceCodeSize() {
        return Optional.ofNullable(this.sourceCodeSize);
    }

    /**
     * Map of tags to assign to the object.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="tracingConfig")
    private @Nullable Output<FunctionTracingConfigGetArgs> tracingConfig;

    public Optional<Output<FunctionTracingConfigGetArgs>> tracingConfig() {
        return Optional.ofNullable(this.tracingConfig);
    }

    /**
     * Latest published version of your Lambda Function.
     * * `vpc_config.vpc_id` - ID of the VPC.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<FunctionVpcConfigGetArgs> vpcConfig;

    public Optional<Output<FunctionVpcConfigGetArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private FunctionState() {}

    private FunctionState(FunctionState $) {
        this.architectures = $.architectures;
        this.arn = $.arn;
        this.code = $.code;
        this.codeSigningConfigArn = $.codeSigningConfigArn;
        this.deadLetterConfig = $.deadLetterConfig;
        this.description = $.description;
        this.environment = $.environment;
        this.fileSystemConfig = $.fileSystemConfig;
        this.handler = $.handler;
        this.imageConfig = $.imageConfig;
        this.imageUri = $.imageUri;
        this.invokeArn = $.invokeArn;
        this.kmsKeyArn = $.kmsKeyArn;
        this.lastModified = $.lastModified;
        this.layers = $.layers;
        this.memorySize = $.memorySize;
        this.name = $.name;
        this.packageType = $.packageType;
        this.publish = $.publish;
        this.qualifiedArn = $.qualifiedArn;
        this.reservedConcurrentExecutions = $.reservedConcurrentExecutions;
        this.role = $.role;
        this.runtime = $.runtime;
        this.s3Bucket = $.s3Bucket;
        this.s3Key = $.s3Key;
        this.s3ObjectVersion = $.s3ObjectVersion;
        this.signingJobArn = $.signingJobArn;
        this.signingProfileVersionArn = $.signingProfileVersionArn;
        this.sourceCodeHash = $.sourceCodeHash;
        this.sourceCodeSize = $.sourceCodeSize;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.timeout = $.timeout;
        this.tracingConfig = $.tracingConfig;
        this.version = $.version;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionState $;

        public Builder() {
            $ = new FunctionState();
        }

        public Builder(FunctionState defaults) {
            $ = new FunctionState(Objects.requireNonNull(defaults));
        }

        public Builder architectures(@Nullable Output<List<String>> architectures) {
            $.architectures = architectures;
            return this;
        }

        public Builder architectures(List<String> architectures) {
            return architectures(Output.of(architectures));
        }

        public Builder architectures(String... architectures) {
            return architectures(List.of(architectures));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder code(@Nullable Output<Archive> code) {
            $.code = code;
            return this;
        }

        public Builder code(Archive code) {
            return code(Output.of(code));
        }

        public Builder codeSigningConfigArn(@Nullable Output<String> codeSigningConfigArn) {
            $.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        public Builder codeSigningConfigArn(String codeSigningConfigArn) {
            return codeSigningConfigArn(Output.of(codeSigningConfigArn));
        }

        public Builder deadLetterConfig(@Nullable Output<FunctionDeadLetterConfigGetArgs> deadLetterConfig) {
            $.deadLetterConfig = deadLetterConfig;
            return this;
        }

        public Builder deadLetterConfig(FunctionDeadLetterConfigGetArgs deadLetterConfig) {
            return deadLetterConfig(Output.of(deadLetterConfig));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environment(@Nullable Output<FunctionEnvironmentGetArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(FunctionEnvironmentGetArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder fileSystemConfig(@Nullable Output<FunctionFileSystemConfigGetArgs> fileSystemConfig) {
            $.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder fileSystemConfig(FunctionFileSystemConfigGetArgs fileSystemConfig) {
            return fileSystemConfig(Output.of(fileSystemConfig));
        }

        public Builder handler(@Nullable Output<String> handler) {
            $.handler = handler;
            return this;
        }

        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        public Builder imageConfig(@Nullable Output<FunctionImageConfigGetArgs> imageConfig) {
            $.imageConfig = imageConfig;
            return this;
        }

        public Builder imageConfig(FunctionImageConfigGetArgs imageConfig) {
            return imageConfig(Output.of(imageConfig));
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public Builder invokeArn(@Nullable Output<String> invokeArn) {
            $.invokeArn = invokeArn;
            return this;
        }

        public Builder invokeArn(String invokeArn) {
            return invokeArn(Output.of(invokeArn));
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        public Builder layers(@Nullable Output<List<String>> layers) {
            $.layers = layers;
            return this;
        }

        public Builder layers(List<String> layers) {
            return layers(Output.of(layers));
        }

        public Builder layers(String... layers) {
            return layers(List.of(layers));
        }

        public Builder memorySize(@Nullable Output<Integer> memorySize) {
            $.memorySize = memorySize;
            return this;
        }

        public Builder memorySize(Integer memorySize) {
            return memorySize(Output.of(memorySize));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        public Builder publish(@Nullable Output<Boolean> publish) {
            $.publish = publish;
            return this;
        }

        public Builder publish(Boolean publish) {
            return publish(Output.of(publish));
        }

        public Builder qualifiedArn(@Nullable Output<String> qualifiedArn) {
            $.qualifiedArn = qualifiedArn;
            return this;
        }

        public Builder qualifiedArn(String qualifiedArn) {
            return qualifiedArn(Output.of(qualifiedArn));
        }

        public Builder reservedConcurrentExecutions(@Nullable Output<Integer> reservedConcurrentExecutions) {
            $.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        public Builder reservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
            return reservedConcurrentExecutions(Output.of(reservedConcurrentExecutions));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder runtime(@Nullable Output<Either<String,Runtime>> runtime) {
            $.runtime = runtime;
            return this;
        }

        public Builder runtime(Either<String,Runtime> runtime) {
            return runtime(Output.of(runtime));
        }

        public Builder runtime(String runtime) {
            return runtime(Either.ofLeft(runtime));
        }

        public Builder runtime(Runtime runtime) {
            return runtime(Either.ofRight(runtime));
        }

        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        public Builder s3Key(@Nullable Output<String> s3Key) {
            $.s3Key = s3Key;
            return this;
        }

        public Builder s3Key(String s3Key) {
            return s3Key(Output.of(s3Key));
        }

        public Builder s3ObjectVersion(@Nullable Output<String> s3ObjectVersion) {
            $.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder s3ObjectVersion(String s3ObjectVersion) {
            return s3ObjectVersion(Output.of(s3ObjectVersion));
        }

        public Builder signingJobArn(@Nullable Output<String> signingJobArn) {
            $.signingJobArn = signingJobArn;
            return this;
        }

        public Builder signingJobArn(String signingJobArn) {
            return signingJobArn(Output.of(signingJobArn));
        }

        public Builder signingProfileVersionArn(@Nullable Output<String> signingProfileVersionArn) {
            $.signingProfileVersionArn = signingProfileVersionArn;
            return this;
        }

        public Builder signingProfileVersionArn(String signingProfileVersionArn) {
            return signingProfileVersionArn(Output.of(signingProfileVersionArn));
        }

        public Builder sourceCodeHash(@Nullable Output<String> sourceCodeHash) {
            $.sourceCodeHash = sourceCodeHash;
            return this;
        }

        public Builder sourceCodeHash(String sourceCodeHash) {
            return sourceCodeHash(Output.of(sourceCodeHash));
        }

        public Builder sourceCodeSize(@Nullable Output<Integer> sourceCodeSize) {
            $.sourceCodeSize = sourceCodeSize;
            return this;
        }

        public Builder sourceCodeSize(Integer sourceCodeSize) {
            return sourceCodeSize(Output.of(sourceCodeSize));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder tracingConfig(@Nullable Output<FunctionTracingConfigGetArgs> tracingConfig) {
            $.tracingConfig = tracingConfig;
            return this;
        }

        public Builder tracingConfig(FunctionTracingConfigGetArgs tracingConfig) {
            return tracingConfig(Output.of(tracingConfig));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public Builder vpcConfig(@Nullable Output<FunctionVpcConfigGetArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(FunctionVpcConfigGetArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public FunctionState build() {
            return $;
        }
    }

}
