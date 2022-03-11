// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An API Version Set contains the common configuration for a set of API Versions relating
 * 
 */
public final class ApiVersionSetContractDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiVersionSetContractDetailsArgs Empty = new ApiVersionSetContractDetailsArgs();

    /**
     * Description of API Version Set.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Identifier for existing API Version Set. Omit this value to create a new Version Set.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The display Name of the API Version Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     * 
     */
    @InputImport(name="versionHeaderName")
      private final @Nullable Output<String> versionHeaderName;

    public Output<String> getVersionHeaderName() {
        return this.versionHeaderName == null ? Output.empty() : this.versionHeaderName;
    }

    /**
     * Name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     * 
     */
    @InputImport(name="versionQueryName")
      private final @Nullable Output<String> versionQueryName;

    public Output<String> getVersionQueryName() {
        return this.versionQueryName == null ? Output.empty() : this.versionQueryName;
    }

    /**
     * An value that determines where the API Version identifier will be located in a HTTP request.
     * 
     */
    @InputImport(name="versioningScheme")
      private final @Nullable Output<String> versioningScheme;

    public Output<String> getVersioningScheme() {
        return this.versioningScheme == null ? Output.empty() : this.versioningScheme;
    }

    public ApiVersionSetContractDetailsArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> versionHeaderName,
        @Nullable Output<String> versionQueryName,
        @Nullable Output<String> versioningScheme) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.versionHeaderName = versionHeaderName;
        this.versionQueryName = versionQueryName;
        this.versioningScheme = versioningScheme;
    }

    private ApiVersionSetContractDetailsArgs() {
        this.description = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.versionHeaderName = Output.empty();
        this.versionQueryName = Output.empty();
        this.versioningScheme = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiVersionSetContractDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> versionHeaderName;
        private @Nullable Output<String> versionQueryName;
        private @Nullable Output<String> versioningScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiVersionSetContractDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.versionHeaderName = defaults.versionHeaderName;
    	      this.versionQueryName = defaults.versionQueryName;
    	      this.versioningScheme = defaults.versioningScheme;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder versionHeaderName(@Nullable Output<String> versionHeaderName) {
            this.versionHeaderName = versionHeaderName;
            return this;
        }

        public Builder versionHeaderName(@Nullable String versionHeaderName) {
            this.versionHeaderName = Output.ofNullable(versionHeaderName);
            return this;
        }

        public Builder versionQueryName(@Nullable Output<String> versionQueryName) {
            this.versionQueryName = versionQueryName;
            return this;
        }

        public Builder versionQueryName(@Nullable String versionQueryName) {
            this.versionQueryName = Output.ofNullable(versionQueryName);
            return this;
        }

        public Builder versioningScheme(@Nullable Output<String> versioningScheme) {
            this.versioningScheme = versioningScheme;
            return this;
        }

        public Builder versioningScheme(@Nullable String versioningScheme) {
            this.versioningScheme = Output.ofNullable(versioningScheme);
            return this;
        }
        public ApiVersionSetContractDetailsArgs build() {
            return new ApiVersionSetContractDetailsArgs(description, id, name, versionHeaderName, versionQueryName, versioningScheme);
        }
    }
}
