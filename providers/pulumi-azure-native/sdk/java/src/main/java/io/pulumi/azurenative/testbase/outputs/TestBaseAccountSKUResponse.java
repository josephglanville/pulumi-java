// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.TestBaseAccountSKUCapabilityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TestBaseAccountSKUResponse {
    /**
     * The capabilities of a SKU.
     * 
     */
    private final List<TestBaseAccountSKUCapabilityResponse> capabilities;
    /**
     * The locations that the SKU is available.
     * 
     */
    private final @Nullable List<String> locations;
    /**
     * The name of the SKU. This is typically a letter + number code, such as B0 or S0.
     * 
     */
    private final String name;
    /**
     * The type of resource the SKU applies to.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * The tier of this particular SKU.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private TestBaseAccountSKUResponse(
        @CustomType.Parameter("capabilities") List<TestBaseAccountSKUCapabilityResponse> capabilities,
        @CustomType.Parameter("locations") @Nullable List<String> locations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("tier") String tier) {
        this.capabilities = capabilities;
        this.locations = locations;
        this.name = name;
        this.resourceType = resourceType;
        this.tier = tier;
    }

    /**
     * The capabilities of a SKU.
     * 
    */
    public List<TestBaseAccountSKUCapabilityResponse> getCapabilities() {
        return this.capabilities;
    }
    /**
     * The locations that the SKU is available.
     * 
    */
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * The name of the SKU. This is typically a letter + number code, such as B0 or S0.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of resource the SKU applies to.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * The tier of this particular SKU.
     * 
    */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestBaseAccountSKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestBaseAccountSKUCapabilityResponse> capabilities;
        private @Nullable List<String> locations;
        private String name;
        private @Nullable String resourceType;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(TestBaseAccountSKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.resourceType = defaults.resourceType;
    	      this.tier = defaults.tier;
        }

        public Builder capabilities(List<TestBaseAccountSKUCapabilityResponse> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder capabilities(TestBaseAccountSKUCapabilityResponse... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public TestBaseAccountSKUResponse build() {
            return new TestBaseAccountSKUResponse(capabilities, locations, name, resourceType, tier);
        }
    }
}
