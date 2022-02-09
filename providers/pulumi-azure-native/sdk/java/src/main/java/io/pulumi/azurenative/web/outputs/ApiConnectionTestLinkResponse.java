// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiConnectionTestLinkResponse {
    private final @Nullable String method;
    private final @Nullable String requestUri;

    @OutputCustomType.Constructor({"method","requestUri"})
    private ApiConnectionTestLinkResponse(
        @Nullable String method,
        @Nullable String requestUri) {
        this.method = method;
        this.requestUri = requestUri;
    }

    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    public Optional<String> getRequestUri() {
        return Optional.ofNullable(this.requestUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConnectionTestLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String requestUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConnectionTestLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setRequestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }

        public ApiConnectionTestLinkResponse build() {
            return new ApiConnectionTestLinkResponse(method, requestUri);
        }
    }
}
