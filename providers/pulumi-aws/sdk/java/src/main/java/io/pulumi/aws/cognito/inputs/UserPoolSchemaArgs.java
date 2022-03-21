// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolSchemaNumberAttributeConstraintsArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSchemaStringAttributeConstraintsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaArgs Empty = new UserPoolSchemaArgs();

    /**
     * Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    @Import(name="attributeDataType", required=true)
      private final Output<String> attributeDataType;

    public Output<String> getAttributeDataType() {
        return this.attributeDataType;
    }

    /**
     * Whether the attribute type is developer only.
     * 
     */
    @Import(name="developerOnlyAttribute")
      private final @Nullable Output<Boolean> developerOnlyAttribute;

    public Output<Boolean> getDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute == null ? Output.empty() : this.developerOnlyAttribute;
    }

    /**
     * Whether the attribute can be changed once it has been created.
     * 
     */
    @Import(name="mutable")
      private final @Nullable Output<Boolean> mutable;

    public Output<Boolean> getMutable() {
        return this.mutable == null ? Output.empty() : this.mutable;
    }

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    @Import(name="numberAttributeConstraints")
      private final @Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints;

    public Output<UserPoolSchemaNumberAttributeConstraintsArgs> getNumberAttributeConstraints() {
        return this.numberAttributeConstraints == null ? Output.empty() : this.numberAttributeConstraints;
    }

    /**
     * Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    @Import(name="required")
      private final @Nullable Output<Boolean> required;

    public Output<Boolean> getRequired() {
        return this.required == null ? Output.empty() : this.required;
    }

    /**
     * Constraints for an attribute of the string type. Detailed below.
     * 
     */
    @Import(name="stringAttributeConstraints")
      private final @Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints;

    public Output<UserPoolSchemaStringAttributeConstraintsArgs> getStringAttributeConstraints() {
        return this.stringAttributeConstraints == null ? Output.empty() : this.stringAttributeConstraints;
    }

    public UserPoolSchemaArgs(
        Output<String> attributeDataType,
        @Nullable Output<Boolean> developerOnlyAttribute,
        @Nullable Output<Boolean> mutable,
        Output<String> name,
        @Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints,
        @Nullable Output<Boolean> required,
        @Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints) {
        this.attributeDataType = Objects.requireNonNull(attributeDataType, "expected parameter 'attributeDataType' to be non-null");
        this.developerOnlyAttribute = developerOnlyAttribute;
        this.mutable = mutable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.numberAttributeConstraints = numberAttributeConstraints;
        this.required = required;
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    private UserPoolSchemaArgs() {
        this.attributeDataType = Output.empty();
        this.developerOnlyAttribute = Output.empty();
        this.mutable = Output.empty();
        this.name = Output.empty();
        this.numberAttributeConstraints = Output.empty();
        this.required = Output.empty();
        this.stringAttributeConstraints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attributeDataType;
        private @Nullable Output<Boolean> developerOnlyAttribute;
        private @Nullable Output<Boolean> mutable;
        private Output<String> name;
        private @Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints;
        private @Nullable Output<Boolean> required;
        private @Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDataType = defaults.attributeDataType;
    	      this.developerOnlyAttribute = defaults.developerOnlyAttribute;
    	      this.mutable = defaults.mutable;
    	      this.name = defaults.name;
    	      this.numberAttributeConstraints = defaults.numberAttributeConstraints;
    	      this.required = defaults.required;
    	      this.stringAttributeConstraints = defaults.stringAttributeConstraints;
        }

        public Builder attributeDataType(Output<String> attributeDataType) {
            this.attributeDataType = Objects.requireNonNull(attributeDataType);
            return this;
        }
        public Builder attributeDataType(String attributeDataType) {
            this.attributeDataType = Output.of(Objects.requireNonNull(attributeDataType));
            return this;
        }
        public Builder developerOnlyAttribute(@Nullable Output<Boolean> developerOnlyAttribute) {
            this.developerOnlyAttribute = developerOnlyAttribute;
            return this;
        }
        public Builder developerOnlyAttribute(@Nullable Boolean developerOnlyAttribute) {
            this.developerOnlyAttribute = Output.ofNullable(developerOnlyAttribute);
            return this;
        }
        public Builder mutable(@Nullable Output<Boolean> mutable) {
            this.mutable = mutable;
            return this;
        }
        public Builder mutable(@Nullable Boolean mutable) {
            this.mutable = Output.ofNullable(mutable);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder numberAttributeConstraints(@Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints) {
            this.numberAttributeConstraints = numberAttributeConstraints;
            return this;
        }
        public Builder numberAttributeConstraints(@Nullable UserPoolSchemaNumberAttributeConstraintsArgs numberAttributeConstraints) {
            this.numberAttributeConstraints = Output.ofNullable(numberAttributeConstraints);
            return this;
        }
        public Builder required(@Nullable Output<Boolean> required) {
            this.required = required;
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = Output.ofNullable(required);
            return this;
        }
        public Builder stringAttributeConstraints(@Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints) {
            this.stringAttributeConstraints = stringAttributeConstraints;
            return this;
        }
        public Builder stringAttributeConstraints(@Nullable UserPoolSchemaStringAttributeConstraintsArgs stringAttributeConstraints) {
            this.stringAttributeConstraints = Output.ofNullable(stringAttributeConstraints);
            return this;
        }        public UserPoolSchemaArgs build() {
            return new UserPoolSchemaArgs(attributeDataType, developerOnlyAttribute, mutable, name, numberAttributeConstraints, required, stringAttributeConstraints);
        }
    }
}
