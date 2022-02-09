// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CopyActivityLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CopyActivityLogSettingsArgs Empty = new CopyActivityLogSettingsArgs();

    @InputImport(name="enableReliableLogging")
    private final @Nullable Input<Object> enableReliableLogging;

    public Input<Object> getEnableReliableLogging() {
        return this.enableReliableLogging == null ? Input.empty() : this.enableReliableLogging;
    }

    @InputImport(name="logLevel")
    private final @Nullable Input<Object> logLevel;

    public Input<Object> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    public CopyActivityLogSettingsArgs(
        @Nullable Input<Object> enableReliableLogging,
        @Nullable Input<Object> logLevel) {
        this.enableReliableLogging = enableReliableLogging;
        this.logLevel = logLevel;
    }

    private CopyActivityLogSettingsArgs() {
        this.enableReliableLogging = Input.empty();
        this.logLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> enableReliableLogging;
        private @Nullable Input<Object> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableReliableLogging = defaults.enableReliableLogging;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setEnableReliableLogging(@Nullable Input<Object> enableReliableLogging) {
            this.enableReliableLogging = enableReliableLogging;
            return this;
        }

        public Builder setEnableReliableLogging(@Nullable Object enableReliableLogging) {
            this.enableReliableLogging = Input.ofNullable(enableReliableLogging);
            return this;
        }

        public Builder setLogLevel(@Nullable Input<Object> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable Object logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public CopyActivityLogSettingsArgs build() {
            return new CopyActivityLogSettingsArgs(enableReliableLogging, logLevel);
        }
    }
}
