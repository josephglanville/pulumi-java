// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersGetArgs;
import io.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeSigningConfigState extends io.pulumi.resources.ResourceArgs {

    public static final CodeSigningConfigState Empty = new CodeSigningConfigState();

    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     * 
     */
    @Import(name="allowedPublishers")
      private final @Nullable Output<CodeSigningConfigAllowedPublishersGetArgs> allowedPublishers;

    public Output<CodeSigningConfigAllowedPublishersGetArgs> getAllowedPublishers() {
        return this.allowedPublishers == null ? Codegen.empty() : this.allowedPublishers;
    }

    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Unique identifier for the code signing configuration.
     * 
     */
    @Import(name="configId")
      private final @Nullable Output<String> configId;

    public Output<String> getConfigId() {
        return this.configId == null ? Codegen.empty() : this.configId;
    }

    /**
     * Descriptive name for this code signing configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The date and time that the code signing configuration was last modified.
     * 
     */
    @Import(name="lastModified")
      private final @Nullable Output<String> lastModified;

    public Output<String> getLastModified() {
        return this.lastModified == null ? Codegen.empty() : this.lastModified;
    }

    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     * 
     */
    @Import(name="policies")
      private final @Nullable Output<CodeSigningConfigPoliciesGetArgs> policies;

    public Output<CodeSigningConfigPoliciesGetArgs> getPolicies() {
        return this.policies == null ? Codegen.empty() : this.policies;
    }

    public CodeSigningConfigState(
        @Nullable Output<CodeSigningConfigAllowedPublishersGetArgs> allowedPublishers,
        @Nullable Output<String> arn,
        @Nullable Output<String> configId,
        @Nullable Output<String> description,
        @Nullable Output<String> lastModified,
        @Nullable Output<CodeSigningConfigPoliciesGetArgs> policies) {
        this.allowedPublishers = allowedPublishers;
        this.arn = arn;
        this.configId = configId;
        this.description = description;
        this.lastModified = lastModified;
        this.policies = policies;
    }

    private CodeSigningConfigState() {
        this.allowedPublishers = Codegen.empty();
        this.arn = Codegen.empty();
        this.configId = Codegen.empty();
        this.description = Codegen.empty();
        this.lastModified = Codegen.empty();
        this.policies = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CodeSigningConfigAllowedPublishersGetArgs> allowedPublishers;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> configId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> lastModified;
        private @Nullable Output<CodeSigningConfigPoliciesGetArgs> policies;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPublishers = defaults.allowedPublishers;
    	      this.arn = defaults.arn;
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.lastModified = defaults.lastModified;
    	      this.policies = defaults.policies;
        }

        public Builder allowedPublishers(@Nullable Output<CodeSigningConfigAllowedPublishersGetArgs> allowedPublishers) {
            this.allowedPublishers = allowedPublishers;
            return this;
        }
        public Builder allowedPublishers(@Nullable CodeSigningConfigAllowedPublishersGetArgs allowedPublishers) {
            this.allowedPublishers = Codegen.ofNullable(allowedPublishers);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder configId(@Nullable Output<String> configId) {
            this.configId = configId;
            return this;
        }
        public Builder configId(@Nullable String configId) {
            this.configId = Codegen.ofNullable(configId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder lastModified(@Nullable Output<String> lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = Codegen.ofNullable(lastModified);
            return this;
        }
        public Builder policies(@Nullable Output<CodeSigningConfigPoliciesGetArgs> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(@Nullable CodeSigningConfigPoliciesGetArgs policies) {
            this.policies = Codegen.ofNullable(policies);
            return this;
        }        public CodeSigningConfigState build() {
            return new CodeSigningConfigState(allowedPublishers, arn, configId, description, lastModified, policies);
        }
    }
}
