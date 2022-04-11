// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetModelAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelAttributeArgs Empty = new AssetModelAttributeArgs();

    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Codegen.empty() : this.defaultValue;
    }

    public AssetModelAttributeArgs(@Nullable Output<String> defaultValue) {
        this.defaultValue = defaultValue;
    }

    private AssetModelAttributeArgs() {
        this.defaultValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Codegen.ofNullable(defaultValue);
            return this;
        }        public AssetModelAttributeArgs build() {
            return new AssetModelAttributeArgs(defaultValue);
        }
    }
}
