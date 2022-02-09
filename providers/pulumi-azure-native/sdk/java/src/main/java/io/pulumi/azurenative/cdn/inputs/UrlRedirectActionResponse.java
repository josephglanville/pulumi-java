// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlRedirectActionParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UrlRedirectActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlRedirectActionResponse Empty = new UrlRedirectActionResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parameters", required=true)
    private final UrlRedirectActionParametersResponse parameters;

    public UrlRedirectActionParametersResponse getParameters() {
        return this.parameters;
    }

    public UrlRedirectActionResponse(
        String name,
        UrlRedirectActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private UrlRedirectActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlRedirectActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlRedirectActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public UrlRedirectActionResponse build() {
            return new UrlRedirectActionResponse(name, parameters);
        }
    }
}
