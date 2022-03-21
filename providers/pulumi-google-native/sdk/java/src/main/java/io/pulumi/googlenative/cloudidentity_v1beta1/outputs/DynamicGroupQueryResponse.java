// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DynamicGroupQueryResponse {
    /**
     * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department=='engineering')` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' && loc.building_id=='bar')` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase('jOhn DoE')`
     * 
     */
    private final String query;
    private final String resourceType;

    @CustomType.Constructor
    private DynamicGroupQueryResponse(
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.query = query;
        this.resourceType = resourceType;
    }

    /**
     * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department=='engineering')` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area=='foo' && loc.building_id=='bar')` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase('jOhn DoE')`
     * 
    */
    public String getQuery() {
        return this.query;
    }
    public String getPropResourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public DynamicGroupQueryResponse build() {
            return new DynamicGroupQueryResponse(query, resourceType);
        }
    }
}
