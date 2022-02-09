// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.GeoFilterActions;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GeoFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GeoFilterArgs Empty = new GeoFilterArgs();

    @InputImport(name="action", required=true)
    private final Input<GeoFilterActions> action;

    public Input<GeoFilterActions> getAction() {
        return this.action;
    }

    @InputImport(name="countryCodes", required=true)
    private final Input<List<String>> countryCodes;

    public Input<List<String>> getCountryCodes() {
        return this.countryCodes;
    }

    @InputImport(name="relativePath", required=true)
    private final Input<String> relativePath;

    public Input<String> getRelativePath() {
        return this.relativePath;
    }

    public GeoFilterArgs(
        Input<GeoFilterActions> action,
        Input<List<String>> countryCodes,
        Input<String> relativePath) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.relativePath = Objects.requireNonNull(relativePath, "expected parameter 'relativePath' to be non-null");
    }

    private GeoFilterArgs() {
        this.action = Input.empty();
        this.countryCodes = Input.empty();
        this.relativePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GeoFilterActions> action;
        private Input<List<String>> countryCodes;
        private Input<String> relativePath;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.countryCodes = defaults.countryCodes;
    	      this.relativePath = defaults.relativePath;
        }

        public Builder setAction(Input<GeoFilterActions> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(GeoFilterActions action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setCountryCodes(Input<List<String>> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }

        public Builder setCountryCodes(List<String> countryCodes) {
            this.countryCodes = Input.of(Objects.requireNonNull(countryCodes));
            return this;
        }

        public Builder setRelativePath(Input<String> relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }

        public Builder setRelativePath(String relativePath) {
            this.relativePath = Input.of(Objects.requireNonNull(relativePath));
            return this;
        }

        public GeoFilterArgs build() {
            return new GeoFilterArgs(action, countryCodes, relativePath);
        }
    }
}
