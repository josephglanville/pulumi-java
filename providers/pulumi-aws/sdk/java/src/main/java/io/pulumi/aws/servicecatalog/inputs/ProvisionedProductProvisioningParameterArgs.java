// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductProvisioningParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductProvisioningParameterArgs Empty = new ProvisionedProductProvisioningParameterArgs();

    /**
     * Parameter key.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Whether to ignore `value` and keep the previous parameter value. Ignored when initially provisioning a product.
     * 
     */
    @Import(name="usePreviousValue")
      private final @Nullable Output<Boolean> usePreviousValue;

    public Output<Boolean> getUsePreviousValue() {
        return this.usePreviousValue == null ? Codegen.empty() : this.usePreviousValue;
    }

    /**
     * Parameter value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ProvisionedProductProvisioningParameterArgs(
        Output<String> key,
        @Nullable Output<Boolean> usePreviousValue,
        @Nullable Output<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.usePreviousValue = usePreviousValue;
        this.value = value;
    }

    private ProvisionedProductProvisioningParameterArgs() {
        this.key = Codegen.empty();
        this.usePreviousValue = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductProvisioningParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<Boolean> usePreviousValue;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductProvisioningParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.usePreviousValue = defaults.usePreviousValue;
    	      this.value = defaults.value;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder usePreviousValue(@Nullable Output<Boolean> usePreviousValue) {
            this.usePreviousValue = usePreviousValue;
            return this;
        }
        public Builder usePreviousValue(@Nullable Boolean usePreviousValue) {
            this.usePreviousValue = Codegen.ofNullable(usePreviousValue);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ProvisionedProductProvisioningParameterArgs build() {
            return new ProvisionedProductProvisioningParameterArgs(key, usePreviousValue, value);
        }
    }
}
