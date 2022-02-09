// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpSettingsRoutesResponse {
    private final @Nullable String apiPrefix;

    @OutputCustomType.Constructor({"apiPrefix"})
    private HttpSettingsRoutesResponse(@Nullable String apiPrefix) {
        this.apiPrefix = apiPrefix;
    }

    public Optional<String> getApiPrefix() {
        return Optional.ofNullable(this.apiPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpSettingsRoutesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpSettingsRoutesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPrefix = defaults.apiPrefix;
        }

        public Builder setApiPrefix(@Nullable String apiPrefix) {
            this.apiPrefix = apiPrefix;
            return this;
        }

        public HttpSettingsRoutesResponse build() {
            return new HttpSettingsRoutesResponse(apiPrefix);
        }
    }
}
