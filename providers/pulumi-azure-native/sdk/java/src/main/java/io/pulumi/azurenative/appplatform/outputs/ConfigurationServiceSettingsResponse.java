// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.ConfigurationServiceGitPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationServiceSettingsResponse {
    private final @Nullable ConfigurationServiceGitPropertyResponse gitProperty;

    @OutputCustomType.Constructor({"gitProperty"})
    private ConfigurationServiceSettingsResponse(@Nullable ConfigurationServiceGitPropertyResponse gitProperty) {
        this.gitProperty = gitProperty;
    }

    public Optional<ConfigurationServiceGitPropertyResponse> getGitProperty() {
        return Optional.ofNullable(this.gitProperty);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationServiceGitPropertyResponse gitProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gitProperty = defaults.gitProperty;
        }

        public Builder setGitProperty(@Nullable ConfigurationServiceGitPropertyResponse gitProperty) {
            this.gitProperty = gitProperty;
            return this;
        }

        public ConfigurationServiceSettingsResponse build() {
            return new ConfigurationServiceSettingsResponse(gitProperty);
        }
    }
}
