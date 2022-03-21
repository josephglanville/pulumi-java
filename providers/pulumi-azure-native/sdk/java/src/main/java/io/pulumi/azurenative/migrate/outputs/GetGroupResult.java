// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.GroupPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGroupResult {
    /**
     * For optimistic concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Path reference to this group. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/groups/{groupName}
     * 
     */
    private final String id;
    /**
     * Name of the group.
     * 
     */
    private final String name;
    /**
     * Properties of the group.
     * 
     */
    private final GroupPropertiesResponse properties;
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/groups].
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") GroupPropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * For optimistic concurrency control.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Path reference to this group. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/groups/{groupName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the group.
     * 
    */
    public GroupPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/groups].
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private String name;
        private GroupPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(GroupPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGroupResult build() {
            return new GetGroupResult(eTag, id, name, properties, type);
        }
    }
}
