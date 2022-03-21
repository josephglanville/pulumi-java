// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs Empty = new InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs();

    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final Output<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value;

    public Output<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> getValue() {
        return this.value;
    }

    public InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs(
        Output<String> key,
        Output<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs() {
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
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
        public Builder value(Output<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs(key, value);
        }
    }
}
