// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the formal API definition for the app.
 * 
 */
public final class ApiDefinitionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiDefinitionInfoResponse Empty = new ApiDefinitionInfoResponse();

    /**
     * The URL of the API definition.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public ApiDefinitionInfoResponse(@Nullable String url) {
        this.url = url;
    }

    private ApiDefinitionInfoResponse() {
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDefinitionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDefinitionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ApiDefinitionInfoResponse build() {
            return new ApiDefinitionInfoResponse(url);
        }
    }
}
