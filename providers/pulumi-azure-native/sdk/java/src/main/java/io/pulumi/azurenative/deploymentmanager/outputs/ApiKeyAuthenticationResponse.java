// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApiKeyAuthenticationResponse {
    private final String in;
    private final String name;
    private final String type;
    private final String value;

    @OutputCustomType.Constructor({"in","name","type","value"})
    private ApiKeyAuthenticationResponse(
        String in,
        String name,
        String type,
        String value) {
        this.in = Objects.requireNonNull(in);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    public String getIn() {
        return this.in;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String in;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setIn(String in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ApiKeyAuthenticationResponse build() {
            return new ApiKeyAuthenticationResponse(in, name, type, value);
        }
    }
}
