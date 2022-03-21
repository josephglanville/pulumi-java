// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiVersionSetContractDetailsResponse {
    /**
     * Description of API Version Set.
     * 
     */
    private final @Nullable String description;
    /**
     * Identifier for existing API Version Set. Omit this value to create a new Version Set.
     * 
     */
    private final @Nullable String id;
    /**
     * The display Name of the API Version Set.
     * 
     */
    private final @Nullable String name;
    /**
     * Name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     * 
     */
    private final @Nullable String versionHeaderName;
    /**
     * Name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     * 
     */
    private final @Nullable String versionQueryName;
    /**
     * An value that determines where the API Version identifier will be located in a HTTP request.
     * 
     */
    private final @Nullable String versioningScheme;

    @CustomType.Constructor
    private ApiVersionSetContractDetailsResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("versionHeaderName") @Nullable String versionHeaderName,
        @CustomType.Parameter("versionQueryName") @Nullable String versionQueryName,
        @CustomType.Parameter("versioningScheme") @Nullable String versioningScheme) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.versionHeaderName = versionHeaderName;
        this.versionQueryName = versionQueryName;
        this.versioningScheme = versioningScheme;
    }

    /**
     * Description of API Version Set.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Identifier for existing API Version Set. Omit this value to create a new Version Set.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The display Name of the API Version Set.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     * 
    */
    public Optional<String> getVersionHeaderName() {
        return Optional.ofNullable(this.versionHeaderName);
    }
    /**
     * Name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     * 
    */
    public Optional<String> getVersionQueryName() {
        return Optional.ofNullable(this.versionQueryName);
    }
    /**
     * An value that determines where the API Version identifier will be located in a HTTP request.
     * 
    */
    public Optional<String> getVersioningScheme() {
        return Optional.ofNullable(this.versioningScheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiVersionSetContractDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String versionHeaderName;
        private @Nullable String versionQueryName;
        private @Nullable String versioningScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiVersionSetContractDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.versionHeaderName = defaults.versionHeaderName;
    	      this.versionQueryName = defaults.versionQueryName;
    	      this.versioningScheme = defaults.versioningScheme;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder versionHeaderName(@Nullable String versionHeaderName) {
            this.versionHeaderName = versionHeaderName;
            return this;
        }
        public Builder versionQueryName(@Nullable String versionQueryName) {
            this.versionQueryName = versionQueryName;
            return this;
        }
        public Builder versioningScheme(@Nullable String versioningScheme) {
            this.versioningScheme = versioningScheme;
            return this;
        }        public ApiVersionSetContractDetailsResponse build() {
            return new ApiVersionSetContractDetailsResponse(description, id, name, versionHeaderName, versionQueryName, versioningScheme);
        }
    }
}
