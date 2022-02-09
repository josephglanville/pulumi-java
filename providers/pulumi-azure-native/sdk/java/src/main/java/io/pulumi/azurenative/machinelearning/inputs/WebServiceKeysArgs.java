// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebServiceKeysArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServiceKeysArgs Empty = new WebServiceKeysArgs();

    @InputImport(name="primary")
    private final @Nullable Input<String> primary;

    public Input<String> getPrimary() {
        return this.primary == null ? Input.empty() : this.primary;
    }

    @InputImport(name="secondary")
    private final @Nullable Input<String> secondary;

    public Input<String> getSecondary() {
        return this.secondary == null ? Input.empty() : this.secondary;
    }

    public WebServiceKeysArgs(
        @Nullable Input<String> primary,
        @Nullable Input<String> secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    private WebServiceKeysArgs() {
        this.primary = Input.empty();
        this.secondary = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> primary;
        private @Nullable Input<String> secondary;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        public Builder setPrimary(@Nullable Input<String> primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrimary(@Nullable String primary) {
            this.primary = Input.ofNullable(primary);
            return this;
        }

        public Builder setSecondary(@Nullable Input<String> secondary) {
            this.secondary = secondary;
            return this;
        }

        public Builder setSecondary(@Nullable String secondary) {
            this.secondary = Input.ofNullable(secondary);
            return this;
        }

        public WebServiceKeysArgs build() {
            return new WebServiceKeysArgs(primary, secondary);
        }
    }
}
