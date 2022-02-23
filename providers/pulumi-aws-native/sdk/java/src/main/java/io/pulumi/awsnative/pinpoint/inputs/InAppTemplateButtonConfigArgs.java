// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.inputs;

import io.pulumi.awsnative.pinpoint.inputs.InAppTemplateDefaultButtonConfigurationArgs;
import io.pulumi.awsnative.pinpoint.inputs.InAppTemplateOverrideButtonConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InAppTemplateButtonConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InAppTemplateButtonConfigArgs Empty = new InAppTemplateButtonConfigArgs();

    @InputImport(name="android")
      private final @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> android;

    public Input<InAppTemplateOverrideButtonConfigurationArgs> getAndroid() {
        return this.android == null ? Input.empty() : this.android;
    }

    @InputImport(name="defaultConfig")
      private final @Nullable Input<InAppTemplateDefaultButtonConfigurationArgs> defaultConfig;

    public Input<InAppTemplateDefaultButtonConfigurationArgs> getDefaultConfig() {
        return this.defaultConfig == null ? Input.empty() : this.defaultConfig;
    }

    @InputImport(name="iOS")
      private final @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> iOS;

    public Input<InAppTemplateOverrideButtonConfigurationArgs> getIOS() {
        return this.iOS == null ? Input.empty() : this.iOS;
    }

    @InputImport(name="web")
      private final @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> web;

    public Input<InAppTemplateOverrideButtonConfigurationArgs> getWeb() {
        return this.web == null ? Input.empty() : this.web;
    }

    public InAppTemplateButtonConfigArgs(
        @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> android,
        @Nullable Input<InAppTemplateDefaultButtonConfigurationArgs> defaultConfig,
        @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> iOS,
        @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> web) {
        this.android = android;
        this.defaultConfig = defaultConfig;
        this.iOS = iOS;
        this.web = web;
    }

    private InAppTemplateButtonConfigArgs() {
        this.android = Input.empty();
        this.defaultConfig = Input.empty();
        this.iOS = Input.empty();
        this.web = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InAppTemplateButtonConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> android;
        private @Nullable Input<InAppTemplateDefaultButtonConfigurationArgs> defaultConfig;
        private @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> iOS;
        private @Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> web;

        public Builder() {
    	      // Empty
        }

        public Builder(InAppTemplateButtonConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.android = defaults.android;
    	      this.defaultConfig = defaults.defaultConfig;
    	      this.iOS = defaults.iOS;
    	      this.web = defaults.web;
        }

        public Builder setAndroid(@Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> android) {
            this.android = android;
            return this;
        }

        public Builder setAndroid(@Nullable InAppTemplateOverrideButtonConfigurationArgs android) {
            this.android = Input.ofNullable(android);
            return this;
        }

        public Builder setDefaultConfig(@Nullable Input<InAppTemplateDefaultButtonConfigurationArgs> defaultConfig) {
            this.defaultConfig = defaultConfig;
            return this;
        }

        public Builder setDefaultConfig(@Nullable InAppTemplateDefaultButtonConfigurationArgs defaultConfig) {
            this.defaultConfig = Input.ofNullable(defaultConfig);
            return this;
        }

        public Builder setIOS(@Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> iOS) {
            this.iOS = iOS;
            return this;
        }

        public Builder setIOS(@Nullable InAppTemplateOverrideButtonConfigurationArgs iOS) {
            this.iOS = Input.ofNullable(iOS);
            return this;
        }

        public Builder setWeb(@Nullable Input<InAppTemplateOverrideButtonConfigurationArgs> web) {
            this.web = web;
            return this;
        }

        public Builder setWeb(@Nullable InAppTemplateOverrideButtonConfigurationArgs web) {
            this.web = Input.ofNullable(web);
            return this;
        }
        public InAppTemplateButtonConfigArgs build() {
            return new InAppTemplateButtonConfigArgs(android, defaultConfig, iOS, web);
        }
    }
}
