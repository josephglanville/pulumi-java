// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DiskConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskConfigResponse Empty = new DiskConfigResponse();

    @InputImport(name="bootDiskSizeGb", required=true)
    private final Integer bootDiskSizeGb;

    public Integer getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }

    @InputImport(name="bootDiskType", required=true)
    private final String bootDiskType;

    public String getBootDiskType() {
        return this.bootDiskType;
    }

    @InputImport(name="localSsdInterface", required=true)
    private final String localSsdInterface;

    public String getLocalSsdInterface() {
        return this.localSsdInterface;
    }

    @InputImport(name="numLocalSsds", required=true)
    private final Integer numLocalSsds;

    public Integer getNumLocalSsds() {
        return this.numLocalSsds;
    }

    public DiskConfigResponse(
        Integer bootDiskSizeGb,
        String bootDiskType,
        String localSsdInterface,
        Integer numLocalSsds) {
        this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb, "expected parameter 'bootDiskSizeGb' to be non-null");
        this.bootDiskType = Objects.requireNonNull(bootDiskType, "expected parameter 'bootDiskType' to be non-null");
        this.localSsdInterface = Objects.requireNonNull(localSsdInterface, "expected parameter 'localSsdInterface' to be non-null");
        this.numLocalSsds = Objects.requireNonNull(numLocalSsds, "expected parameter 'numLocalSsds' to be non-null");
    }

    private DiskConfigResponse() {
        this.bootDiskSizeGb = null;
        this.bootDiskType = null;
        this.localSsdInterface = null;
        this.numLocalSsds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bootDiskSizeGb;
        private String bootDiskType;
        private String localSsdInterface;
        private Integer numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.localSsdInterface = defaults.localSsdInterface;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder setBootDiskSizeGb(Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(String bootDiskType) {
            this.bootDiskType = Objects.requireNonNull(bootDiskType);
            return this;
        }

        public Builder setLocalSsdInterface(String localSsdInterface) {
            this.localSsdInterface = Objects.requireNonNull(localSsdInterface);
            return this;
        }

        public Builder setNumLocalSsds(Integer numLocalSsds) {
            this.numLocalSsds = Objects.requireNonNull(numLocalSsds);
            return this;
        }

        public DiskConfigResponse build() {
            return new DiskConfigResponse(bootDiskSizeGb, bootDiskType, localSsdInterface, numLocalSsds);
        }
    }
}