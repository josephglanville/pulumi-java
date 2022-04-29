// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeployEnvironmentComputeInstanceGroupSelectorsItem {
    /**
     * @return (Updatable) Compute instance OCID identifiers that are members of this group.
     * 
     */
    private final @Nullable List<String> computeInstanceIds;
    /**
     * @return (Updatable) Query expression confirming to the Oracle Cloud Infrastructure Search Language syntax to select compute instances for the group. The language is documented at https://docs.oracle.com/en-us/iaas/Content/Search/Concepts/querysyntax.htm
     * 
     */
    private final @Nullable String query;
    /**
     * @return (Updatable) Region identifier referred by the deployment environment. Region identifiers are listed at https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm
     * 
     */
    private final @Nullable String region;
    /**
     * @return (Updatable) Defines the type of the instance selector for the group.
     * 
     */
    private final String selectorType;

    @CustomType.Constructor
    private DeployEnvironmentComputeInstanceGroupSelectorsItem(
        @CustomType.Parameter("computeInstanceIds") @Nullable List<String> computeInstanceIds,
        @CustomType.Parameter("query") @Nullable String query,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("selectorType") String selectorType) {
        this.computeInstanceIds = computeInstanceIds;
        this.query = query;
        this.region = region;
        this.selectorType = selectorType;
    }

    /**
     * @return (Updatable) Compute instance OCID identifiers that are members of this group.
     * 
     */
    public List<String> computeInstanceIds() {
        return this.computeInstanceIds == null ? List.of() : this.computeInstanceIds;
    }
    /**
     * @return (Updatable) Query expression confirming to the Oracle Cloud Infrastructure Search Language syntax to select compute instances for the group. The language is documented at https://docs.oracle.com/en-us/iaas/Content/Search/Concepts/querysyntax.htm
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return (Updatable) Region identifier referred by the deployment environment. Region identifiers are listed at https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return (Updatable) Defines the type of the instance selector for the group.
     * 
     */
    public String selectorType() {
        return this.selectorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployEnvironmentComputeInstanceGroupSelectorsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> computeInstanceIds;
        private @Nullable String query;
        private @Nullable String region;
        private String selectorType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeployEnvironmentComputeInstanceGroupSelectorsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeInstanceIds = defaults.computeInstanceIds;
    	      this.query = defaults.query;
    	      this.region = defaults.region;
    	      this.selectorType = defaults.selectorType;
        }

        public Builder computeInstanceIds(@Nullable List<String> computeInstanceIds) {
            this.computeInstanceIds = computeInstanceIds;
            return this;
        }
        public Builder computeInstanceIds(String... computeInstanceIds) {
            return computeInstanceIds(List.of(computeInstanceIds));
        }
        public Builder query(@Nullable String query) {
            this.query = query;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder selectorType(String selectorType) {
            this.selectorType = Objects.requireNonNull(selectorType);
            return this;
        }        public DeployEnvironmentComputeInstanceGroupSelectorsItem build() {
            return new DeployEnvironmentComputeInstanceGroupSelectorsItem(computeInstanceIds, query, region, selectorType);
        }
    }
}
