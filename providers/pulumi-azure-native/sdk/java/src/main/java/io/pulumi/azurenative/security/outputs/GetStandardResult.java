// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.StandardComponentPropertiesResponse;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStandardResult {
    /**
     * category of the standard provided
     * 
     */
    private final @Nullable String category;
    /**
     * List of component objects containing component unique keys (such as assessment keys) to apply to standard scope.  Currently only supports assessment keys.
     * 
     */
    private final @Nullable List<StandardComponentPropertiesResponse> components;
    /**
     * description of the standard
     * 
     */
    private final @Nullable String description;
    /**
     * display name of the standard, equivalent to the standardId
     * 
     */
    private final @Nullable String displayName;
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Kind of the resource
     * 
     */
    private final @Nullable String kind;
    /**
     * Location where the resource is stored
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * standard type (Custom or BuiltIn only currently)
     * 
     */
    private final String standardType;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetStandardResult(
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("components") @Nullable List<StandardComponentPropertiesResponse> components,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("standardType") String standardType,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.category = category;
        this.components = components;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.standardType = standardType;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * category of the standard provided
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * List of component objects containing component unique keys (such as assessment keys) to apply to standard scope.  Currently only supports assessment keys.
     * 
    */
    public List<StandardComponentPropertiesResponse> getComponents() {
        return this.components == null ? List.of() : this.components;
    }
    /**
     * description of the standard
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * display name of the standard, equivalent to the standardId
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of the resource
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * standard type (Custom or BuiltIn only currently)
     * 
    */
    public String getStandardType() {
        return this.standardType;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable List<StandardComponentPropertiesResponse> components;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private String standardType;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStandardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.components = defaults.components;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.standardType = defaults.standardType;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder components(@Nullable List<StandardComponentPropertiesResponse> components) {
            this.components = components;
            return this;
        }
        public Builder components(StandardComponentPropertiesResponse... components) {
            return components(List.of(components));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder standardType(String standardType) {
            this.standardType = Objects.requireNonNull(standardType);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetStandardResult build() {
            return new GetStandardResult(category, components, description, displayName, etag, id, kind, location, name, standardType, systemData, tags, type);
        }
    }
}
