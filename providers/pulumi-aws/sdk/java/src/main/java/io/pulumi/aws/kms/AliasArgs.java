// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates an unique alias beginning with the specified prefix.
     * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    @Import(name="targetKeyId", required=true)
      private final Output<String> targetKeyId;

    public Output<String> getTargetKeyId() {
        return this.targetKeyId;
    }

    public AliasArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        Output<String> targetKeyId) {
        this.name = name;
        this.namePrefix = namePrefix;
        this.targetKeyId = Objects.requireNonNull(targetKeyId, "expected parameter 'targetKeyId' to be non-null");
    }

    private AliasArgs() {
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.targetKeyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private Output<String> targetKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.targetKeyId = defaults.targetKeyId;
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
        public Builder targetKeyId(Output<String> targetKeyId) {
            this.targetKeyId = Objects.requireNonNull(targetKeyId);
            return this;
        }
        public Builder targetKeyId(String targetKeyId) {
            this.targetKeyId = Output.of(Objects.requireNonNull(targetKeyId));
            return this;
        }        public AliasArgs build() {
            return new AliasArgs(name, namePrefix, targetKeyId);
        }
    }
}
