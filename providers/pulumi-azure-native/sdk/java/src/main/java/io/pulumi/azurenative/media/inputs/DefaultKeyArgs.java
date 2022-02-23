// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify properties of default content key for each encryption scheme
 * 
 */
public final class DefaultKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultKeyArgs Empty = new DefaultKeyArgs();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator
     * 
     */
    @InputImport(name="label")
      private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * Policy used by Default Key
     * 
     */
    @InputImport(name="policyName")
      private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    public DefaultKeyArgs(
        @Nullable Input<String> label,
        @Nullable Input<String> policyName) {
        this.label = label;
        this.policyName = policyName;
    }

    private DefaultKeyArgs() {
        this.label = Input.empty();
        this.policyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> label;
        private @Nullable Input<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }
        public DefaultKeyArgs build() {
            return new DefaultKeyArgs(label, policyName);
        }
    }
}
