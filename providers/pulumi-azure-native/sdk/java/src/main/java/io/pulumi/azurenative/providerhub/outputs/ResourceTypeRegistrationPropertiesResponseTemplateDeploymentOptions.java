// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions {
    private final @Nullable List<String> preflightOptions;
    private final @Nullable Boolean preflightSupported;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions(
        @CustomType.Parameter("preflightOptions") @Nullable List<String> preflightOptions,
        @CustomType.Parameter("preflightSupported") @Nullable Boolean preflightSupported) {
        this.preflightOptions = preflightOptions;
        this.preflightSupported = preflightSupported;
    }

    public List<String> getPreflightOptions() {
        return this.preflightOptions == null ? List.of() : this.preflightOptions;
    }
    public Optional<Boolean> getPreflightSupported() {
        return Optional.ofNullable(this.preflightSupported);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> preflightOptions;
        private @Nullable Boolean preflightSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preflightOptions = defaults.preflightOptions;
    	      this.preflightSupported = defaults.preflightSupported;
        }

        public Builder preflightOptions(@Nullable List<String> preflightOptions) {
            this.preflightOptions = preflightOptions;
            return this;
        }
        public Builder preflightOptions(String... preflightOptions) {
            return preflightOptions(List.of(preflightOptions));
        }
        public Builder preflightSupported(@Nullable Boolean preflightSupported) {
            this.preflightSupported = preflightSupported;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions(preflightOptions, preflightSupported);
        }
    }
}
