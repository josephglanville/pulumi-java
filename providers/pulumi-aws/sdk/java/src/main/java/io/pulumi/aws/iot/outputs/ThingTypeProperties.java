// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThingTypeProperties {
    /**
     * The description of the thing type.
     * 
     */
    private final @Nullable String description;
    /**
     * A list of searchable thing attribute names.
     * 
     */
    private final @Nullable List<String> searchableAttributes;

    @CustomType.Constructor
    private ThingTypeProperties(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("searchableAttributes") @Nullable List<String> searchableAttributes) {
        this.description = description;
        this.searchableAttributes = searchableAttributes;
    }

    /**
     * The description of the thing type.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A list of searchable thing attribute names.
     * 
    */
    public List<String> getSearchableAttributes() {
        return this.searchableAttributes == null ? List.of() : this.searchableAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingTypeProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> searchableAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingTypeProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.searchableAttributes = defaults.searchableAttributes;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder searchableAttributes(@Nullable List<String> searchableAttributes) {
            this.searchableAttributes = searchableAttributes;
            return this;
        }
        public Builder searchableAttributes(String... searchableAttributes) {
            return searchableAttributes(List.of(searchableAttributes));
        }        public ThingTypeProperties build() {
            return new ThingTypeProperties(description, searchableAttributes);
        }
    }
}
