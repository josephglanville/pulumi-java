// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Part of Subscription diagnostic setting. Specifies the settings for a particular log.
 * 
 */
public final class SubscriptionLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionLogSettingsArgs Empty = new SubscriptionLogSettingsArgs();

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    @InputImport(name="category")
      private final @Nullable Input<String> category;

    public Input<String> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    /**
     * a value indicating whether this log is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public SubscriptionLogSettingsArgs(
        @Nullable Input<String> category,
        Input<Boolean> enabled) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private SubscriptionLogSettingsArgs() {
        this.category = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> category;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCategory(@Nullable Input<String> category) {
            this.category = category;
            return this;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = Input.ofNullable(category);
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
        public SubscriptionLogSettingsArgs build() {
            return new SubscriptionLogSettingsArgs(category, enabled);
        }
    }
}
