// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
public final class SecretKeySelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretKeySelectorArgs Empty = new SecretKeySelectorArgs();

    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> getOptional() {
        return this.optional == null ? Codegen.empty() : this.optional;
    }

    public SecretKeySelectorArgs(
        Output<String> key,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> optional) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = name;
        this.optional = optional;
    }

    private SecretKeySelectorArgs() {
        this.key = Codegen.empty();
        this.name = Codegen.empty();
        this.optional = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretKeySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretKeySelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
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
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Codegen.ofNullable(optional);
            return this;
        }        public SecretKeySelectorArgs build() {
            return new SecretKeySelectorArgs(key, name, optional);
        }
    }
}
