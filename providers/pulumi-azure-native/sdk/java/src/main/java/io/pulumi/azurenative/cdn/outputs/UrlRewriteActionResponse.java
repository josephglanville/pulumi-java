// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlRewriteActionParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlRewriteActionResponse {
    private final String name;
    private final UrlRewriteActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private UrlRewriteActionResponse(
        String name,
        UrlRewriteActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    public String getName() {
        return this.name;
    }
    public UrlRewriteActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlRewriteActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlRewriteActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public UrlRewriteActionResponse build() {
            return new UrlRewriteActionResponse(name, parameters);
        }
    }
}
