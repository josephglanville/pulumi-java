// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceSourceDetail {
    /**
     * @return The size of the boot volume in GBs. Minimum value is 50 GB and maximum value is 32,768 GB (32 TB).
     * 
     */
    private final String bootVolumeSizeInGbs;
    /**
     * @return The OCID of the Key Management key to assign as the master encryption key for the boot volume.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return The OCID of an image or a boot volume to use, depending on the value of `source_type`.
     * 
     */
    private final String sourceId;
    /**
     * @return The source type for the instance. Use `image` when specifying the image OCID. Use `bootVolume` when specifying the boot volume OCID.
     * 
     */
    private final String sourceType;

    @CustomType.Constructor
    private GetInstancesInstanceSourceDetail(
        @CustomType.Parameter("bootVolumeSizeInGbs") String bootVolumeSizeInGbs,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("sourceId") String sourceId,
        @CustomType.Parameter("sourceType") String sourceType) {
        this.bootVolumeSizeInGbs = bootVolumeSizeInGbs;
        this.kmsKeyId = kmsKeyId;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
    }

    /**
     * @return The size of the boot volume in GBs. Minimum value is 50 GB and maximum value is 32,768 GB (32 TB).
     * 
     */
    public String bootVolumeSizeInGbs() {
        return this.bootVolumeSizeInGbs;
    }
    /**
     * @return The OCID of the Key Management key to assign as the master encryption key for the boot volume.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return The OCID of an image or a boot volume to use, depending on the value of `source_type`.
     * 
     */
    public String sourceId() {
        return this.sourceId;
    }
    /**
     * @return The source type for the instance. Use `image` when specifying the image OCID. Use `bootVolume` when specifying the boot volume OCID.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceSourceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootVolumeSizeInGbs;
        private String kmsKeyId;
        private String sourceId;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstanceSourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootVolumeSizeInGbs = defaults.bootVolumeSizeInGbs;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.sourceId = defaults.sourceId;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder bootVolumeSizeInGbs(String bootVolumeSizeInGbs) {
            this.bootVolumeSizeInGbs = Objects.requireNonNull(bootVolumeSizeInGbs);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }        public GetInstancesInstanceSourceDetail build() {
            return new GetInstancesInstanceSourceDetail(bootVolumeSizeInGbs, kmsKeyId, sourceId, sourceType);
        }
    }
}
