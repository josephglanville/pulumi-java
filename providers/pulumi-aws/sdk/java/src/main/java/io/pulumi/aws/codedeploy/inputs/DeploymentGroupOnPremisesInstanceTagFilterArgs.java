// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupOnPremisesInstanceTagFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupOnPremisesInstanceTagFilterArgs Empty = new DeploymentGroupOnPremisesInstanceTagFilterArgs();

    /**
     * The key of the tag filter.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The value of the tag filter.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public DeploymentGroupOnPremisesInstanceTagFilterArgs(
        @Nullable Output<String> key,
        @Nullable Output<String> type,
        @Nullable Output<String> value) {
        this.key = key;
        this.type = type;
        this.value = value;
    }

    private DeploymentGroupOnPremisesInstanceTagFilterArgs() {
        this.key = Output.empty();
        this.type = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupOnPremisesInstanceTagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> type;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupOnPremisesInstanceTagFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public DeploymentGroupOnPremisesInstanceTagFilterArgs build() {
            return new DeploymentGroupOnPremisesInstanceTagFilterArgs(key, type, value);
        }
    }
}
