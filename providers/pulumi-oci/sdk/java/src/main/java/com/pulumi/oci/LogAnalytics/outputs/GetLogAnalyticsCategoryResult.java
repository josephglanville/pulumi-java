// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLogAnalyticsCategoryResult {
    /**
     * @return The category description.
     * 
     */
    private final String description;
    /**
     * @return The category display name.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The system flag. A value of false denotes a user-created category. A value of true denotes an Oracle-defined category.
     * 
     */
    private final Boolean isSystem;
    /**
     * @return The unique name that identifies the category.
     * 
     */
    private final String name;
    private final String namespace;
    /**
     * @return The category type. Values include &#34;PRODUCT&#34;, &#34;TIER&#34;, &#34;VENDOR&#34; and &#34;GENERIC&#34;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLogAnalyticsCategoryResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isSystem") Boolean isSystem,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.isSystem = isSystem;
        this.name = name;
        this.namespace = namespace;
        this.type = type;
    }

    /**
     * @return The category description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The category display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The system flag. A value of false denotes a user-created category. A value of true denotes an Oracle-defined category.
     * 
     */
    public Boolean isSystem() {
        return this.isSystem;
    }
    /**
     * @return The unique name that identifies the category.
     * 
     */
    public String name() {
        return this.name;
    }
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The category type. Values include &#34;PRODUCT&#34;, &#34;TIER&#34;, &#34;VENDOR&#34; and &#34;GENERIC&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogAnalyticsCategoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String id;
        private Boolean isSystem;
        private String name;
        private String namespace;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogAnalyticsCategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.isSystem = defaults.isSystem;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = Objects.requireNonNull(isSystem);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLogAnalyticsCategoryResult build() {
            return new GetLogAnalyticsCategoryResult(description, displayName, id, isSystem, name, namespace, type);
        }
    }
}
