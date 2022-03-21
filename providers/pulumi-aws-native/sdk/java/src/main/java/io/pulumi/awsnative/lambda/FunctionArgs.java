// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.lambda.enums.FunctionArchitecturesItem;
import io.pulumi.awsnative.lambda.enums.FunctionPackageType;
import io.pulumi.awsnative.lambda.inputs.FunctionCodeArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionDeadLetterConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionEnvironmentArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionFileSystemConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionImageConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionTagArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionTracingConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    @Import(name="architectures")
      private final @Nullable Output<List<FunctionArchitecturesItem>> architectures;

    public Output<List<FunctionArchitecturesItem>> getArchitectures() {
        return this.architectures == null ? Output.empty() : this.architectures;
    }

    /**
     * The code for the function.
     * 
     */
    @Import(name="code", required=true)
      private final Output<FunctionCodeArgs> code;

    public Output<FunctionCodeArgs> getCode() {
        return this.code;
    }

    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    @Import(name="codeSigningConfigArn")
      private final @Nullable Output<String> codeSigningConfigArn;

    public Output<String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn == null ? Output.empty() : this.codeSigningConfigArn;
    }

    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    @Import(name="deadLetterConfig")
      private final @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig;

    public Output<FunctionDeadLetterConfigArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Output.empty() : this.deadLetterConfig;
    }

    /**
     * A description of the function.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Environment variables that are accessible from function code during execution.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<FunctionEnvironmentArgs> environment;

    public Output<FunctionEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    @Import(name="fileSystemConfigs")
      private final @Nullable Output<List<FunctionFileSystemConfigArgs>> fileSystemConfigs;

    public Output<List<FunctionFileSystemConfigArgs>> getFileSystemConfigs() {
        return this.fileSystemConfigs == null ? Output.empty() : this.fileSystemConfigs;
    }

    /**
     * The name of the Lambda function, up to 64 characters in length. If you don't specify a name, AWS CloudFormation generates one.
     * 
     */
    @Import(name="functionName")
      private final @Nullable Output<String> functionName;

    public Output<String> getFunctionName() {
        return this.functionName == null ? Output.empty() : this.functionName;
    }

    /**
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    @Import(name="handler")
      private final @Nullable Output<String> handler;

    public Output<String> getHandler() {
        return this.handler == null ? Output.empty() : this.handler;
    }

    /**
     * ImageConfig
     * 
     */
    @Import(name="imageConfig")
      private final @Nullable Output<FunctionImageConfigArgs> imageConfig;

    public Output<FunctionImageConfigArgs> getImageConfig() {
        return this.imageConfig == null ? Output.empty() : this.imageConfig;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    @Import(name="layers")
      private final @Nullable Output<List<String>> layers;

    public Output<List<String>> getLayers() {
        return this.layers == null ? Output.empty() : this.layers;
    }

    /**
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    @Import(name="memorySize")
      private final @Nullable Output<Integer> memorySize;

    public Output<Integer> getMemorySize() {
        return this.memorySize == null ? Output.empty() : this.memorySize;
    }

    /**
     * PackageType.
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<FunctionPackageType> packageType;

    public Output<FunctionPackageType> getPackageType() {
        return this.packageType == null ? Output.empty() : this.packageType;
    }

    /**
     * The number of simultaneous executions to reserve for the function.
     * 
     */
    @Import(name="reservedConcurrentExecutions")
      private final @Nullable Output<Integer> reservedConcurrentExecutions;

    public Output<Integer> getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions == null ? Output.empty() : this.reservedConcurrentExecutions;
    }

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * The identifier of the function's runtime.
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<String> runtime;

    public Output<String> getRuntime() {
        return this.runtime == null ? Output.empty() : this.runtime;
    }

    /**
     * A list of tags to apply to the function.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<FunctionTagArgs>> tags;

    public Output<List<FunctionTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    @Import(name="tracingConfig")
      private final @Nullable Output<FunctionTracingConfigArgs> tracingConfig;

    public Output<FunctionTracingConfigArgs> getTracingConfig() {
        return this.tracingConfig == null ? Output.empty() : this.tracingConfig;
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<FunctionVpcConfigArgs> vpcConfig;

    public Output<FunctionVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public FunctionArgs(
        @Nullable Output<List<FunctionArchitecturesItem>> architectures,
        Output<FunctionCodeArgs> code,
        @Nullable Output<String> codeSigningConfigArn,
        @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig,
        @Nullable Output<String> description,
        @Nullable Output<FunctionEnvironmentArgs> environment,
        @Nullable Output<List<FunctionFileSystemConfigArgs>> fileSystemConfigs,
        @Nullable Output<String> functionName,
        @Nullable Output<String> handler,
        @Nullable Output<FunctionImageConfigArgs> imageConfig,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<List<String>> layers,
        @Nullable Output<Integer> memorySize,
        @Nullable Output<FunctionPackageType> packageType,
        @Nullable Output<Integer> reservedConcurrentExecutions,
        Output<String> role,
        @Nullable Output<String> runtime,
        @Nullable Output<List<FunctionTagArgs>> tags,
        @Nullable Output<Integer> timeout,
        @Nullable Output<FunctionTracingConfigArgs> tracingConfig,
        @Nullable Output<FunctionVpcConfigArgs> vpcConfig) {
        this.architectures = architectures;
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfigs = fileSystemConfigs;
        this.functionName = functionName;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.kmsKeyArn = kmsKeyArn;
        this.layers = layers;
        this.memorySize = memorySize;
        this.packageType = packageType;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.runtime = runtime;
        this.tags = tags;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.vpcConfig = vpcConfig;
    }

    private FunctionArgs() {
        this.architectures = Output.empty();
        this.code = Output.empty();
        this.codeSigningConfigArn = Output.empty();
        this.deadLetterConfig = Output.empty();
        this.description = Output.empty();
        this.environment = Output.empty();
        this.fileSystemConfigs = Output.empty();
        this.functionName = Output.empty();
        this.handler = Output.empty();
        this.imageConfig = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.layers = Output.empty();
        this.memorySize = Output.empty();
        this.packageType = Output.empty();
        this.reservedConcurrentExecutions = Output.empty();
        this.role = Output.empty();
        this.runtime = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
        this.tracingConfig = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FunctionArchitecturesItem>> architectures;
        private Output<FunctionCodeArgs> code;
        private @Nullable Output<String> codeSigningConfigArn;
        private @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig;
        private @Nullable Output<String> description;
        private @Nullable Output<FunctionEnvironmentArgs> environment;
        private @Nullable Output<List<FunctionFileSystemConfigArgs>> fileSystemConfigs;
        private @Nullable Output<String> functionName;
        private @Nullable Output<String> handler;
        private @Nullable Output<FunctionImageConfigArgs> imageConfig;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<List<String>> layers;
        private @Nullable Output<Integer> memorySize;
        private @Nullable Output<FunctionPackageType> packageType;
        private @Nullable Output<Integer> reservedConcurrentExecutions;
        private Output<String> role;
        private @Nullable Output<String> runtime;
        private @Nullable Output<List<FunctionTagArgs>> tags;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<FunctionTracingConfigArgs> tracingConfig;
        private @Nullable Output<FunctionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.code = defaults.code;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfigs = defaults.fileSystemConfigs;
    	      this.functionName = defaults.functionName;
    	      this.handler = defaults.handler;
    	      this.imageConfig = defaults.imageConfig;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.packageType = defaults.packageType;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder architectures(@Nullable Output<List<FunctionArchitecturesItem>> architectures) {
            this.architectures = architectures;
            return this;
        }
        public Builder architectures(@Nullable List<FunctionArchitecturesItem> architectures) {
            this.architectures = Output.ofNullable(architectures);
            return this;
        }
        public Builder architectures(FunctionArchitecturesItem... architectures) {
            return architectures(List.of(architectures));
        }
        public Builder code(Output<FunctionCodeArgs> code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder code(FunctionCodeArgs code) {
            this.code = Output.of(Objects.requireNonNull(code));
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable Output<String> codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = Output.ofNullable(codeSigningConfigArn);
            return this;
        }
        public Builder deadLetterConfig(@Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }
        public Builder deadLetterConfig(@Nullable FunctionDeadLetterConfigArgs deadLetterConfig) {
            this.deadLetterConfig = Output.ofNullable(deadLetterConfig);
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
        public Builder environment(@Nullable Output<FunctionEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable FunctionEnvironmentArgs environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }
        public Builder fileSystemConfigs(@Nullable Output<List<FunctionFileSystemConfigArgs>> fileSystemConfigs) {
            this.fileSystemConfigs = fileSystemConfigs;
            return this;
        }
        public Builder fileSystemConfigs(@Nullable List<FunctionFileSystemConfigArgs> fileSystemConfigs) {
            this.fileSystemConfigs = Output.ofNullable(fileSystemConfigs);
            return this;
        }
        public Builder fileSystemConfigs(FunctionFileSystemConfigArgs... fileSystemConfigs) {
            return fileSystemConfigs(List.of(fileSystemConfigs));
        }
        public Builder functionName(@Nullable Output<String> functionName) {
            this.functionName = functionName;
            return this;
        }
        public Builder functionName(@Nullable String functionName) {
            this.functionName = Output.ofNullable(functionName);
            return this;
        }
        public Builder handler(@Nullable Output<String> handler) {
            this.handler = handler;
            return this;
        }
        public Builder handler(@Nullable String handler) {
            this.handler = Output.ofNullable(handler);
            return this;
        }
        public Builder imageConfig(@Nullable Output<FunctionImageConfigArgs> imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public Builder imageConfig(@Nullable FunctionImageConfigArgs imageConfig) {
            this.imageConfig = Output.ofNullable(imageConfig);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder layers(@Nullable Output<List<String>> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(@Nullable List<String> layers) {
            this.layers = Output.ofNullable(layers);
            return this;
        }
        public Builder layers(String... layers) {
            return layers(List.of(layers));
        }
        public Builder memorySize(@Nullable Output<Integer> memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Builder memorySize(@Nullable Integer memorySize) {
            this.memorySize = Output.ofNullable(memorySize);
            return this;
        }
        public Builder packageType(@Nullable Output<FunctionPackageType> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable FunctionPackageType packageType) {
            this.packageType = Output.ofNullable(packageType);
            return this;
        }
        public Builder reservedConcurrentExecutions(@Nullable Output<Integer> reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }
        public Builder reservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = Output.ofNullable(reservedConcurrentExecutions);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder runtime(@Nullable Output<String> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = Output.ofNullable(runtime);
            return this;
        }
        public Builder tags(@Nullable Output<List<FunctionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FunctionTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(FunctionTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder tracingConfig(@Nullable Output<FunctionTracingConfigArgs> tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }
        public Builder tracingConfig(@Nullable FunctionTracingConfigArgs tracingConfig) {
            this.tracingConfig = Output.ofNullable(tracingConfig);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<FunctionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable FunctionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }        public FunctionArgs build() {
            return new FunctionArgs(architectures, code, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfigs, functionName, handler, imageConfig, kmsKeyArn, layers, memorySize, packageType, reservedConcurrentExecutions, role, runtime, tags, timeout, tracingConfig, vpcConfig);
        }
    }
}
