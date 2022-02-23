// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsConfigurationArgs Empty = new WindowsConfigurationArgs();

    /**
     * If omitted, the default value is true.
     * 
     */
    @InputImport(name="enableAutomaticUpdates")
      private final @Nullable Input<Boolean> enableAutomaticUpdates;

    public Input<Boolean> getEnableAutomaticUpdates() {
        return this.enableAutomaticUpdates == null ? Input.empty() : this.enableAutomaticUpdates;
    }

    public WindowsConfigurationArgs(@Nullable Input<Boolean> enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }

    private WindowsConfigurationArgs() {
        this.enableAutomaticUpdates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableAutomaticUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutomaticUpdates = defaults.enableAutomaticUpdates;
        }

        public Builder setEnableAutomaticUpdates(@Nullable Input<Boolean> enableAutomaticUpdates) {
            this.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }

        public Builder setEnableAutomaticUpdates(@Nullable Boolean enableAutomaticUpdates) {
            this.enableAutomaticUpdates = Input.ofNullable(enableAutomaticUpdates);
            return this;
        }
        public WindowsConfigurationArgs build() {
            return new WindowsConfigurationArgs(enableAutomaticUpdates);
        }
    }
}
