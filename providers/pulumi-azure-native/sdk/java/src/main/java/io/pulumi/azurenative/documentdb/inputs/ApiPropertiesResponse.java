// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiPropertiesResponse Empty = new ApiPropertiesResponse();

    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
     */
    @InputImport(name="serverVersion")
      private final @Nullable String serverVersion;

    public Optional<String> getServerVersion() {
        return this.serverVersion == null ? Optional.empty() : Optional.ofNullable(this.serverVersion);
    }

    public ApiPropertiesResponse(@Nullable String serverVersion) {
        this.serverVersion = serverVersion;
    }

    private ApiPropertiesResponse() {
        this.serverVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverVersion = defaults.serverVersion;
        }

        public Builder setServerVersion(@Nullable String serverVersion) {
            this.serverVersion = serverVersion;
            return this;
        }
        public ApiPropertiesResponse build() {
            return new ApiPropertiesResponse(serverVersion);
        }
    }
}
