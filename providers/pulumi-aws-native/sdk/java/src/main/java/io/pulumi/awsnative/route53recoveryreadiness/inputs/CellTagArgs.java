// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CellTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final CellTagArgs Empty = new CellTagArgs();

    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
      private final Input<List<String>> value;

    public Input<List<String>> getValue() {
        return this.value;
    }

    public CellTagArgs(
        Input<String> key,
        Input<List<String>> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private CellTagArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<List<String>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CellTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValue(Input<List<String>> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(List<String> value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public CellTagArgs build() {
            return new CellTagArgs(key, value);
        }
    }
}
