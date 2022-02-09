// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ManagementGroupLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementGroupLogSettingsArgs Empty = new ManagementGroupLogSettingsArgs();

    @InputImport(name="category", required=true)
    private final Input<String> category;

    public Input<String> getCategory() {
        return this.category;
    }

    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public ManagementGroupLogSettingsArgs(
        Input<String> category,
        Input<Boolean> enabled) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ManagementGroupLogSettingsArgs() {
        this.category = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> category;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCategory(Input<String> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setCategory(String category) {
            this.category = Input.of(Objects.requireNonNull(category));
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public ManagementGroupLogSettingsArgs build() {
            return new ManagementGroupLogSettingsArgs(category, enabled);
        }
    }
}
