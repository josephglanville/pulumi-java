// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.RoutingSource;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutePropertiesArgs Empty = new RoutePropertiesArgs();

    @InputImport(name="condition")
    private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="endpointNames", required=true)
    private final Input<List<String>> endpointNames;

    public Input<List<String>> getEndpointNames() {
        return this.endpointNames;
    }

    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="source", required=true)
    private final Input<Either<String,RoutingSource>> source;

    public Input<Either<String,RoutingSource>> getSource() {
        return this.source;
    }

    public RoutePropertiesArgs(
        @Nullable Input<String> condition,
        Input<List<String>> endpointNames,
        Input<Boolean> isEnabled,
        Input<String> name,
        Input<Either<String,RoutingSource>> source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private RoutePropertiesArgs() {
        this.condition = Input.empty();
        this.endpointNames = Input.empty();
        this.isEnabled = Input.empty();
        this.name = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private Input<List<String>> endpointNames;
        private Input<Boolean> isEnabled;
        private Input<String> name;
        private Input<Either<String,RoutingSource>> source;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEndpointNames(Input<List<String>> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Input.of(Objects.requireNonNull(endpointNames));
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSource(Input<Either<String,RoutingSource>> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(Either<String,RoutingSource> source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public RoutePropertiesArgs build() {
            return new RoutePropertiesArgs(condition, endpointNames, isEnabled, name, source);
        }
    }
}
