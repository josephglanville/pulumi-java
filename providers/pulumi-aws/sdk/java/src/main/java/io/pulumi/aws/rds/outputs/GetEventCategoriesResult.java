// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventCategoriesResult {
    /**
     * A list of the event categories.
     * 
     */
    private final List<String> eventCategories;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String sourceType;

    @CustomType.Constructor
    private GetEventCategoriesResult(
        @CustomType.Parameter("eventCategories") List<String> eventCategories,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("sourceType") @Nullable String sourceType) {
        this.eventCategories = eventCategories;
        this.id = id;
        this.sourceType = sourceType;
    }

    /**
     * A list of the event categories.
     * 
    */
    public List<String> getEventCategories() {
        return this.eventCategories;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventCategoriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> eventCategories;
        private String id;
        private @Nullable String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventCategoriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventCategories = defaults.eventCategories;
    	      this.id = defaults.id;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder eventCategories(List<String> eventCategories) {
            this.eventCategories = Objects.requireNonNull(eventCategories);
            return this;
        }
        public Builder eventCategories(String... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }        public GetEventCategoriesResult build() {
            return new GetEventCategoriesResult(eventCategories, id, sourceType);
        }
    }
}