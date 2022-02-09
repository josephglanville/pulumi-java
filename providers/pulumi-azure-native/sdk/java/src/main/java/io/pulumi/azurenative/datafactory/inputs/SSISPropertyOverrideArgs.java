// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SSISPropertyOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSISPropertyOverrideArgs Empty = new SSISPropertyOverrideArgs();

    @InputImport(name="isSensitive")
    private final @Nullable Input<Boolean> isSensitive;

    public Input<Boolean> getIsSensitive() {
        return this.isSensitive == null ? Input.empty() : this.isSensitive;
    }

    @InputImport(name="value", required=true)
    private final Input<Object> value;

    public Input<Object> getValue() {
        return this.value;
    }

    public SSISPropertyOverrideArgs(
        @Nullable Input<Boolean> isSensitive,
        Input<Object> value) {
        this.isSensitive = isSensitive;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SSISPropertyOverrideArgs() {
        this.isSensitive = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPropertyOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isSensitive;
        private Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPropertyOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSensitive = defaults.isSensitive;
    	      this.value = defaults.value;
        }

        public Builder setIsSensitive(@Nullable Input<Boolean> isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }

        public Builder setIsSensitive(@Nullable Boolean isSensitive) {
            this.isSensitive = Input.ofNullable(isSensitive);
            return this;
        }

        public Builder setValue(Input<Object> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public SSISPropertyOverrideArgs build() {
            return new SSISPropertyOverrideArgs(isSensitive, value);
        }
    }
}
