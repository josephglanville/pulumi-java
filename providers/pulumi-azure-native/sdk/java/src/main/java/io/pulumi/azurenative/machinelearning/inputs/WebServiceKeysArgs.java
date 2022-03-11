// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Access keys for the web service calls.
 * 
 */
public final class WebServiceKeysArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServiceKeysArgs Empty = new WebServiceKeysArgs();

    /**
     * The primary access key.
     * 
     */
    @InputImport(name="primary")
      private final @Nullable Output<String> primary;

    public Output<String> getPrimary() {
        return this.primary == null ? Output.empty() : this.primary;
    }

    /**
     * The secondary access key.
     * 
     */
    @InputImport(name="secondary")
      private final @Nullable Output<String> secondary;

    public Output<String> getSecondary() {
        return this.secondary == null ? Output.empty() : this.secondary;
    }

    public WebServiceKeysArgs(
        @Nullable Output<String> primary,
        @Nullable Output<String> secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    private WebServiceKeysArgs() {
        this.primary = Output.empty();
        this.secondary = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> primary;
        private @Nullable Output<String> secondary;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        public Builder primary(@Nullable Output<String> primary) {
            this.primary = primary;
            return this;
        }

        public Builder primary(@Nullable String primary) {
            this.primary = Output.ofNullable(primary);
            return this;
        }

        public Builder secondary(@Nullable Output<String> secondary) {
            this.secondary = secondary;
            return this;
        }

        public Builder secondary(@Nullable String secondary) {
            this.secondary = Output.ofNullable(secondary);
            return this;
        }
        public WebServiceKeysArgs build() {
            return new WebServiceKeysArgs(primary, secondary);
        }
    }
}
