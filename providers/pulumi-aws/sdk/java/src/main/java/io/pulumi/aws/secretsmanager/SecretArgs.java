// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager;

import io.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs;
import io.pulumi.aws.secretsmanager.inputs.SecretRotationRulesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Description of the secret.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     * 
     */
    @Import(name="forceOverwriteReplicaSecret")
      private final @Nullable Output<Boolean> forceOverwriteReplicaSecret;

    public Output<Boolean> getForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret == null ? Output.empty() : this.forceOverwriteReplicaSecret;
    }

    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account's default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
     * 
     */
    @Import(name="recoveryWindowInDays")
      private final @Nullable Output<Integer> recoveryWindowInDays;

    public Output<Integer> getRecoveryWindowInDays() {
        return this.recoveryWindowInDays == null ? Output.empty() : this.recoveryWindowInDays;
    }

    /**
     * Configuration block to support secret replication. See details below.
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<List<SecretReplicaArgs>> replicas;

    public Output<List<SecretReplicaArgs>> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    /**
     * ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @Import(name="rotationLambdaArn")
      private final @Nullable Output<String> rotationLambdaArn;

    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    public Output<String> getRotationLambdaArn() {
        return this.rotationLambdaArn == null ? Output.empty() : this.rotationLambdaArn;
    }

    /**
     * Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @Import(name="rotationRules")
      private final @Nullable Output<SecretRotationRulesArgs> rotationRules;

    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    public Output<SecretRotationRulesArgs> getRotationRules() {
        return this.rotationRules == null ? Output.empty() : this.rotationRules;
    }

    /**
     * Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SecretArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceOverwriteReplicaSecret,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> policy,
        @Nullable Output<Integer> recoveryWindowInDays,
        @Nullable Output<List<SecretReplicaArgs>> replicas,
        @Nullable Output<String> rotationLambdaArn,
        @Nullable Output<SecretRotationRulesArgs> rotationRules,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.namePrefix = namePrefix;
        this.policy = policy;
        this.recoveryWindowInDays = recoveryWindowInDays;
        this.replicas = replicas;
        this.rotationLambdaArn = rotationLambdaArn;
        this.rotationRules = rotationRules;
        this.tags = tags;
    }

    private SecretArgs() {
        this.description = Output.empty();
        this.forceOverwriteReplicaSecret = Output.empty();
        this.kmsKeyId = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.policy = Output.empty();
        this.recoveryWindowInDays = Output.empty();
        this.replicas = Output.empty();
        this.rotationLambdaArn = Output.empty();
        this.rotationRules = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceOverwriteReplicaSecret;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> policy;
        private @Nullable Output<Integer> recoveryWindowInDays;
        private @Nullable Output<List<SecretReplicaArgs>> replicas;
        private @Nullable Output<String> rotationLambdaArn;
        private @Nullable Output<SecretRotationRulesArgs> rotationRules;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.forceOverwriteReplicaSecret = defaults.forceOverwriteReplicaSecret;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.policy = defaults.policy;
    	      this.recoveryWindowInDays = defaults.recoveryWindowInDays;
    	      this.replicas = defaults.replicas;
    	      this.rotationLambdaArn = defaults.rotationLambdaArn;
    	      this.rotationRules = defaults.rotationRules;
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
        public Builder forceOverwriteReplicaSecret(@Nullable Output<Boolean> forceOverwriteReplicaSecret) {
            this.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
            return this;
        }
        public Builder forceOverwriteReplicaSecret(@Nullable Boolean forceOverwriteReplicaSecret) {
            this.forceOverwriteReplicaSecret = Output.ofNullable(forceOverwriteReplicaSecret);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public Builder recoveryWindowInDays(@Nullable Output<Integer> recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }
        public Builder recoveryWindowInDays(@Nullable Integer recoveryWindowInDays) {
            this.recoveryWindowInDays = Output.ofNullable(recoveryWindowInDays);
            return this;
        }
        public Builder replicas(@Nullable Output<List<SecretReplicaArgs>> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable List<SecretReplicaArgs> replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }
        public Builder replicas(SecretReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }
        public Builder rotationLambdaArn(@Nullable Output<String> rotationLambdaArn) {
            this.rotationLambdaArn = rotationLambdaArn;
            return this;
        }
        public Builder rotationLambdaArn(@Nullable String rotationLambdaArn) {
            this.rotationLambdaArn = Output.ofNullable(rotationLambdaArn);
            return this;
        }
        public Builder rotationRules(@Nullable Output<SecretRotationRulesArgs> rotationRules) {
            this.rotationRules = rotationRules;
            return this;
        }
        public Builder rotationRules(@Nullable SecretRotationRulesArgs rotationRules) {
            this.rotationRules = Output.ofNullable(rotationRules);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(description, forceOverwriteReplicaSecret, kmsKeyId, name, namePrefix, policy, recoveryWindowInDays, replicas, rotationLambdaArn, rotationRules, tags);
        }
    }
}