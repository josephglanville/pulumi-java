// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FallbackRoutePropertiesResponse {
    private final @Nullable String condition;
    private final List<String> endpointNames;
    private final Boolean isEnabled;
    private final @Nullable String name;
    private final String source;

    @OutputCustomType.Constructor({"condition","endpointNames","isEnabled","name","source"})
    private FallbackRoutePropertiesResponse(
        @Nullable String condition,
        List<String> endpointNames,
        Boolean isEnabled,
        @Nullable String name,
        String source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.name = name;
        this.source = Objects.requireNonNull(source);
    }

    public Optional<String> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    public List<String> getEndpointNames() {
        return this.endpointNames;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackRoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private @Nullable String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(FallbackRoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public FallbackRoutePropertiesResponse build() {
            return new FallbackRoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}
