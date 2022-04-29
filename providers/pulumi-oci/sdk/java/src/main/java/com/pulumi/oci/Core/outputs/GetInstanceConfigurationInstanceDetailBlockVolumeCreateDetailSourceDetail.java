// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail {
    /**
     * @return The OCID of the volume backup.
     * 
     */
    private final String id;
    /**
     * @return The type of action to run when the instance is interrupted for eviction.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * @return The OCID of the volume backup.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of action to run when the instance is interrupted for eviction.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail build() {
            return new GetInstanceConfigurationInstanceDetailBlockVolumeCreateDetailSourceDetail(id, type);
        }
    }
}
