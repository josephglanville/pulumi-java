// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainReplicaRegion {
    /**
     * @return A REPLICATION_ENABLED region, e.g. us-ashburn-1. See [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm) for the full list of supported region names.
     * 
     */
    private final String region;
    /**
     * @return The current state.
     * 
     */
    private final String state;
    /**
     * @return Region agnostic domain URL.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetDomainReplicaRegion(
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("url") String url) {
        this.region = region;
        this.state = state;
        this.url = url;
    }

    /**
     * @return A REPLICATION_ENABLED region, e.g. us-ashburn-1. See [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm) for the full list of supported region names.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Region agnostic domain URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainReplicaRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String state;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainReplicaRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.state = defaults.state;
    	      this.url = defaults.url;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetDomainReplicaRegion build() {
            return new GetDomainReplicaRegion(region, state, url);
        }
    }
}
