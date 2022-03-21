// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.outputs;

import io.pulumi.awsnative.servicecatalogappregistry.outputs.ApplicationTags;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    private final @Nullable String arn;
    /**
     * The description of the application.
     * 
     */
    private final @Nullable String description;
    private final @Nullable String id;
    /**
     * The name of the application.
     * 
     */
    private final @Nullable String name;
    private final @Nullable ApplicationTags tags;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable ApplicationTags tags) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the application.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the application.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<ApplicationTags> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable ApplicationTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
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
        public Builder tags(@Nullable ApplicationTags tags) {
            this.tags = tags;
            return this;
        }        public GetApplicationResult build() {
            return new GetApplicationResult(arn, description, id, name, tags);
        }
    }
}
