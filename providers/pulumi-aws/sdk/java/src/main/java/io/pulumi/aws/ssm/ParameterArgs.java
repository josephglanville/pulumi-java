// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.ssm.enums.ParameterType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterArgs Empty = new ParameterArgs();

    /**
     * A regular expression used to validate the parameter value.
     * 
     */
    @Import(name="allowedPattern")
      private final @Nullable Output<String> allowedPattern;

    public Output<String> getAllowedPattern() {
        return this.allowedPattern == null ? Codegen.empty() : this.allowedPattern;
    }

    /**
     * The ARN of the parameter.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Codegen.empty() : this.dataType;
    }

    /**
     * The description of the parameter.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The KMS key id or arn for encrypting a SecureString.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    @Import(name="overwrite")
      private final @Nullable Output<Boolean> overwrite;

    public Output<Boolean> getOverwrite() {
        return this.overwrite == null ? Codegen.empty() : this.overwrite;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    /**
     * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> getType() {
        return this.type;
    }

    /**
     * The value of the parameter.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public ParameterArgs(
        @Nullable Output<String> allowedPattern,
        @Nullable Output<String> arn,
        @Nullable Output<String> dataType,
        @Nullable Output<String> description,
        @Nullable Output<String> keyId,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> overwrite,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> tier,
        Output<Either<String,ParameterType>> type,
        Output<String> value) {
        this.allowedPattern = allowedPattern;
        this.arn = arn;
        this.dataType = dataType;
        this.description = description;
        this.keyId = keyId;
        this.name = name;
        this.overwrite = overwrite;
        this.tags = tags;
        this.tier = tier;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ParameterArgs() {
        this.allowedPattern = Codegen.empty();
        this.arn = Codegen.empty();
        this.dataType = Codegen.empty();
        this.description = Codegen.empty();
        this.keyId = Codegen.empty();
        this.name = Codegen.empty();
        this.overwrite = Codegen.empty();
        this.tags = Codegen.empty();
        this.tier = Codegen.empty();
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowedPattern;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dataType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> overwrite;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> tier;
        private Output<Either<String,ParameterType>> type;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPattern = defaults.allowedPattern;
    	      this.arn = defaults.arn;
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.overwrite = defaults.overwrite;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder allowedPattern(@Nullable Output<String> allowedPattern) {
            this.allowedPattern = allowedPattern;
            return this;
        }
        public Builder allowedPattern(@Nullable String allowedPattern) {
            this.allowedPattern = Codegen.ofNullable(allowedPattern);
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
        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = Codegen.ofNullable(dataType);
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
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = Codegen.ofNullable(overwrite);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }
        public Builder type(Output<Either<String,ParameterType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,ParameterType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ParameterArgs build() {
            return new ParameterArgs(allowedPattern, arn, dataType, description, keyId, name, overwrite, tags, tier, type, value);
        }
    }
}
